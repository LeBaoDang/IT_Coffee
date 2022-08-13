/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Com.IT_Coffee.DAO;

import Com.IT_Coffee.Entity.BHChiTietHD;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author Windows 10 21H1
 */
public class BHChiTietHDIT {
    
    public BHChiTietHDIT() {
    }
    BHChiTietHD chitiethd;
    BHChiTietHDDAO daochitiethd;
    
    @Before
    public void setUp() {
        chitiethd = new BHChiTietHD();
        daochitiethd = new BHChiTietHDDAO();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void Insert(){
        chitiethd.setMaHD("HD9898");
        chitiethd.setMaSP("CF3");
        chitiethd.setTenSP("Bạc xỉu");
        chitiethd.setSoLuong(3);
        chitiethd.setTongTien(510000);
        assertEquals(1, daochitiethd.insert(chitiethd));
    }
    
    
}
