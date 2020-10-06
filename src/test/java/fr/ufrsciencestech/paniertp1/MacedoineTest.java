/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author gl487441
 */
public class MacedoineTest {
    private Macedoine macedoine;
    
    public MacedoineTest() {
        
    }
    
    @Before
    public void setUp() {
        macedoine = new Macedoine(new Orange());
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAjoute() {
        Orange o = new Orange(12, "France");
        macedoine.ajoute(o);
        assertEquals(macedoine.getFruits().size(), 2);
    }
    
    @Test
    public void testIsSeedless() {
        assertFalse(macedoine.isSeedless());
    }
    
    @Test
    public void testGetPrix() {
        assertTrue(macedoine.getPrix() == 0.5);
    }
    
    @Test
    public void testToString() {
        assertEquals("La macédoine contient 1 fruit(s).", macedoine.toString());
    }
}
