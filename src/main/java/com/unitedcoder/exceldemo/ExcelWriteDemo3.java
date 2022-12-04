package com.unitedcoder.exceldemo;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteDemo3 {
    public static void main(String[] args) {
        Object studentInfo[][]= {
                {"studentid", "student name", "score"},
                {"10", "tom", "90"},
                {"11", "david", "98"},
                {"12", "anny", "99"}
        };
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Class-A");
        int rows=studentInfo.length;
        int columnCount=studentInfo[0].length;
        for (int r=0;r<rows;r++){
            XSSFRow row=sheet.createRow(r);
            for(int c=0;c<columnCount;c++){
                XSSFCell cell=row.createCell(c);
                Object content=studentInfo[r][c];
                if(content instanceof  String) {
                    cell.setCellValue((String) content);
                }
                if(content instanceof  Integer) {
                    cell.setCellValue((Integer) (content));
                }
                if(content instanceof  Boolean){
                    cell.setCellValue((Boolean)content);


                }
            }
        }
        String filePath="Test_Deta/student_Info.xlsx";
        File file=new File(filePath);
        FileOutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
