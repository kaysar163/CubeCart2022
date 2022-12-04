package com.unitedcoder.jsonhomework;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ProductWriteDemo {
    public static void main(String[] args) {
        Products products=new Products(true,"Ipone14 Plus","Apple","tenst123",800.5,
               6.8,10.1,35,13,true);
        String objectVale=null;
        ObjectMapper objectMapper=new   ObjectMapper ();
        try {
            objectVale=objectMapper.writeValueAsString(products);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("Test_Data\\products.json"),objectVale);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
