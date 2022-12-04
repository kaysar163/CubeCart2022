package com.unitedcoder.exceldemo;

import java.util.ArrayList;
import java.util.List;

public class ExelWriteDemo1 {
    public static void main(String[] args) {
        ExelWriteUtility exelWriteUtility=new ExelWriteUtility();
        String fileName="Test_Deta/TestReport1.xlsx";
        List<String> testResult=new ArrayList<>();
        testResult.add("testname,testmodule,teststatus,executesAt,executedBy");
        testResult.add("Login,Login,Passed,2022-03-15,aynigar");
        exelWriteUtility.WriteToExelMultipleCell(fileName,"CubeCartTtestResult",testResult);

    }
}
