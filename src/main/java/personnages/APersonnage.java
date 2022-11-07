/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import javafx.scene.chart.XYChart;
import labyrinthe.ISalle;
import labyrinthe.Salle;

/**
 *
 * @author mdemea
 */
public abstract class APersonnage implements  IPersonnage{
    
    int x;
    int y;

    // renvoie sa position courante
    @Override
    public ISalle getPosition() {
        return new Salle(x,y);
    }
    
    // definit sa position courante
    @Override
    public void setPosition( ISalle s) {
        this.x = s.getX();
        this.y = s.getY();
    }
}
