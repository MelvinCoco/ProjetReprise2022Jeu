/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;
 import java.util.Collection;
import labyrinthe.ISalle;

/**
 *
 * @author mdemea
 */
public class Heros extends APersonnage{
    public ISalle salleChoisie;

    public Heros(ISalle salleChoisie) {
        this.salleChoisie = salleChoisie;
        this.x = salleChoisie.getX();
        this.y = salleChoisie.getY();
    }

    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        if(sallesAccessibles.contains(salleChoisie)){
            return salleChoisie;    
        }
        else{
            return this.getPosition();
        }
    }

    @Override
    public ISalle getPosition() {
        
        return salleChoisie;
        
    }

    @Override
    public void setPosition(ISalle s) {
        this.setPosition(s);
    }
    
    
    
}
