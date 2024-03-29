package com.mailbox.model.bean;

public class SettingMail {
    private String language;
    private Integer pageSize;
    private boolean spam;
    private String signature;

    public SettingMail() {
    }

    public SettingMail(String language, Integer pageSize, boolean spam, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spam = spam;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}

