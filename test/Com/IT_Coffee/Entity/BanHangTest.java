/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.IT_Coffee.Entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author LeBaoDang
 */
public class BanHangTest {
    
    public BanHangTest() {
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

    @Test
    public void testGetMaSP() {
        SanPham instance = new SanPham();
        String expResult = null;
        String result = instance.getMaSP();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMaSP() {
        String maSP = "CF";
        SanPham instance = new SanPham();
        instance.setMaSP(maSP);
        String testMasp = "CF";
        assertEquals(testMasp, instance.getMaSP());
    }

    @Test
    public void testGetTenSP() {
        SanPham instance = new SanPham();
        String expResult = null;
        String result = instance.getTenSP();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTenSP() {
        String tenSP = "CFD";
        SanPham instance = new SanPham();
        instance.setTenSP(tenSP);
        String testTSP = "CFD";
        assertEquals(testTSP, instance.getTenSP());
    }

    @Test
    public void testGetLoaiSP() {
        SanPham instance = new SanPham();
        String expResult = null;
        String result = instance.getLoaiSP();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLoaiSP() {
        String loaiSP = "CF";
        SanPham instance = new SanPham();
        instance.setLoaiSP(loaiSP);
        String sp = "CF";
        assertEquals(sp, instance.getLoaiSP());
    }

    @Test
    public void testGetSize() {
        SanPham instance = new SanPham();
        String expResult = null;
        String result = instance.getSize();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSize() {
        String size = "lớn";
        SanPham instance = new SanPham();
        instance.setSize(size);
        String testsize = "lớn";
        assertEquals(testsize, instance.getSize());
    }

    // dư liêu bth
    @Test
    public void testSetSoLuong() {
        int sl = 1;
        BHChiTietHD instance = new BHChiTietHD();
        instance.setSoLuong((int) sl);
        int ex = 1;
        int result = instance.getSoLuong();
        assertEquals(ex, result, 0.0);
    }

    // giá âm 
    @org.junit.jupiter.api.Test
    public void testSetSoLuongAm() {
        int sl = -120000;
        BHChiTietHD instance = new BHChiTietHD();
        Exception ex = assertThrows(Exception.class, ()-> instance.setSoLuong(sl));
    }

    // nếu số Lượng quá lớn
    @org.junit.jupiter.api.Test
    public void testSetSLMax() {
        int sl = 25000;
        BHChiTietHD instance = new BHChiTietHD();
        Exception exception = assertThrows(Exception.class, ()-> instance.setSoLuong(sl));
    }
    
    @Test
    public void testSetTongTien() {
        int tt = 12000;
        BHChiTietHD instance = new BHChiTietHD();
        instance.setTongTien((int) tt);
        int ex = 12000;
        int result = (int) instance.getTongTien();
        assertEquals(ex, result, 0.0);
    }   
}
