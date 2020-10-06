/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1;

import fr.ufrsciencestech.paniertp1.controller.Controller;
import fr.ufrsciencestech.paniertp1.model.Model;
import fr.ufrsciencestech.paniertp1.model.PanierModel;
import fr.ufrsciencestech.paniertp1.view.View;
import fr.ufrsciencestech.paniertp1.view.ViewMainWindow;

/**
 *
 * @author gl487441
 */
public class Root {
    private ViewMainWindow view;
    private Controller controller;
    
    public void setView(ViewMainWindow v) {
        this.view = v;
    }
    
    public ViewMainWindow getView() {
        return view;
    }
    
    public void setController(Controller c) {
        this.controller = c;
    }
    
    public Controller getController() {
        return controller;
    }
    
    public Root() {
        view = new ViewMainWindow();
        controller = new Controller();
        PanierModel model = new PanierModel();
        
        controller.setModel(model);
        model.addObserver(view);
        view.addController(controller);
        try { model.update(0); } catch (PanierPleinException ex) {}
    }
    
    public static void main(String[] args) {
        Root root = new Root();
    }
}
