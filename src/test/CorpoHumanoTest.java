package test;
// CorpoHumanoTest.java
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.CorpoHumano;
import main.java.App;

public class CorpoHumanoTest {
    private CorpoHumano corpo;

    @Before
    public void setUp() {
        corpo = new CorpoHumano(70, 0.07, 1000, 1.75);
    }

    @Test
    public void testGetters() {
        assertEquals(70, corpo.getmassa(), 0.01);
        assertEquals(0.07, corpo.getvolume(), 0.01);
        assertEquals(1000, corpo.getdensidade(), 0.01);
        assertEquals(1.75, corpo.getaltura(), 0.01);
    }

    @Test
    public void testSetters() {
        corpo.setmassa(80);
        assertEquals(80, corpo.getmassa(), 0.01);

        corpo.setvolume(0.08);
        assertEquals(0.08, corpo.getvolume(), 0.01);

        corpo.setdensidade(1100);
        assertEquals(1100, corpo.getdensidade(), 0.01);

        corpo.setaltura(1.80);
        assertEquals(1.80, corpo.getaltura(), 0.01);
    }

    @Test
    public void testCalcularIMC() {
        double expectedIMC = 70 / (1.75 * 1.75);
        assertEquals(expectedIMC, App.calcularIMC(70, 0.07), 0.01);

        corpo.setmassa(80);
        corpo.setaltura(1.80);
        expectedIMC = 80 / (1.80 * 1.80);
        assertEquals(expectedIMC, App.calcularIMC(70, 0.07), 0.01);
    }
}
