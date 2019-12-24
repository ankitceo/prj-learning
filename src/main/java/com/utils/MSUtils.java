package com.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MSUtils {

	public static void main(String[] args) {
		createSimpleWorkbook(args[0], "Demo.xlsx");
	}

	public static void createSimpleWorkbook(String dir, String filename) {
		String absoluteFilePath = dir + File.separator + filename;
		try (Workbook workbook = new XSSFWorkbook(); OutputStream outStream = new FileOutputStream(absoluteFilePath)) {
			Sheet sheet = workbook.createSheet("EmpNames");
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue("Ankit Kumar");
			workbook.write(outStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
