/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1;

import java.util.ArrayList;

/**
 *
 * @author gl487441
 */
public class Macedoine {
    private ArrayList<Fruit> fruits;
    private boolean seedless;
    
    public Macedoine (Fruit f) {
        fruits = new ArrayList<Fruit>();
        fruits.add(f);
        
        seedless = true;
    }
    
    public ArrayList<Fruit> getFruits() {
        return fruits;
    }
    
    public boolean isSeedless() {
        seedless = true;
        
        for (Fruit f : fruits) {
            if (!f.isSeedless()) {
                seedless = false;
            }
        }
        
        return seedless;
    }
    
    public void ajoute(Fruit f) {
        fruits.add(f);
    }
    
    public String toString() {
        return "La macédoine contient " + fruits.size() + " fruit(s).";
    }
    
    public double getPrix() {
        double prix = 0;
        
        for (Fruit f : fruits) prix += f.getPrix();
        
        return prix;
    }
}
