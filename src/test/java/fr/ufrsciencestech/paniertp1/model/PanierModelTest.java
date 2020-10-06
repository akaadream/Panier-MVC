/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1.model;

import fr.ufrsciencestech.paniertp1.Panier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gl487441
 */
public class PanierModelTest {
    private PanierModel model;
    private Panier panier;
    
    public PanierModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        model = new PanierModel();
        panier = new Panier(5);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPanier method, of class PanierModel.
     */
    @Test
    public void testSetPanier() {
        model.setPanier(panier);
        assertEquals(model.getPanier(), panier);
    }

    /**
     * Test of getPanier method, of class PanierModel.
     */
    @Test
    public void testGetPanier() {
        assertEquals(model.getPanier(), panier);
    }

    /**
     * Test of update method, of class PanierModel.
     */
    @Test
    public void testUpdateAdd() throws Exception {
        model.update(1);
        assertTrue(model.getPanier().getTaillePanier() == 1);
        assertFalse(model.getPanier().estPlein());
    }
    
    @Test
    public void testUpdateAddPanierPlein() throws Exception {
        model.update(1);
        model.update(1);
        model.update(1);
        model.update(1);
        model.update(1);
        assertTrue(model.getPanier().estPlein());
        assertTrue(model.getPanier().getTaillePanier() == 5);
    }
    
    @Test
    public void testUpdateRemove() throws Exception {
        model.update(-1);
        assertTrue(model.getPanier().getTaillePanier() == 0);
        assertTrue(model.getPanier().estVide());
    }
    
    @Test
    public void testUpdateRemoveVide() throws Exception {
        model.update(-1);
        model.update(-1);
        model.update(-1);
        model.update(-1);
        model.update(-1);
        assertTrue(model.getPanier().estVide());
        assertTrue(model.getPanier().getTaillePanier() == 0);
    }
    
}
