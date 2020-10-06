/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1.model;

import java.util.Observable;

/**
 *
 * @author gl487441
 */
public class Model extends Observable {
    private int count;
    
    public Model()
    {
        count = 0;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public void setCount(int c)
    {
        this.count = c;
        this.updateCount();
    }
    
    public void update(int i)
    {
        this.count += i;
        this.updateCount();
    }
    
    public void updateCount()
    {
        if (this.count < 0) this.count = 0;
        
        setChanged();
        notifyObservers(getCount());
    }
}
