package com.unitedcoder.exceldemo;

import com.unitedcoder.homwork1.LoginUser;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {


    //write a method to read from excel
    public String readFromExcelCell(String fileName,String sheetName,int rowNumber,int cellNumber){
         FileInputStream fileInputStream= null;
         try {
             fileInputStream = new FileInputStream(fileName);
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         }
         XSSFWorkbook workbook= null;
         try {
             workbook = new XSSFWorkbook(fileInputStream);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         // XSSFSheet sheet=workbook.getSheetAt(0);
         XSSFSheet sheet1=workbook.getSheet(sheetName);
         XSSFRow row= sheet1.getRow(rowNumber);
         String cellValue=null;
         if(row==null){
             System.out.println("Empty row!!!");
         }else{
             XSSFCell cell=row.getCell(cellNumber);
             CellType cellType=cell.getCellType();
             switch (cellType){
                 case NUMERIC:
                     cellValue=String.valueOf(cell.getNumericCellValue());
                     System.out.println(cellValue);
                     break;
                 case  STRING:
                     cellValue=cell.getStringCellValue();
                     System.out.println(cellValue);
                     break;
             }
         }
         return  cellValue;


     }
     public List< LoginUser> reaMultipleCellValue(String fileName, String sheetName, int startRow) throws IOException {
         XSSFWorkbook workbook=new XSSFWorkbook(fileName);
         XSSFSheet sheet=workbook.getSheet(sheetName);
         int rowCount=sheet.getLastRowNum();
               List<LoginUser> loginUsers =new ArrayList<>();
               for(int r=startRow;r<=rowCount;r++){
                   XSSFRow row=sheet.getRow(r);
                   if(row==null){
                       System.out.println("empty row");
                   }
                   else {
                       XSSFCell userNameColumn=row.getCell(0);
                       XSSFCell passwordColumn=row.getCell(1);
                       loginUsers.add(new LoginUser(userNameColumn.getStringCellValue(),passwordColumn.getStringCellValue()));
                   }
               }
         System.out.println(loginUsers);
               return loginUsers;

     }
}










