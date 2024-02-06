package com.framework;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldverifyTheMessage()
    {
        assertEquals("Hello Maven!", new App().getMessage());
    }
}
