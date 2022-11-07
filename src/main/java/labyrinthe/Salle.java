/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labyrinthe;

import javafx.scene.input.KeyCode;

/**
 *
 * @author mdemea
 */
public class Salle implements ISalle{

    int x;
    int y;

    public Salle(int x, int y) {
        this.x =x;
        this.y=y;
    }
/**
 * 
 * 
 * @param x 
 */
    public void setX(int x){
        this.x= x;
    }
/**
 * 
 * @param y 
 */
    public void setY(int y){
        this.y= y;
    }
    /**
     * Permet de vérifier si deux salles sont adjacentes.
     * 
     * @param b
     * @return vrai si deux salles sont adjacentes.
     */
    @Override
    public boolean estAdjacente(ISalle b) {
        boolean estAdjacente;
        estAdjacente = (Math.abs(this.getX()-b.getX())==1)&& b.getY()==this.getY()||
                Math.abs(this.getY()-b.getY())==1 && b.getX()==this.getX();
        return estAdjacente;
    }
    /**
     * Permet de vérifier si deux salles sont sur les mêmes coordonnées.
     * 
     * @param b la deuxième salle.
     * @return vrai si les deux salles possèdent les mêmes coordonnées.
     */
    public boolean estIdentique(ISalle b){
        boolean sontIdentiques;
        sontIdentiques = this.getX() == b.getX() && this.getY() == b.getY();
        return sontIdentiques;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
