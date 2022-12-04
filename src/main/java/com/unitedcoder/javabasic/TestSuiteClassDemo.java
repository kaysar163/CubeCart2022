package com.unitedcoder.javabasic;

public class TestSuiteClassDemo {
    /*
    param testsuiteid this param is for test suite name
    param test suitename this param is for test suite name
    param testsutedescrintion this param is for test suite descriptios
     */
    private int testSuiteId;
    private String testSuiteName;
    private String getTestSuiteDescription;

    //create a class constructor without argument list
    public TestSuiteClassDemo() {
    }
        //create a class constructor with all fields defind in the class

    public TestSuiteClassDemo(int testSuiteId, String testSuiteName, String getTestSuiteDescription) {
        this.testSuiteId = testSuiteId;
        this.testSuiteName = testSuiteName;
        this.getTestSuiteDescription = getTestSuiteDescription;

    }
        //create get and set method
    //set method is for setting fileds balue
    //get method is for hetting filed value


    public int getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(int testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public String getTestSuiteName() {
        return testSuiteName;
    }

    public void setTestSuiteName(String testSuiteName) {
        this.testSuiteName = testSuiteName;
    }

    public String getGetTestSuiteDescription() {
        return getTestSuiteDescription;
    }

    public void setGetTestSuiteDescription(String getTestSuiteDescription) {
        this.getTestSuiteDescription = getTestSuiteDescription;
    }

    public static void main(String[] args) {
        //create a test suite object
        TestSuiteClassDemo testSuiteClassDemo=new TestSuiteClassDemo();
        //set test suite object properties
        testSuiteClassDemo.setTestSuiteId(1);
        testSuiteClassDemo.setTestSuiteName("Login Suite");
        testSuiteClassDemo.setGetTestSuiteDescription("User should be able to login the system");
        //get test suite object properties
        System.out.println("test suite id:"+testSuiteClassDemo.getTestSuiteId());
        System.out.println("test suite name "+testSuiteClassDemo.getTestSuiteName());
        System.out.println("test suite description "+testSuiteClassDemo.getTestSuiteDescription);

        //create test suite object with inital filed values
        TestSuiteClassDemo testSuiteClassDemo2=new TestSuiteClassDemo(2,"Logout test suite ","user should be able to log out");

        System.out.println("test suite id:"+testSuiteClassDemo2.getTestSuiteId());
        System.out.println("test suite name "+testSuiteClassDemo2.getTestSuiteName());
        System.out.println("test suite description "+testSuiteClassDemo2.getTestSuiteDescription);


    }
}

