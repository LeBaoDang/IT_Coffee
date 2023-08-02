/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Com.IT_Coffee.DAO;

import Com.IT_Coffee.Entity.ThanhVien;
import Com.IT_Coffee.utils.XDate;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Windows 10 21H1
 */

public class ThanhVienIT {
    
    private ThanhVienDAO dao2;
    private ThanhVien thanhvien;
    private ExcelHelpers excel;
    
    public ThanhVienIT() {
        
    }
    
    @Before
    public void setUp() {
        dao2 = new ThanhVienDAO();
        thanhvien = new ThanhVien();
        excel = new ExcelHelpers();
    }
    
    @Test
    public void TestInsert() throws Exception  {
        // chỉ ra đường dẫn chứ file excel
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        // đọc data từ file excel
        thanhvien.setMaTV(excel.getCellData("TestData", 168));
        thanhvien.setTenTV("DUY MOIZ");
        thanhvien.setMaNV("Duy");
        thanhvien.setNgayThem(XDate.toDate("12-03-2005", "dd-MM-YYYY"));
        thanhvien.setLoaiThe("Vip");
        thanhvien.setSDT("012235147");
        thanhvien.setEmail("kientv123@gmail.com");
        thanhvien.setGhiChu("Ít đá");
        assertEquals(1,  dao2.insert(thanhvien));
        // Test pass ghi trạng thái test xuống excel
        excel.setCellData("Pass", 168 , 21);        
    }
    
    @Test()
    public void TestUpdate() throws Exception {  
        // chỉ ra đường dẫn chứa file excel
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        // đọc data từ file excel
        thanhvien.setMaTV(excel.getCellData("TestData", 179));
        thanhvien.setTenTV("Trần QUang Vinh");
        thanhvien.setMaNV("Duy");
        thanhvien.setNgayThem(XDate.toDate("12-03-2005", "dd-MM-YYYY"));
        thanhvien.setLoaiThe("Vip");
        thanhvien.setSDT("012235147");
        thanhvien.setEmail("kientv123@gmail.com");
        thanhvien.setGhiChu("nhiều đá");
        assertEquals(1,  dao2.update(thanhvien));
        // pass ghi trạng thái test xuống excel
        excel.setCellData("Pass", 179 , 21);
    }
    
    @Test
    public void TestDelete() throws Exception {
        // chỉ ra đường dẫn chứ file excel
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        // đọc data từ file excel
        assertEquals(1,dao2.delete(excel.getCellData("TestData", 181)));
        // ghi trạng thái test xuống excel
        excel.setCellData("Pass", 181 , 21);
    }   
}
