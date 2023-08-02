/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.IT_Coffee.DAO;

import Com.IT_Coffee.Entity.LoaiSP;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LeBaoDang
 */
public class LoaiSPDAOTest {
    
    private LoaiSPDAO dao;
    private LoaiSP LoaiSP;
    private ExcelHelpers excel;
    
    public LoaiSPDAOTest() {
    }
    
    
    @Before
    public void setUp() {
        dao = new LoaiSPDAO();
        LoaiSP = new LoaiSP();
        excel = new ExcelHelpers();
    }
    
    @Test
    public void testInsert() throws Exception {
        // chỉ ra đường dẫn đến file
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        // lấy ra dữ liệu từ execl
        LoaiSP.setMaLoaiSP(excel.getCellData("TestData", 130));
        LoaiSP.setTenLoaiSP("TRÀ SỮA");
        assertEquals(1, dao.insert(LoaiSP));
        excel.setCellData("Pass", 130, 21);
    }

    @Test
    public void testUpdate() throws Exception {
        // chỉ ra đường dẫn đến file
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        // lấy ra dữ liệu từ execl
        LoaiSP.setMaLoaiSP(excel.getCellData("TestData", 138));
        LoaiSP.setTenLoaiSP("TRÀ SỮA HẠNG A");
        assertEquals(1, dao.update(LoaiSP));
        excel.setCellData("Pass", 138, 21);
    }

    @Test
    public void testDelete() throws Exception {
       // chỉ ra đường dẫn đến file
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        // lấy ra dữ liệu từ execl
        assertEquals(1, dao.delete(excel.getCellData("TestData", 142)));
        excel.setCellData("Pass", 142, 21);
    }    
}
