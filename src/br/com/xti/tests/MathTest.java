package br.com.xti.tests;

import br.com.xti.oop.Math;
import org.junit.*;
import static junit.framework.Assert.*;

public class MathTest {

    Math mathTest;

    @Before
    public void setUp() throws Exception {
        mathTest = new Math();
    }

    @Test
    public void testRoot(){
        assertEquals(4, mathTest.root(16));
    }

    @Test
    public void testBiggest(){
        assertEquals(20, mathTest.biggest(10, 20));
    }

    @Test
    public void testDivide(){
        assertEquals(1.0, mathTest.divide(2,2));
    }

    @Test
    public void testDivideByZero(){
        assertEquals(1.0, mathTest.divide(2,0));
    }

    @Test
    public void testDivide2(){
        assertEquals(1.0, mathTest.divide(2,5));
    }


}
