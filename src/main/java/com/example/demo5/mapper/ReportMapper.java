package com.example.demo5.mapper;


import com.example.demo5.domain.AgentDayReportRO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportMapper {

    @Select("<script>select * from agent_day_report where createDate like concat('%',#{data},'%')" +
            "<if test= 'account != null'>and account = #{account}</if></script>")
    List<AgentDayReportRO> getList(@Param("data") String data, @Param("account") String account);


    @Select("<script>select * from agent_day_report where createDate = #{data}" +
            "<if test= 'account != null'>and account = #{account}</if></script>")
    List<AgentDayReportRO> getListOfMonth(@Param("data") String data, @Param("account") String account);

}
