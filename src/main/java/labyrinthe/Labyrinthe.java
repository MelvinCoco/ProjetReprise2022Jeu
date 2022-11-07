package labyrinthe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import outils.Fichier;
import personnages.IPersonnage;

/**
 *
 * @author INFO Professors team
 */
public class Labyrinthe extends ArrayList<ISalle> implements ILabyrinthe {

    protected ISalle entree;
    protected ISalle sortie;
    private int largeur;
    private int hauteur;

    @Override
    public void creerLabyrinthe(String file) {
        Fichier f = new Fichier(file);
        // dimensions
        largeur=f.lireNombre(); 
        hauteur=f.lireNombre();
        int entreeX=f.lireNombre();
        int entreeY=f.lireNombre();
        entree = new Salle((entreeX), entreeY);
        System.out.println(entreeX + entreeY);
        this.add(entree);
        
        int sortieX=f.lireNombre();
        int sortieY=f.lireNombre();
        sortie = new Salle((sortieX),sortieY);
        System.out.println(sortieX + sortieY);
        this.add(sortie);
        int compteur = 0;
        int valeur = f.lireNombre();
        while(valeur != -1){
            int x = valeur;
            int y = f.lireNombre();
            Salle s = new Salle(x,y);
        
        if(this.add(s)){
            valeur = f.lireNombre();
            continue;
        }
            switch (compteur) {
                case 0:
                    //coordonnées entrée
                    entree = s;
                    break;
                case 1:
                    //coordonnées sortie
                    sortie = s;
                    break;
                default:
                    break;
            }
            this.add(s);
            valeur = f.lireNombre();
            compteur++;
        }
    }
    
    public boolean add(ISalle salle){
        if(salle.getX()<=largeur && salle.getY() <= hauteur 
                && salle.getY() >= 0 && salle.getX()>=0 
                && !this.contains(salle)){
            super.add(salle);
            return true;
        }
        return false;
    }

    @Override
    public Collection<ISalle> sallesAccessibles(IPersonnage bob) {
        HashSet<ISalle> salleAccessibles = new HashSet();
        for(ISalle s:this){
        if(s.estAdjacente(bob.getPosition())){
            salleAccessibles.add(s);
        }
    }
        return salleAccessibles;
        
    }

    @Override
    public ISalle getEntree() {
        return entree;
        
    }

    @Override
    public ISalle getSortie() {
        return sortie;
    }

    @Override
    public Collection<ISalle> chemin(ISalle u, ISalle v) {
        return null;
    }

    @Override
    public int getLargeur() {
        return largeur;
    }

    @Override
    public int getHauteur() {
        return hauteur;
    }
}

