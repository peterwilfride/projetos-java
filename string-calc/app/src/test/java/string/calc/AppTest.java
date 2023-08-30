/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package string.calc;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void appHasAGreeting() {
        StringCalculator sc = new StringCalculator();

        assertEquals(0, sc.add(""));
        assertEquals(1, sc.add("1"));
        assertEquals(3, sc.add("1,2"));
        assertEquals(8, sc.add("3,5"));
        assertEquals(6, sc.add("1,2,3"));
        assertEquals(25, sc.add("3,4,5,6,7"));
        assertEquals(12, sc.add("0,3,5,4"));

        assertEquals(6, sc.addDel("//,\n1,2,3"));
        assertEquals(25, sc.addDel("//;\n3;4;5;6;7"));
        assertEquals(12, sc.addDel("//;\n0;3;5;4"));
    }

    @Test
    public void check_set_bits() {
        SetBits sb = new SetBits();

        assertEquals(255, sb.eliminateUnsetBits("11010101010101"));
        assertEquals(7, sb.eliminateUnsetBits("111"));
        assertEquals(1, sb.eliminateUnsetBits("100000"));
        assertEquals(0, sb.eliminateUnsetBits("000"));
    }

    @Test
    public void array_printer() {
        ArrayPrinter ap = new ArrayPrinter();

        Integer[] array = new Integer[] { 2, 4, 5, 2 };
        assertEquals("2,4,5,2", ap.printArray(array));

        
    }
}
