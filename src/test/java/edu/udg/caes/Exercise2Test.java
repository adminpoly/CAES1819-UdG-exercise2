package edu.udg.caes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.IllegalFormatException;
import java.util.Vector;

public class Exercise2Test {

    @Test
    public void testNull(){
        Vector a= null;
        Vector b= null;

        final Vector result = Exercise2.union(a, b);
        assertNull(result);
    }

    @Test
    public void testPrimerVectorNull(){
        Vector a= null;
        Vector b= new Vector(4);
        b.add(1);

        final Vector result = Exercise2.union(a, b);
        assertEquals(result,b);
    }

    @Test
    public void testRepetits(){
        Vector a= new Vector();
        a.add(5);
        a.add(6);
        Vector b= new Vector();
        b.add(5);
        b.add(6);
        final Vector result = Exercise2.union(a, b);
        assertEquals(result,b);
    }

    @Test
    public void testVectorBuits(){
        Vector a= new Vector();
        Vector b= new Vector();
        final Vector result = Exercise2.union(a, b);
        assertNull(result);
    }

    @Test
    public void testTipusDiferents(){
        Vector a= new Vector();
        a.add(1);
        Vector b= new Vector();
        b.add("b");
        //final Vector result = Exercise2.union(a, b);
        assertThrows(IllegalFormatException.class,() -> Exercise2.union(a, b));
    }



}
