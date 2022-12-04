package com.unitedcoder.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DeserilizotionDemo {
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        Users loginUsers=null;
        try {
            loginUsers=objectMapper.readValue(new File("Test_Deta/User.json"),Users.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<User>users=loginUsers.getUsers();
        for(User user:users){
            System.out.println(String.format(" %s %s %s %s",
                    user.getUsername(),
                    user.getPassword(),
                    user.getUserType(),
                    user.getAge()

            ));
        }
    }
}
