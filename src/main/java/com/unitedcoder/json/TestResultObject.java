package com.unitedcoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResultObject {
    @JsonProperty("test-module")
    private String testModule;
    @JsonProperty("test-name")
    private String testName;
    @JsonProperty("test-date")
    private String testDate;
    @JsonProperty("test-time")
    private String tesTime;
    @JsonProperty("test-status")
    private String testStatus;

    public TestResultObject() {
    }

    public TestResultObject(String testModule, String testName, String testDate, String tesTime, String testStatus) {
        this.testModule = testModule;
        this.testName = testName;
        this.testDate = testDate;
        this.tesTime = tesTime;
        this.testStatus = testStatus;
    }

    public String getTestModule() {
        return testModule;
    }

    public void setTestModule(String testModule) {
        this.testModule = testModule;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTesTime() {
        return tesTime;
    }

    public void setTesTime(String tesTime) {
        this.tesTime = tesTime;
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    @Override
    public String toString() {
        return "TestResultObject{" +
                "testModule='" + testModule + '\'' +
                ", testName='" + testName + '\'' +
                ", testDate='" + testDate + '\'' +
                ", tesTime='" + tesTime + '\'' +
                ", testStatus='" + testStatus + '\'' +
                '}';
    }
}
