package com.kiranacademy_02_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReading {

	public static void main(String[] args) throws BiffException, IOException    {
		
		FileInputStream fileInputStream=new FileInputStream("D://JBK_Automation/LoginData.xls");
		Workbook workbook=Workbook.getWorkbook(fileInputStream);
		
		Sheet sheet=workbook.getSheet(0);  //Sheet
		int rows=sheet.getRows();
		int cols=sheet.getColumns();
		
		for (int i=0; i<cols;i++) {
			for (int j=0; j<rows;j++) {	
				Cell cell=sheet.getCell(i,j);
				String str=cell.getContents();
				System.out.println(str);
			}
			
		}
		
	
	
	}
}
