package br.com.xti.tests;

import br.com.xti.oop.polymorphism.Cube;
import org.junit.*;
import static junit.framework.Assert.*;

public class CubeTest {

    Cube cube;

    @Before
    public void setUp() throws Exception{
        cube = new Cube(10);
    }

    @Test
    public void testCalculateVolume(){
        assertEquals(1000, cube.calculateVolume(), 0);
    }

    @Test
    public void testCalculateArea(){
        assertEquals(600, cube.calculateArea(), 0);
    }

}
