package vue2D.javafx;

import java.util.Collection;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import vue2D.sprites.HerosSprite;
import vue2D.sprites.ISprite;

/**
*
* @author INFO Professors team
*/

public class Dessin extends Canvas {
    
    private Collection<ISprite> sprites;
    private ILabyrinthe labyrinthe;
    public static int unite = 15;
    private GraphicsContext tampon;
    private Image solImage;
    private Image murImage;
    private Image entreeImage;
    private Image sortieImage;
    private Image persoImage;
   
    public Dessin(ILabyrinthe labyrinthe, Collection<ISprite> sprites)
    {
        this.sprites = sprites;
        this.labyrinthe = labyrinthe;
        setWidth(labyrinthe.getLargeur()*unite);
        setHeight(labyrinthe.getHauteur()*unite);
        tampon = this.getGraphicsContext2D();
        chargementImages();
        dessinFond();
        dessinLabyrinthe();
        dessinEntreeSortie();
    }
    
     public void chargementImages(){
    	solImage = new Image("file:icons/pyramide.png");
        murImage = new Image("file:icons/mur0.gif");
        entreeImage = new Image("file:icons/epee.gif");
        sortieImage = new Image("file:icons/sortie.gif");
        persoImage = new Image("file:icons/LinkRunR1.gif");
    }
    
    public void dessinFond(){
        tampon.drawImage(solImage,0,0,unite*labyrinthe.getLargeur(),
                unite*labyrinthe.getHauteur());
    }
    public void dessinEntreeSortie(){
        //tampon.drawImage(entreeImage,labyrinthe.getEntree().getX()*unite,labyrinthe.getEntree().getY()*unite,unite,unite);
        tampon.drawImage(entreeImage,labyrinthe.getEntree().getX()*unite,labyrinthe.getEntree().getY()*unite,unite,unite);
        tampon.drawImage(sortieImage,labyrinthe.getSortie().getX()*unite,labyrinthe.getSortie().getY()*unite,unite,unite);
    }
    public void dessinLabyrinthe(){
        for(ISalle labyDraw:labyrinthe){
            tampon.drawImage(murImage,labyDraw.getX()*unite,labyDraw.getY()*unite,unite,unite);
        }
    }
    public void dessinSprite( Collection <ISprite> s){
        for(ISprite sprite : s){
            sprite.dessiner(tampon);
        }
    }
}