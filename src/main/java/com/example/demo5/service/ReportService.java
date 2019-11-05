package com.example.demo5.service;

import com.example.demo5.domain.AgentDayReportRO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {

    List<AgentDayReportRO> getList(String account, String data, String table);
}