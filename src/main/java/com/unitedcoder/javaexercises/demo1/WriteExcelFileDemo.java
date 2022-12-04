package com.unitedcoder.javaexercises.demo1;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class WriteExcelFileDemo  {
    public static  void main(String[] args) {
        String projectPath=System.getProperty("user.dir");
        String fileSeparator= File.separator;
        List<String> excelContent=new ArrayList<String>();
        excelContent.add("testid,testmodule,testname,testtype,testteps,action,testresult,note");
        excelContent.add("1,login.dashbord.regression,1,openbrowser,browser should open,this is a note");
        excelContent.add("1,login.dashbord.regression,1,openbrowser,browser should open,this is a note");
        writeContent("target\\workbook1.xls","testcasee",excelContent);
    }

    private static void writeContent(String fileName, String sheetName, List<String> content) {

    try{
        Workbook wb=new HSSFWorkbook();

        FileOutputStream fileOut=new FileOutputStream(fileName);
        Sheet sheet= wb.createSheet(sheetName);
        int numberOfRows= content.size();
        for(int i=0;i<=numberOfRows-1;i++){
            Row row=sheet.createRow(i);
            String[] rowContenet=content.get(i).split(",");
            int totalCells=rowContenet.length;

            for(int j=0;j<=totalCells-1;j++){
                Cell cell=row.createCell(j);
                cell.setCellValue(rowContenet[j]);
            }
        }
        wb.write(fileOut);
        fileOut.close();


    } catch (IOException e) {
        e.printStackTrace();




    }

}

}
