/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ajy10
 */
public class MidTermTest {
    MidTerm test = new MidTerm();
    public MidTermTest() {
        
    }

    @Test
    public void testCalcCuvedScore() {
        test.setTestScore(10);
        assertEquals("Testing a score of 10", test.calcCurvedScore(), 32);
        test.setTestScore(50);
        assertEquals("Testing a score of 50", test.calcCurvedScore(), 71);
        test.setTestScore(80);
        assertEquals("Testing a score of 80", test.calcCurvedScore(), 89);
    }
    
}
