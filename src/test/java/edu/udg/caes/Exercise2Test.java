package edu.udg.caes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.IllegalFormatException;
import java.util.Vector;

public class Exercise2Test {

    @Test
    public void testRepetits(){
        Vector a= new Vector();
        a.add(5);
        a.add(6);
        Vector b= new Vector();
        b.add(5);
        b.add(6);
        final Vector result = Exercise2.union(a, b);
        assertEquals(a,result);
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
        assertThrows(IllegalArgumentException.class,() -> Exercise2.union(a, b));
    }

/*
si dos vector null
Repetits (no ha de haber repetits)
Vectors buits (unio de dos vector buit es null)
voctors tipus diferets (unio ha de llenzar una excepcio IllegalFormatException)
 */


}
