/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import java.util.Collection;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import labyrinthe.Salle;
import personnages.Heros;
import personnages.IPersonnage;

/**
 *
 * @author mdemea
 */
public class HerosSprite extends ASprite implements EventHandler<KeyEvent>{

    ILabyrinthe lab;
    Heros heros;
    
    public HerosSprite(IPersonnage heros,Collection<ISalle> lab) {
        super(heros, new Image("file:icons/link/LinkRunShieldL1.gif"));
        this.heros = (Heros)heros;
    }
     

    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        
        return heros.faitSonChoix(sallesAccessibles);
        
    }

    @Override
    public ISalle getPosition() {
        
        return heros.getPosition();
        
    }

    @Override
    public void setPosition(ISalle s) {
        heros.setPosition(s);
    }

    @Override
    public void handle(KeyEvent event) {
        switch (event.getCode()) {
            case LEFT:
                ISalle s1 = new Salle(bob.getPosition().getX() - 1, bob.getPosition().getY());
                heros.salleChoisie = s1;
                System.out.println("Position du personnage : " + bob.getPosition().getX() + " " + bob.getPosition().getY());

                break;
            case RIGHT:
                ISalle s2 = new Salle(bob.getPosition().getX() + 1, bob.getPosition().getY());
                heros.salleChoisie = s2;
                System.out.println("Position du personnage : " + bob.getPosition().getX() + " " + bob.getPosition().getY());
                break;
            case UP:
                ISalle s3 = new Salle(bob.getPosition().getX(), bob.getPosition().getY() - 1);
                heros.salleChoisie = s3;
                System.out.println("Position du personnage : " + bob.getPosition().getX() + " " + bob.getPosition().getY());
                break;
            case DOWN:
                ISalle s = new Salle(bob.getPosition().getX(), bob.getPosition().getY() + 1);
                heros.salleChoisie = s;
                System.out.println("Position du personnage : " + bob.getPosition().getX() + " " + bob.getPosition().getY());
                break;
        }
    }
}