package com.sppcloud.generic;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data implements  Autoconstants
{
	
	public static String getdata(int Sheet_number , int row_num , int cell_num) throws Exception
	{
		
		 FileInputStream fis = new FileInputStream(fl);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 wb.close();
		 String data = wb.getSheetAt(Sheet_number).getRow(row_num).getCell(cell_num).toString();
		 return data;
		
	}
		 
	public static int getRowCount( int Sheet_number ) throws Exception 
	{
		 FileInputStream fis = new FileInputStream(fl);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 wb.close();
		 XSSFSheet sh = wb.getSheetAt(Sheet_number);
		 int row_count = sh.getLastRowNum();
		 return row_count;
	}
}
