package com.unitedcoder.javaexercises.demo1;

public class InheritanceDemoTest extends InheritanceDemo {
    private String researchField;
    private String advisorName;

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public static void main(String[] args) {
        InheritanceDemoTest ingeritanceDemoTest=new InheritanceDemoTest();
        ingeritanceDemoTest.setResearchField("selenium test automation");
        ingeritanceDemoTest.setClassName("test automation");
        ingeritanceDemoTest.setAdvisorName("selenium master");
        ingeritanceDemoTest.setFirsName("user first name ");
        ingeritanceDemoTest.setLastName("USER last name");


        System.out.println("username :"+ingeritanceDemoTest.getFirsName()+","+ingeritanceDemoTest.getLastName());
        System.out.println("class:"+ingeritanceDemoTest.getClassName());
        System.out.println("advisor:"+ingeritanceDemoTest.getAdvisorName());
        System.out.println("research field:"+ingeritanceDemoTest.getResearchField());
    }
}
