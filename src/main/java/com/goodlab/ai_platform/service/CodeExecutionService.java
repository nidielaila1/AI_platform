package com.goodlab.ai_platform.service;

import com.goodlab.ai_platform.entity.Result;
import com.goodlab.ai_platform.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeExecutionService {

    @Autowired
    private ResultRepository resultRepository;

    public void saveResult(Result result) {
        resultRepository.save(result);
    }
}

