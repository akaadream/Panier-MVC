/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1.model;

import fr.ufrsciencestech.paniertp1.Orange;
import java.util.Observable;
import fr.ufrsciencestech.paniertp1.Panier;
import fr.ufrsciencestech.paniertp1.PanierPleinException;

/**
 *
 * @author gl487441
 */
public class PanierModel extends Observable {
    private Panier panier;
    
    public PanierModel()
    {
        this.panier = new Panier(5);
    }
    
    public void setPanier(Panier p) {
        this.panier = p;
    }
    
    public Panier getPanier()
    {
        return panier;
    }
    
    public void update(int i) throws PanierPleinException
    {
        if (i == 1) {
            // Add a new orange
            if (!getPanier().estPlein()) getPanier().ajout(new Orange(12, "France"));
        }
        else if (i == -1)
        {
            // Remove an orange
            if (!getPanier().estVide()) getPanier().getFruits().remove(getPanier().getFruits().size() - 1);
        }
        
        setChanged();
        notifyObservers(getPanier());
    }
}
