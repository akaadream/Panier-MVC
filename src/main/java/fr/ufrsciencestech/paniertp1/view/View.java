/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1.view;

import fr.ufrsciencestech.paniertp1.controller.Controller;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author gl487441
 */
public interface View extends Observer {
    @Override
    public void update(Observable obs, Object o);
    public void addController(Controller c);
}
