package com.unitedcoder.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonWriteDemo3 {
    public static void main(String[] args) {
        List<WebAutomation> webAutomationCourses=new ArrayList<>();
        webAutomationCourses.add(new WebAutomation("Selenium-Webdriver-Java",50));
        webAutomationCourses.add(new WebAutomation("Cypress",50));
        webAutomationCourses.add(new WebAutomation("BDD-Cucumber_Java",50));

        List<Api> apiCourses=new ArrayList<>();
       apiCourses.add(new Api("RestAssured-api_testting",100));
       apiCourses.add(new Api("Soup-UI_Webervices_testing",100));


        Courses courses=new Courses(webAutomationCourses,apiCourses);
        CourseInfo courseInfo=new CourseInfo("SDET training",
                "Automation","Jonne David","https://www.linkedIn.com",
                "https://seleniummaster.teachable.com/",courses);

        ObjectMapper objectMapper=new ObjectMapper();
        try {
            objectMapper.writeValue(new File("Test_Deta\\UdemyCourses3.json"),courseInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
