package com.tdd.checkout;


import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CheckoutHandlerTest {

    CheckoutHandler checkoutHandler;

    @Before
    public void before(){ checkoutHandler = new CheckoutHandler();    }

    @Test
    public void testIfCheckoutClassExist(){
        assertNotNull(checkoutHandler);
    }

    @Test
    public void testIfPriceRulesHasBeenLoaded(){
        assertTrue(checkoutHandler.loadPriceRules());
    }

    @Test
    public void testIf1ApplePriceIsCorrect(){
        assertTrue(checkoutHandler.getPrice("Apple") == 50);
    }

    @Test
    public void testIf3ApplePriceIsCorrect(){
        assertTrue(checkoutHandler.getPrice("Apple") == 125);
    }

    @Test
    public void testIf1OrangePriceIsCorrect(){
        assertTrue(checkoutHandler.getPrice("Orange") == 40);
    }

    @Test
    public void testIf2OrangePriceIsCorrect(){
        assertTrue(checkoutHandler.getPrice("Orange") == 70);
    }

    @Test
    public void testIf1MangoPriceIsCorrect(){
        assertTrue(checkoutHandler.getPrice("Mango") == 65);
    }

    @Test
    public void testIf3MangoPriceIsCorrect(){
        assertTrue(checkoutHandler.getPrice("Mango") == 150);
    }
}
