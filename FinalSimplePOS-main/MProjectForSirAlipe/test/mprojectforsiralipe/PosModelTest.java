
package mprojectforsiralipe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PosModelTest {
    
    public PosModelTest() {
    }
    

    @Test
    public void testGetProName() {
        System.out.println("getProName");
        PosModel ob = new PosModel();
        ob.setProName("arabit");
        String expResult = "arabit";
        String result = ob.getProName();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testSetProName() {
        System.out.println("setProName");
        String proName = "Arabit";
        PosModel ob = new PosModel();
        ob.setProName(proName);
        
 
    }

    
    @Test
    public void testGetStocks() {
        System.out.println("getStocks");
        PosModel ob = new PosModel();
        ob.setStocks(5);
        int expResult = 5;
        int result = ob.getStocks();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testSetStocks() {
        System.out.println("setStocks");
        int stocks = 5;
        PosModel ob = new PosModel();
        ob.setStocks(stocks);
        
    }

   
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        PosModel ob = new PosModel();
        ob.setPrice(10);
        int expResult = 10;
        int result = ob.getPrice();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 2;
        PosModel ob = new PosModel();
        ob.setPrice(price);
        
    }

    
    @Test
    public void testCalculateOrder() {
        System.out.println("calculateOrder");
        int num1 = 1;
        int num2 = 1;
        int expResult = 1;
        int result = PosModel.calculateOrder(num1, num2);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSubNumbers() {
        System.out.println("subNumbers");
        int num1 = 2;
        int num2 = 1;
        int expResult = 1;
        int result = PosModel.subNumbers(num1, num2);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testUpdateStocks() {
        System.out.println("updateStocks");
        int stock = 5;
        int qty = 2;
        int expResult = 3;
        int result = PosModel.updateStocks(stock, qty);
        assertEquals(expResult, result);
        
    }
    
}
