package com.example.demo5.service.impl;

import com.example.demo5.domain.AgentDayReportRO;
import com.example.demo5.mapper.ReportMapper;
import com.example.demo5.service.ReportService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

@Service
public class ReportServiceImpl implements ReportService {

    private final ReportMapper reportMapper;

    @Autowired
    public ReportServiceImpl(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }

    @Override
    public List<AgentDayReportRO> getList(String account , String data, String table) {

        // 1. 查询所有有静态数据的代理
        // 2. 查询出代理月静态数据,和此月每天数据
        // 3. 每天投注人数统计去重
        // 4. 修改月静态投注人数(组装update语句输出文件)

        // "2019-09"
        List<AgentDayReportRO> agentList = reportMapper.getListOfMonth(data, account);

        List<AgentDayReportRO> listAll = reportMapper.getList(data + "-", null);
        Map<String, List<AgentDayReportRO>> map = listAll.stream().collect(groupingBy(AgentDayReportRO::getAccount));

        String sql = null;
        for (AgentDayReportRO agentDayReportRO : agentList) {
            // List<AgentDayReportRO> list = reportMapper.getList(data + "-", agentDayReportRO.getAccount());
            List<AgentDayReportRO> list = map.get(agentDayReportRO.getAccount());
            // 去重集合
            HashSet<String> strings = new HashSet<>();
            for (AgentDayReportRO dayReportRO : list) {
                String betNumberList = dayReportRO.getBetNumberList();
                if (StringUtils.isEmpty(betNumberList)) continue;
                String[] split = betNumberList.split(",");
                strings.addAll(Arrays.asList(split));
            }

            String result = org.apache.commons.lang.StringUtils.join(strings, ",");
            if (StringUtils.isEmpty(result)) continue;

            sql = "UPDATE " + table + " SET betNumberList = \"" + result + "\" WHERE id = " + agentDayReportRO.getId() + " ; \n" ;

            writeToFileWithCommonsIO(sql);
        }
        System.out.println(agentList.size());

        return null;
    }

    private void writeToFileWithCommonsIO(String data){
        String path = "D:/file/";
        String filename = "test.txt";
        try {
            byte[] sourceBytes = data.getBytes(StandardCharsets.UTF_8);
            FileUtils.writeByteArrayToFile( new File(path+filename), sourceBytes,true);//这里的false代表写入的文件是从头开始重新写入，或者理解为清空文件内容后重新写；若为true,则是接着原本文件内容的结尾开始写
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage() + "");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("===结束啦===");
        }
    }

}