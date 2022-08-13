/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Com.IT_Coffee.DAO;

import Com.IT_Coffee.Entity.HoaDon;
import Com.IT_Coffee.utils.XDate;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Windows 10 21H1
 */
public class HoaDonIT {
    HoaDon hd;
    HoaDonDAO dao;
    public HoaDonIT() {
    }
    
    @Before
    public void setUp() {
        hd = new HoaDon();
        dao = new HoaDonDAO();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInsert() {
        hd.setMaHD("HD9008");
        hd.setMaNV("Duy");
        hd.setNgayThem(XDate.toDate("12-03-2005", "dd-MM-YYYY"));
        hd.setGio("18:11:15");
        assertEquals(1, dao.insert(hd));
    }
    
}
