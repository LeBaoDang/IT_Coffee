/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Com.IT_Coffee.UI;

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
public class DangNhapDiaLogIT {
    
    public DangNhapDiaLogIT() {
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
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DangNhapDiaLog.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVali_date() {
        System.out.println("vali_date");
        DangNhapDiaLog instance = null;
        boolean expResult = false;
        boolean result = instance.vali_date();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDangNhap() {
        System.out.println("dangNhap");
        DangNhapDiaLog instance = null;
        instance.dangNhap();
        fail("The test case is a prototype.");
    }

    @Test
    public void testKetthuc() {
        System.out.println("ketthuc");
        DangNhapDiaLog instance = null;
        instance.ketthuc();
        fail("The test case is a prototype.");
    }
    
}
