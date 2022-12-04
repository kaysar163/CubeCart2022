package com.unitedcoder.otherexecise;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;

public class GraduateStudent extends Student {
    private String advisorName;
    private String researchProject;


    public GraduateStudent() {
    }

    public GraduateStudent(String advisorName, String researchProject) {
        this.advisorName = advisorName;
        this.researchProject = researchProject;
    }

    public GraduateStudent(long studentId, String firstName, String lastName, String className, int age, String major, String birthday, String advisorName, String researchProject) {
        super(studentId, firstName, lastName, className, age, major, birthday);
        this.advisorName = advisorName;
        this.researchProject = researchProject;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "advisorName='" + advisorName + '\'' +
                ", researchProject='" + researchProject + '\'' +
                " }"+super.toString();
    }
}











