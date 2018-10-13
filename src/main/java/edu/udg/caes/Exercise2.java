package edu.udg.caes;

import java.util.IllegalFormatException;
import java.util.Vector;

public class Exercise2 {

    /**
     * Vector union operation
     *
     *  @param a first vector
     *  @param b second vector
     *  @return objects that are in either one of the two argument vectors
     *          si dos vectors son de diferent tipus es llanza una excepcio IllegalArgumentException
     *          si els dos vectors son buits retorna nullç
     *
     */
    public static Vector union (Vector a, Vector b)
    {
        if(a.size()!=0 && b.size()!=0) {
            if(b.get(0).getClass() !=  a.get(0).getClass() )
                throw new IllegalArgumentException();
            else {
                Vector<Object> unio = new Vector<Object>();
                unio.addAll(a);
                for (Object x : b){
                    if (!unio.contains(x))
                        unio.add(x);
                }
                return unio;
            }
        }
        return null;
    }

}
