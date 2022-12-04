package com.unitedcoder.exceldemo;

public class ExcelReadDemo1 {
    public static void main(String[] args) {
    String fileName="Test_Deta/Book1.xlsx";
    ExcelUtility excelUtility=new ExcelUtility();
        excelUtility.readFromExcelCell(fileName,"MultipleProduct",0,0);
        excelUtility.readFromExcelCell(fileName,"MultipleProduct",1,0);
        excelUtility.readFromExcelCell(fileName,"MultipleProduct",0,1);
        excelUtility.readFromExcelCell(fileName,"MultipleProduct",1,1);


   }
}

