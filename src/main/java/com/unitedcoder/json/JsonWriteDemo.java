package com.unitedcoder.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JsonWriteDemo {
    public static void main(String[] args) {
        User user=new User();
        user.setUsername("Admin");
        user.setPassword("MaharaDemo");
        user.setAge("22");
        user.setUserType("Admin");
        user.setActive(true);
        String userInfo=null;
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            userInfo=objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("Test_Deta\\userInfo.json"),userInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
