/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1.controller;

import fr.ufrsciencestech.paniertp1.PanierPleinException;
import fr.ufrsciencestech.paniertp1.model.Model;
import fr.ufrsciencestech.paniertp1.model.PanierModel;
import fr.ufrsciencestech.paniertp1.view.ViewMainWindow;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author gl487441
 */
public class Controller implements ActionListener {
    private PanierModel model;
    private ViewMainWindow view;
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // Try to update panier
        try {
            switch (((Component)e.getSource()).getName())
            {
                case "plus":
                    // Add a new fruit
                    model.update(1);
                    break;
                case "minus":
                    // Remove an existing fruit
                    model.update(-1);
                    break;
                default:
                    break;
            }
        }
        catch (PanierPleinException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setModel(PanierModel m) {
        this.model = m;
    }
    
    public void setView(ViewMainWindow v) {
        this.view = v;
    }
}
