/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.IT_Coffee.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
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
public class ThanhVienTest {
    
    public ThanhVienTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // chưa nhập dữ liệu là rỗng
    @Test
    public void testGetMaTV() {
        ThanhVien instance = new ThanhVien();
        String expResult = null;
        String result = instance.getMaTV();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetMaTV() {
        String matV = "CHINH";
        ThanhVien instance = new ThanhVien();
        instance.setMaTV(matV);
        String ex = "CHINH";
        assertEquals(ex, instance.getMaTV());
    }

    @Test
    public void testGetTenTV() {
        ThanhVien instance = new ThanhVien();
        String expResult = null;
        String result = instance.getTenTV();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTenTV() {
        String tenTV = "Dang";
        ThanhVien instance = new ThanhVien();
        instance.setTenTV(tenTV);
        String ex = "Dang";
        assertEquals(ex, instance.getTenTV());
    }

    @Test
    public void testGetMaNV() {
        ThanhVien instance = new ThanhVien();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMaNV() {
        String maNV = "Dang";
        ThanhVien instance = new ThanhVien();
        instance.setMaNV(maNV);
        String ex = "Dang";
        assertEquals(ex, instance.getMaNV());
    }

    @Test
    public void testGetNgayThem() {
        ThanhVien instance = new ThanhVien();
        Date expResult = null;
        Date result = instance.getNgayThem();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNgayThem() {
        
    }

    @Test
    public void testGetLoaiThe() {
        ThanhVien instance = new ThanhVien();
        String expResult = null;
        String result = instance.getLoaiThe();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLoaiThe() {
        String loaiThe = "vip";
        ThanhVien instance = new ThanhVien();
        instance.setLoaiThe(loaiThe);
        String ex = "vip";
        assertEquals(ex, instance.getLoaiThe());
    }

    @Test
    public void testGetSDT() {
        ThanhVien instance = new ThanhVien();
        String expResult = null;
        String result = instance.getSDT();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSDT() {
        String SDT = "0961852791";
        ThanhVien instance = new ThanhVien();
        instance.setSDT(SDT);
        String sdt = "0961852791";
        assertEquals(sdt, instance.getSDT());
    }

    @Test
    public void testGetEmail() {
        ThanhVien instance = new ThanhVien();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        String email = "dangletv@gmail.com";
        ThanhVien instance = new ThanhVien();
        instance.setEmail(email);
        String emailtest = "dangletv@gmail.com";
        assertEquals(emailtest, instance.getEmail());
    }

    @Test
    public void testGetGhiChu() {
        ThanhVien instance = new ThanhVien();
        String expResult = null;
        String result = instance.getGhiChu();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetGhiChu() {
        String ghiChu = "khachvip";
        ThanhVien instance = new ThanhVien();
        instance.setGhiChu(ghiChu);
        String gctv = "khachvip";
        assertEquals(gctv, instance.getGhiChu());
    }
    
}
