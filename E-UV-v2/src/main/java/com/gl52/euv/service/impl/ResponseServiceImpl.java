package com.gl52.euv.service.impl;

import com.gl52.euv.mapper.ResponseMapper;
import com.gl52.euv.pojo.Evaluation;
import com.gl52.euv.pojo.Response;
import com.gl52.euv.service.EvaluationService;
import com.gl52.euv.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ResponseServiceImpl implements ResponseService {
    @Autowired
    private ResponseMapper responseMapper ;
    @Autowired
    private EvaluationService evaluationService;
    @Override
    public List<Map<String, Object>> getResponseByEvaluationId(int eid) {
        return responseMapper.getResponseByEvaluationId(eid);
    }

    @Override
    public Evaluation getEvaluationByEid(int eid) {
        return evaluationService.getEvaluationById(eid);
    }

    @Override
    public boolean createResponse(int eid, int userId, String content) {
        Response response= new Response();
        response.setRcontent(content);
        response.setRcreated(new Date());
        response.setRevaluationId(eid);
        response.setRstudentId(userId);
        return responseMapper.insertSelective(response) == 1;
    }
}
