package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.log4j.Logger;

public class ReadExcelFile {

    

    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
    	final Logger logger = Logger.getLogger(ReadExcelFile.class);
    	logger.debug("Excel Reading Method Start");

    //Create a object of File class to open xlsx file

    File file =    new File(filePath+"\\"+fileName);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook workbook = null;

    //Find the file extension by spliting file name in substring and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    workbook = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of XSSFWorkbook class

        workbook = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name

    Sheet sheet = workbook.getSheet(sheetName);

    //Find number of rows in excel file

    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = sheet.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

        }

        System.out.println();

    }

    

    }

    

    //Main function is calling readExcel function to read data from excel file

    public static void main(String...strings) throws IOException{
    	Propertyutil getPropertyValues = new Propertyutil();

    //Prepare the path of excel file
    	System.out.println(Propertyutil.getPropValues("excelpath"));
    	String excelpath=Propertyutil.getPropValues("excelpath");
    	String fileName=Propertyutil.getPropValues("excelName");
    	String worksheetName=Propertyutil.getPropValues("excelworksheet");



	ReadExcelFile objExcelFile = new ReadExcelFile();


    //Call read file method of the class to read data

    objExcelFile.readExcel(excelpath,fileName,worksheetName);

    }

}