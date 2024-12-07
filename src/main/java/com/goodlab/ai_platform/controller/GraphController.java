


package com.goodlab.ai_platform.controller;

import com.goodlab.ai_platform.entity.CodeRequest;
import com.goodlab.ai_platform.entity.Result;
import com.goodlab.ai_platform.service.CodeExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {

    @Autowired
    private CodeExecutionService codeExecutionService;

    @PostMapping("/runCode")
    public Result runCode(@RequestBody CodeRequest request) {
        String code = request.getCode();
        int id = request.getId();
        String batch = request.getBatch(); // 添加对 batch 字段的获取

        // 这里假设你有一个函数来执行代码并返回结果
        String result = executeCode(code);

        // 将结果存储到数据库（这里不需要）
        Result codeExecutionResult = new Result();
        codeExecutionResult.setId(id);
        codeExecutionResult.setBatch(batch);
        codeExecutionResult.setGraph(result); // 假设 graph 存储执行结果

        return codeExecutionResult;
    }

    private String executeCode(String code) {
        // 这里你需要实现代码执行的逻辑
        // 例如，使用 eval 来执行代码（注意安全性）
        // 为了演示，这里简单返回输入的代码
        return code;
    }
}
