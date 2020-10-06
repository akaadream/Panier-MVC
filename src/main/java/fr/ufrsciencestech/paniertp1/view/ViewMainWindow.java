/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1.view;

import fr.ufrsciencestech.paniertp1.controller.Controller;
import fr.ufrsciencestech.paniertp1.Panier;
import java.awt.BorderLayout;
import java.util.Observable;
import javax.swing.*;

/**
 *
 * @author gl487441
 */
public class ViewMainWindow extends JFrame implements View {
    private JButton incrementButton;
    private JButton decrementButton;
    private JLabel displayLabel;
    
    public ViewMainWindow() {
        super("Panier");
        
        incrementButton = new JButton("+");
        decrementButton = new JButton("-");
        displayLabel = new JLabel("0 oranges / 0", JLabel.CENTER);
        
        add(incrementButton, BorderLayout.NORTH);
        add(decrementButton, BorderLayout.SOUTH);
        add(displayLabel, BorderLayout.CENTER);
        
        incrementButton.setName("plus");
        decrementButton.setName("minus");
        displayLabel.setName("display");
        
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void addController(Controller c) {
        getIncrementButton().addActionListener(c);
        getDecrementButton().addActionListener(c);
    }
    
    @Override
    public void update(Observable m, Object panier) {
        Panier p = (Panier) panier;
        getDisplayLabel().setText(((Integer) p.getTaillePanier()).toString() + " oranges / " + p.getContenanceMax() + " contenance max");
    }
    
    public JButton getIncrementButton() {
        return incrementButton;
    }
    
    public void setIncrementButton(JButton b) {
        this.incrementButton = b;
    }
    
    public JButton getDecrementButton() {
        return decrementButton;
    }
    
    public void setDecrementButton(JButton b) {
        this.decrementButton = b;
    }
    
    public JLabel getDisplayLabel() {
        return displayLabel;
    }
    
    public void setDisplayLabel(JLabel l) {
        this.displayLabel = l;
    }
}
