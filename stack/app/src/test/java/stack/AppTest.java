/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void eh_cadeia_de_parentesis_valida() {
        assertTrue(App.ehCadeiaParentesisValida("((()))"));
        assertTrue(App.ehCadeiaParentesisValida("(())"));

        assertFalse(App.ehCadeiaParentesisValida("((()"));
        assertFalse(App.ehCadeiaParentesisValida(")))"));
    }

    @Test
    public void eh_cadeia_de_parentesis_chaves_colchete_valida() {
        assertTrue(App.ehCadeiaParentesisEchavesEColchetesValida("({[]})"));
        assertTrue(App.ehCadeiaParentesisEchavesEColchetesValida("({})"));
        assertTrue(App.ehCadeiaParentesisEchavesEColchetesValida("()"));
        assertTrue(App.ehCadeiaParentesisEchavesEColchetesValida("[{}]"));
        assertTrue(App.ehCadeiaParentesisEchavesEColchetesValida("([{}])"));

        assertFalse(App.ehCadeiaParentesisValida("(({}"));
        assertFalse(App.ehCadeiaParentesisValida("(({}]]"));
    }

    @Test
    public void conversor_romano_inteiro() {
        assertEquals(3, App.converterRomanoInteiro("III"));
        assertEquals(12, App.converterRomanoInteiro("XII"));
        assertEquals(44, App.converterRomanoInteiro("XLIV"));
        assertEquals(90, App.converterRomanoInteiro("XC"));
        assertEquals(444, App.converterRomanoInteiro("CDXLIV"));
        assertEquals(1994, App.converterRomanoInteiro("MCMXCIV"));
    }
}
