package com.example.demo5.controller;

import com.example.demo5.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping("manual")
    public String manualUpdateReport(@RequestParam(value = "account",required = false) String account,
                                     @RequestParam(value = "data",required = false) String data,
                                     @RequestParam(value = "table",required = false) String table) {

        System.out.println("===in====");
        if (account == null){
            account = "9660004";
            account = null;
        }
        if (data == null){
            data = "2019-09";
        }
        if (table == null){
            table = "agent_day_report";
        }
        reportService.getList(account, data, table);
        return "success";
    }

    @RequestMapping("test")
    public String manualUpdateReport_test(@PathVariable String account) {

        System.out.println("===in====" + account);
        return "success";
    }


}
