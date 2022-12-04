package com.unitedcoder.otherexecise;

import java.util.List;

public class DoctorStudent extends GraduateStudent {
    private String thesisTopic;
    private List<String> publications;

    public DoctorStudent() {
    }


    public DoctorStudent(long studentId, String firstName, String lastName, String className, int age, String major, String birthday, String advisorName, String researchProject, String thesisTopic, List<String> publications) {
        super(studentId, firstName, lastName, className, age, major, birthday, advisorName, researchProject);
        this.thesisTopic = thesisTopic;
        this.publications = publications;
    }


}




