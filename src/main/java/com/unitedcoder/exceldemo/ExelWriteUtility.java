package com.unitedcoder.exceldemo;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExelWriteUtility {
    public void WriteToExelMultipleCell(String fileName, String sheetName, List<String> contents){
        //define a file to write content
        File excelFile=new File(fileName);
        //define a work book
        XSSFWorkbook workbook=new XSSFWorkbook();
        //add sheet to the work book
        XSSFSheet sheet=workbook.createSheet(sheetName);
        //define rows in the sheet
        int numberOfRows=contents.size();
        for(int rowNumber=0;rowNumber<numberOfRows;rowNumber++){
            XSSFRow row=sheet.createRow(rowNumber);
            String[] rowContent=contents.get(rowNumber).split(",");
            //difine colum to yhe row
            int totalCell=rowContent.length;
            for(int cellNumber=0;cellNumber<totalCell;cellNumber++){
                XSSFCell cell=row.createCell(cellNumber);
                //add contents to the cell
                cell.setCellValue(rowContent[cellNumber]);
        }
        }
        FileOutputStream outputStream= null;
        try {
            outputStream = new FileOutputStream(excelFile);
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



