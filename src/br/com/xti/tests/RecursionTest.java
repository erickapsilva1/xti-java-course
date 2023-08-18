package br.com.xti.tests;

import br.com.xti.oop.polymorphism.Cube;
import br.com.xti.refined.Recursion;
import org.junit.*;
import static junit.framework.Assert.*;

public class RecursionTest {

    @Test
    public void testSum(){
        assertEquals(55, Recursion.sum(10));
    }

    @Test
    public void testPow(){
        assertEquals(81, Recursion.pow(3,4));
    }
}
