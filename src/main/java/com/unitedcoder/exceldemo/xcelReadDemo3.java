package com.unitedcoder.exceldemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class xcelReadDemo3 {
   public  List<String> getExcelData(String productName,String sheetName) {
       String filePath = "Test_Deta/ProductInfo.xlsx";
       XSSFWorkbook workbook = null;
       try {
           workbook = new XSSFWorkbook(filePath);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       int sheets = workbook.getNumberOfSheets();
       List<String> productInfo = new ArrayList<>();
       for (int i = 0; i < sheets; i++) {
           if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
               XSSFSheet sheet = workbook.getSheetAt(i);
               Iterator<Row> rows = sheet.iterator();
              // Row firstRow = rows.next();
               //Iterator<Cell> cells = firstRow.cellIterator();
               while (rows.hasNext()) {
                   Row r = rows.next();
                   if (r.getCell(0).getStringCellValue().equalsIgnoreCase(productName)) {
                       Iterator<Cell> c = r.cellIterator();
                       while (c.hasNext()) {
                           Cell c1 = c.next();
                           if (c1.getCellType() == CellType.STRING) {
                               productInfo.add(c1.getStringCellValue());
                           } else {
                               productInfo.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
                           }
                       }


                   }

               }
           }

       }
       return productInfo;
   }

       public static void main(String[] args) {
        xcelReadDemo3 EcelReadDemo3=new  xcelReadDemo3();
      List<String> productList=EcelReadDemo3.getExcelData("shoes","Sheet1");
        System.out.println(productList);
}
   }

