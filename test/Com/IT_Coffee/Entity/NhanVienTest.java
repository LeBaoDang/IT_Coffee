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
public class NhanVienTest {
    
    public NhanVienTest() {
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
    
    // chưa nhập mong muốn là chuối rỗng
    @Test
    public void testGetMaNV() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }
    
    // khi nhap du lieu vao
    @Test
    public void testSetMaNV() {
        String maNV = "HUNG";
        NhanVien instance = new NhanVien();
        instance.setMaNV(maNV);
        String expected = "HUNG";
       assertEquals(expected, instance.getMaNV());
    }

    @Test
    public void testGetMatKhau() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getMatKhau();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMatKhau() {
        String matKhau ="123";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
        String ex = "123";
        assertEquals(ex, instance.getMatKhau());
    }

    @Test
    public void testGetHoTen() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getHoTen();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetHoTen() {
        String hoTen = "LeBaoDang";
        NhanVien instance = new NhanVien();
        instance.setHoTen(hoTen);
        String ht = "LeBaoDang";
        assertEquals(hoTen, instance.getHoTen());
    }

    @Test
    public void testIsGioiTinh() {
        NhanVien instance = new NhanVien();
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, instance.isGioiTinh());
    }

    @Test
    public void testSetGioiTinh() {
        boolean gioiTinh = false;
        NhanVien instance = new NhanVien();
        instance.setGioiTinh(gioiTinh);
    }

    @Test
    public void testIsVaiTro() {
        NhanVien instance = new NhanVien();
        boolean expResult = false;
        boolean result = true ;
        assertEquals(expResult, instance.isVaiTro());
    }

    @Before
    public void testSetVaiTro() {
        boolean vaiTro = false;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
    }

    @Test
    public void testGetDiaChi() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getDiaChi();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDiaChi() {
        String diaChi = "Trà Vinh";
        NhanVien instance = new NhanVien();
        instance.setDiaChi(diaChi);
        String diachi= "Trà Vinh";
        assertEquals(diaChi, instance.getDiaChi());
    }

    @Test
    public void testGetsDT() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getsDT();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetsDT() {
        String sDT = "0961852791";
        NhanVien instance = new NhanVien();
        instance.setsDT(sDT);
        String ex = "0961852791";
        assertEquals(ex, instance.getsDT());
    }

    @Test
    public void testGetEmail() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        String Email = "dangletv@gmail.com";
        NhanVien instance = new NhanVien();
        instance.setEmail(Email);
        String ex = "dangletv@gmail.com";
        assertEquals(ex, instance.getEmail());
    }
    
    
    // test lương nếu lương nhập vào bth 
    @Test
    public void testSetLuong() {
        double luong = 120000;
        NhanVien instance = new NhanVien();
        instance.setLuong(luong);
        double ex = 120000;
        double result = instance.getLuong();
        assertEquals(ex, result, 0.0);
    }
    
    // nếu lương trả là âm 
    @org.junit.jupiter.api.Test
    public void testSetLuongAm() {
        int luong = -120000;
        NhanVien instance = new NhanVien();
        Exception ex = assertThrows(Exception.class, ()-> instance.setLuong(luong));
    }
    
    // nếu lương trả quá lớn
    @org.junit.jupiter.api.Test
    public void testSetLuongMax() {
        double luong = 25000000000d;
        NhanVien instance = new NhanVien();
        Exception exception = assertThrows(Exception.class, ()-> instance.setLuong(luong));
    }
    
    // nếu hình là null
    @Test
    public void testGetHinh() {
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getHinh();
        assertEquals(expResult, result);
    }
    
    // nếu hình có chọn hình
    @Test
    public void testSetHinh() {
        String hinh = "nhanvien1.png";
        NhanVien instance = new NhanVien();
        instance.setHinh(hinh);
        String ex = "nhanvien1.png";
        assertEquals(ex, instance.getHinh());
    }
}
