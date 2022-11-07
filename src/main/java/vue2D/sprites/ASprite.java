/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import java.util.Collection;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import personnages.IPersonnage;
import static vue2D.javafx.Dessin.unite;

/**
 *
 * @author mdemea
 */
public  abstract class ASprite implements ISprite{
    
    IPersonnage bob;
     public Image imageSprite;
    
    public ASprite(IPersonnage bob,Image imageSprite){
        this.bob = bob;
        this.imageSprite = imageSprite;
    }

    @Override
    public void dessiner(GraphicsContext g) {
        g.drawImage(imageSprite, bob.getPosition().getX() * unite , bob.getPosition().getY() * unite);
    }

    @Override
    public void setCoordonnees(int xpix, int ypix) {
    }

    public IPersonnage getBob() {
        return bob;
    }

    public Image getImageSprite() {
        return imageSprite;
    }

    public void setBob(IPersonnage bob) {
        this.bob = bob;
    }

    public void setImageSprite(Image imageSprite) {
        this.imageSprite = imageSprite;
    }
}
