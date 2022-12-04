package com.unitedcoder.javaexercises.demo1;
import java.io.File;
public class DirectoryDemo {
    public static void main(String[] args) {
        String path="C:\\Users\\kaysa\\IdeaProjects\\CubeCartAplicatoin2022\\src\\main\\java\\com\\unitedcoder\\javaexercises\\demo1";

        File file=new File(path);
        boolean flag =file.mkdir();
        if (flag){
            System.out.println("directory created successfully");
    }
        else {
            System.out.println("something foing wrong ");
        }
    }
}
