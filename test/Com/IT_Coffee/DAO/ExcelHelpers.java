/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.IT_Coffee.DAO;

/**
 *
 * @author LeBaoDang
 */

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.*;

public class ExcelHelpers {
    private FileInputStream fis;
    private FileOutputStream fileOut;
    private Workbook wb;
    private Sheet sh;
    private Cell cell;
    private Row row;
    private CellStyle cellstyle;
    private Color mycolor;
    private String excelFilePath;
    private Map<String, Integer> columns = new HashMap<>();
    
    // gọi thực thi đường dẫn của file excel nào và chọn sheet nào
    // TRẢ VỀ DATA
    public void setExcelFile(String ExcelPath, String SheetName) throws Exception {
        try {
            // đọc file
            File f = new File(ExcelPath);
            
            // kiểm tra sự tồn tại
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("File doesn't exist, so created!");
            }
            
            // hàm viết sẵn
            fis = new FileInputStream(ExcelPath);
            wb = WorkbookFactory.create(fis);
            sh = wb.getSheet(SheetName);
            //sh = wb.getSheetAt(0); //0 - index of 1st sheet
            if (sh == null) {
                sh = wb.createSheet(SheetName);
            }

            // DUYỆT QUA CÁC COLUMNS . VALUE THEO TỪ ROW
            this.excelFilePath = ExcelPath;

            //adding all the column header names to the map 'columns'
            sh.getRow(0).forEach(cell ->{
                columns.put(cell.getStringCellValue(), cell.getColumnIndex());
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // ĐỌC DATA TỪ FILE EXCLE RA (INT LẤY SỐ DÒNG, INT LẤY CHỈ SỐ CỘT )
    public String getCellData(int rownum, int colnum) throws Exception{
        try{
            cell = sh.getRow(rownum).getCell(colnum);
            String CellData = null;
            switch (cell.getCellType()){
                case STRING:
                    CellData = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell))
                    {
                        CellData = String.valueOf(cell.getDateCellValue());
                    }
                    else
                    {
                        CellData = String.valueOf((long)cell.getNumericCellValue());
                    }
                    break;
                case BOOLEAN:
                    CellData = Boolean.toString(cell.getBooleanCellValue());
                    break;
                case BLANK:
                    CellData = "";
                    break;
            }
            return CellData;
        }catch (Exception e){
            return"";
        }
    }

    //Gọi ra hàm này nè
    public String getCellData(String columnName, int rownum) throws Exception {
        // TRẢ VỀ 
        return getCellData(rownum, columns.get(columnName));
    }
    
    // ghi kết quả lại file excel
    public void setCellData(String text, int rownum, int colnum) throws Exception {
        try{
            row  = sh.getRow(rownum);
            if(row ==null)
            {
                row = sh.createRow(rownum);
            }
            cell = row.getCell(colnum);

            if (cell == null) {
                cell = row.createCell(colnum);
            }
            cell.setCellValue(text);

            fileOut = new FileOutputStream(excelFilePath);
            wb.write(fileOut);
            fileOut.flush();
            fileOut.close();
        }catch(Exception e){
            throw (e);
        }
    }
}
