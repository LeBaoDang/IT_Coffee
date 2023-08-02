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

/**
 *
 * @author LeBaoDang
 */
public class LoaiSPTest {
    
    public LoaiSPTest() {
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
    public void testGetMaLoaiSP() {
        LoaiSP instance = new LoaiSP();
        String expResult = null;
        String result = instance.getMaLoaiSP();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMaLoaiSP() {
        String maLoaiSP = "ML2";
        LoaiSP instance = new LoaiSP();
        instance.setMaLoaiSP(maLoaiSP);
        String testmlsp = "ML2";
        assertEquals(testmlsp, instance.getMaLoaiSP());
    }

    @Test
    public void testGetTenLoaiSP() {
        LoaiSP instance = new LoaiSP();
        String expResult = null;
        String result = instance.getTenLoaiSP();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTenLoaiSP() {
        String tenLoaiSP = "CF";
        LoaiSP instance = new LoaiSP();
        instance.setTenLoaiSP(tenLoaiSP);
        String testtlsp = instance.getTenLoaiSP();
        assertEquals(testtlsp, instance.getTenLoaiSP());
    }
    
}
