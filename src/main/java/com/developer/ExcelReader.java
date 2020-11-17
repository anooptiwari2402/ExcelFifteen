package com.developer;

import com.model.ModelTable;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelReader {
    public static void main(String[] args) throws IOException {


//        file loading
        String str = "example.xlsx";
        FileInputStream fileInputStream = new FileInputStream(str);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

//       getting a last line to iterate
        XSSFRow headerRow = sheet.getRow(0);
        int lastCell = headerRow.getLastCellNum();
        int lastRow = sheet.getLastRowNum();



//        creating list to store the rowObject and modelObject
        ArrayList<ArrayList> valueList = new ArrayList<ArrayList>();
        ArrayList modelList = new ArrayList();



//        traversing to each cell
        for (int i = 1; i < lastRow+1; i++) {
            while(sheet.getRow(i)==null) {
                i++;
            }
            XSSFRow row = sheet.getRow(i);

//            creating a row list
            ArrayList rowList = new ArrayList();
            for (int j = 0; j < lastCell; j++) {
                XSSFCell cell = row.getCell(j);
                Object obj = cell!=null?cell.toString():null;

//                adding a each row objects in the rowList
                rowList.add(obj);
            }



//            making a modelObject and adding it into the list
//            ModelTable modelTable = new ModelTable();
//            int k=0;
//            modelTable.setSno(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setTransactionID(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setTransactionDate(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setMethod(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setPaymentData(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setPaymentStatus(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setSsoId(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setFirstName(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setLastNameAddress(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setAddress(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setCity(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setState(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setZip(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setCountry(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setMobile(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setEmail(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setCurrency(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setAmount(rowList.get(k)!=null? rowList.get(k):null); k++;
//            modelTable.setPackageType(rowList.get(k)!=null? rowList.get(k):null);
//            modelList.add(modelTable);




//            adding a rowList into the list
            valueList.add(rowList);
            System.out.println();
        }

//        rowList streaming
        valueList.stream().forEach(l->{
            System.out.println(l);
        });


//        modelObject streaming
//        modelList.stream().forEach(l->{
//            System.out.println(l);
//        });


//        closing the workbook and filestream
        workbook.close();
        fileInputStream.close();
    }
}
