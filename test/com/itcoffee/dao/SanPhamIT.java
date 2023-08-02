/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Com.IT_Coffee.DAO;


import com.itcoffee.dao.SanPhamDAO;
import com.itcoffee.entity.SanPham;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windows 10 21H1
 */
public class SanPhamIT {

    private SanPhamDAO dao;
    private SanPham sanpham;
    private ExcelHelpers excel;

    public SanPhamIT() {
    }

    @Before
    public void setUp() {
        dao = new SanPhamDAO();
        sanpham = new SanPham();
        excel = new ExcelHelpers();
    }

    @Test
    public void TestInsert() throws Exception {
        // chỉ ra đường dẫn
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        // 
        sanpham.setMaSP(excel.getCellData("TestData", 102));
        sanpham.setTenSP("Sữa tươi trân châu đường đen");
        sanpham.setDonGia(26.500);
        sanpham.setSize("Lớn");
        sanpham.setHinh("sp-cf1.jpg");
        sanpham.setLoaiSP("CF");
        assertEquals(1, dao.insert(sanpham));
        excel.setCellData("Pass", 102, 21);
    }

    @Test()
    public void TestUpdate() throws Exception {
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        sanpham.setTenSP("Sữa tươi đường đen");
        sanpham.setDonGia(22000);
        sanpham.setSize("Nhỏ");
        sanpham.setHinh("sp-cf1.jpg");
        sanpham.setLoaiSP("CF");
        sanpham.setMaSP(excel.getCellData("TestData", 112));
        assertEquals(1, dao.update(sanpham));
        // ghi trang thái xuống excel
        excel.setCellData("Pass", 112, 21);
    }

    @Test
    public void TestDelete() throws Exception {
        excel.setExcelFile("src\\EXCCEL\\TestCase.xls", "TestCase");
        assertEquals(1, dao.delete(excel.getCellData("TestData", 114)));
        excel.setCellData("Pass", 114, 21);
    }

}
