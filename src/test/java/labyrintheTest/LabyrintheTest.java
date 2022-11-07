package labyrintheTest;

import java.io.IOException;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import labyrinthe.Labyrinthe;
import labyrinthe.Salle;

import static org.junit.Assert.*;

import org.junit.Test;
import outils.Fichier;

public class LabyrintheTest{

    @Test
    public void creerLabyrintheTest(){
        System.out.println("creerLabyrinthe");
        String file ="labys/levelInvalide3.txt";
        Labyrinthe instance = new Labyrinthe();
        instance.creerLabyrinthe(file);
        for(int i =0;i<instance.size();i++){
            for(int j=i+1;j<instance.size();j++){
                assertTrue(instance.get(i).equals(instance.get(j)));
            }
        }
        boolean dansLaby = false;
        for(ISalle s:instance){
            System.out.println(s);
            if(s.getX()<=instance.getLargeur() && s.getY()<=instance.getHauteur()
                && s.getY() >= 0 && s.getX()>=0){
                dansLaby=true;
            }
        }
    }
    
}