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
public class SanPhamTest {
    
    public SanPhamTest() {
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
    
    // giá bth
    @Test
    public void testGetDonGia() {
        double dongia = 120000;
        SanPham instance = new SanPham();
        instance.setDonGia(dongia);
        double ex = 120000;
        double result = instance.getDonGia();
        assertEquals(ex, result, 0.0);
    }
    
    
    // nếu giá là âm
    @org.junit.jupiter.api.Test
    public void testSetDonGiaAm() {
        int donGia = -120000;
        SanPham instance = new SanPham();
        Exception ex = assertThrows(Exception.class, ()-> instance.setDonGia(donGia));
    }

    // nếu dongia quá lớn
    @org.junit.jupiter.api.Test
    public void testSetDonGiaMax() {
        double dongia = 25000000000d;
        SanPham instance = new SanPham();
        Exception exception = assertThrows(Exception.class, ()-> instance.setDonGia(dongia));
    }

    // nếu hình là null
    @Test
    public void testGetHinh() {
        SanPham instance = new SanPham();
        String expResult = null;
        String result = instance.getHinh();
        assertEquals(expResult, result);
    }
    
    // nếu hình có chọn hình
    @Test
    public void testSetHinh() {
        String hinh = "nhanvien1.png";
        SanPham instance = new SanPham();
        instance.setHinh(hinh);
        String ex = "nhanvien1.png";
        assertEquals(ex, instance.getHinh());
    }
    
}
