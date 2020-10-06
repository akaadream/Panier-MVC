/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import static org.mockito.Mockito.*;

/**
 *
 * @author gl487441
 */
public class OrangeTest {
    private Orange orange;
    
    public OrangeTest() {
        
    }
    
    @Before
    public void setUp() {
        orange = new Orange(12, "France");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testToString() {
        assertEquals("Orange de France a 12 euros", orange.toString());
    }
}
