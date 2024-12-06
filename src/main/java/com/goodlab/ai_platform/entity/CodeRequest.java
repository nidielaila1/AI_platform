package com.goodlab.ai_platform.entity;


public class CodeRequest {
    private int id; // 修改为 String 类型
    private String code;

    @Override
    public String toString() {
        return "CodeRequest{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    private String batch; // 添加 batch 字段
}
