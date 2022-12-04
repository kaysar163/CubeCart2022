package com.unitedcoder.exceldemo;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo {
    public static void main(String[] args) {
        ExelWriteUtility exelWriteUtility=new ExelWriteUtility();
        String fileName="Test_Deta/loginInfo1.xlsx";
        List<String> contents=new ArrayList<>();
        contents.add("username,password");
        contents.add("testautomation,automation123!");
        contents.add("testautomation1,automation123!");
        exelWriteUtility.WriteToExelMultipleCell(fileName,"CubeCartLoginUser",contents);
    }
}
