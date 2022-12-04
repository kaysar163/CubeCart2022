package com.unitedcoder.exceldemo;

import java.util.List;

import static com.unitedcoder.cubecartinventorymodule.BaseClass.*;

public class MultipleRolesTest {
    public static void main(String[] args) {
        openBrowser();
        String fileNmae="Test_Deta/loginInfo.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
       // List<LogInfo> users=excelUtility.readFromExcelCell(fileNmae,"CubeCartLoginUser");
      //  for(LogInfo user:users){
          //  login(user.getUserName(),user.getPassword());
            logout();

        }

    }




