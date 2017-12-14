package com.nanda.apache.poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFTest {

	public static void main(String[] args) {

		XSSFWorkbook workBook = new XSSFWorkbook();

		XSSFSheet sheet = workBook.createSheet("Customer");

		Object[][] customerData = { {

				"Name", "Age" }, { "Nanda", 30 }

		};
		int row = 0;

		for (Object[] objects : customerData) {

			XSSFRow sheetRow = sheet.createRow(row++);
			
			int columnIndex = 0;

			for (Object data : objects) {

				

				XSSFCell dataCell = sheetRow.createCell(columnIndex++);

				if (data instanceof String) {

					dataCell.setCellValue((String) data);
				} else {
					dataCell.setCellValue((Integer) data);
				}

			}

		}

		File file = new File("./resources/data.xls");
		try {
			workBook.write(new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
