package com.unitedcoder.javabasic;

public class TestSuiteConstructorDemo {
    private String projectName;
    private int projectId;
    private int testSuiteId;
    private String testSuiteName;
    private String TestSuiteDescription;
    //dfault constructor - no argument constructor

    public TestSuiteConstructorDemo() {
    }
    //constructor with argument
    //parametterized constructor
    public TestSuiteConstructorDemo(int projectId, String testSuiteName) {
        this.projectId = projectId;
        this.testSuiteName = testSuiteName;
    }

    public TestSuiteConstructorDemo(String projectName, int projectId, String testSuiteDescription) {
        this.projectName = projectName;
        this.projectId = projectId;
        TestSuiteDescription = testSuiteDescription;
    }

    public TestSuiteConstructorDemo(String projectName, int projectId, int testSuiteId, String testSuiteName, String testSuiteDescription) {
        this.projectName = projectName;
        this.projectId = projectId;
        this.testSuiteId = testSuiteId;
        this.testSuiteName = testSuiteName;
        TestSuiteDescription = testSuiteDescription;
    }

    public static void main(String[] args) {
        TestSuiteConstructorDemo testSuiteConstructorDemo=new TestSuiteConstructorDemo();
        testSuiteConstructorDemo.setProjectId(1);
        testSuiteConstructorDemo.setProjectName("click wise project");
        testSuiteConstructorDemo.setProjectId(1);
        testSuiteConstructorDemo.setTestSuiteName("Login logout suite");
        testSuiteConstructorDemo.setTestSuiteDescription("valid users can login and logout of the system");
        System.out.println("project id:"+testSuiteConstructorDemo.getProjectId());
        System.out.println("project name"+testSuiteConstructorDemo.getProjectName());
        System.out.println("test suite id"+testSuiteConstructorDemo.getTestSuiteId());
        System.out.println("test suite name"+testSuiteConstructorDemo.getTestSuiteName());
        System.out.println("test suite description"+testSuiteConstructorDemo.getTestSuiteName());
        //use the cunstruckt

        TestSuiteConstructorDemo testSuiteConstructorDemo1=new TestSuiteConstructorDemo("clicke wise staff",2,2,"mnage staff","admin user can manage staff");
        System.out.println("project id:"+testSuiteConstructorDemo1.getProjectId());
        System.out.println("project name"+testSuiteConstructorDemo1.getProjectName());
        System.out.println("test suite id"+testSuiteConstructorDemo1.getTestSuiteId());
        System.out.println("test suite name"+testSuiteConstructorDemo1.getTestSuiteName());
        System.out.println("test suite description"+testSuiteConstructorDemo1.getTestSuiteName());

    }
    //difine get and set methods for fields

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

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

    public String getTestSuiteDescription() {
        return TestSuiteDescription;
    }

    public void setTestSuiteDescription(String testSuiteDescription) {
        TestSuiteDescription = testSuiteDescription;
    }
}



