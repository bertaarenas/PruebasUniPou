package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModeloTest {

    private Modelo modelo;

    @BeforeEach
    public void setUp() {
        modelo = new Modelo("TestPou", 80, 80, 50, 80);
    }

    // test 1
    @Test
    public void hambreCeroMuere() {
        modelo.setHambre(0);
        assertFalse(modelo.vivo());
    }

    // test 2
    @Test
    public void felicidadCeroMuere() {
        modelo.setFelicidad(0);
        assertFalse(modelo.vivo());
    }

    // test 3
    @Test
    public void higieneCeroMuere() {
        modelo.setHigiene(0);
        assertFalse(modelo.vivo());
    }

    // test 4
    @Test
    public void limiteEnergia() {
        modelo.setEnergia(200);
        assertEquals(100, modelo.getEnergia());
    }

    // test 5
    @Test
    public void limiteCeroHambre() {
        modelo.setHambre(-50);
        assertEquals(0, modelo.getHambre());
    }

    // test 6
    @Test
    public void dineroNoNegativo() {
        modelo.setDinero(-100);
        assertEquals(0, modelo.getDinero());
    }

    // test 7
    @Test
    public void comidaLogro() {
        assertFalse(modelo.isLogroComido());
        modelo.setLogroComido();
        assertTrue(modelo.isLogroComido());
    }

}
