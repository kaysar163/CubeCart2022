package com.unitedcoder.inventorymodule;

import com.unitedcoder.exceldemo.ExcelUtility;

public class InventoryModuleTestRunner extends InventoryModuleAutomation{
    public static void main(String[] args) {
        openBrowser();
        String fileName="Test_Deta/Book1.xlsx";
        ExcelUtility1 excelUtility1=new ExcelUtility1();
        String  ProductName=excelUtility1.readFromExcelCell(fileName,"MultipleProduct",1,0);
        String ProductCode =excelUtility1.readFromExcelCell(fileName,"MultipleProduct",1,1);
        String ProductWeight=excelUtility1.readFromExcelCell(fileName,"MultipleProduct",1,2);
        String StockLevel=excelUtility1.readFromExcelCell(fileName,"MultipleProduct",1,3);


        ReadConfigFileLogin();
        logOut();
    }

}
