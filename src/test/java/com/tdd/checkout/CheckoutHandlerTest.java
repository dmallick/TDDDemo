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
    public void testIfSingleApplePriceIsCorrect(){
        assertTrue(checkoutHandler.getPrice("Apple") == 50);
    }
}
