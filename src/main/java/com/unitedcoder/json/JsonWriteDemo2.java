package com.unitedcoder.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonWriteDemo2 {
    public static void main(String[] args)  {
        User user1=new User("admin","MaharAaDemo","Admin","21",true);
        User user2=new User("student","MahraDemo","student","23",true);
        User user3=new User("lerner","MaharaDemo","learner","25",true);
        List<User> users=new ArrayList<>();
        users.addAll(Arrays.asList(user1,user2,user3));
        Users maharUsers=new  Users (users);
        String objectVale=null;
        ObjectMapper objectMapper=new   ObjectMapper ();
        try {
            objectVale=objectMapper.writeValueAsString(maharUsers);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(objectVale);
        try {
            FileUtils.writeStringToFile(new File("Test_Deta\\maharUsers.json"),objectVale);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
