package labyrintheTest;

import labyrinthe.ISalle;
import labyrinthe.Salle;
import static org.junit.Assert.*;

import org.junit.Test;

public class SalleTest{

    @Test
    public void estAdjacentesTest(){
        Salle a = new Salle(16,16);
        Salle b = new Salle(16,15);
        assertTrue(a.estAdjacente(b));
        
        Salle c = new Salle(9,9);
        Salle d = new Salle(10, 11);
        assertFalse(c.estAdjacente(d));
        
        Salle e = new Salle(13,13);
        Salle f = new Salle(13,13);
        assertFalse(e.estAdjacente(f));
    }
    @Test
    public void estIdentiqueTest(){
        Salle a = new Salle(16,16);
        Salle b = new Salle(16,15);
        assertFalse(a.estIdentique(b));
        
        Salle c = new Salle(9,9);
        Salle d = new Salle(10, 11);
        assertFalse(c.estIdentique(d));
        
        Salle e = new Salle(13,13);
        Salle f = new Salle(13,13);
        assertTrue(e.estIdentique(f));
    }

}