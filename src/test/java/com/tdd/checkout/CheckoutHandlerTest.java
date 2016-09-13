package com.tdd.checkout;


import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CheckoutHandlerTest {

    @Test
    public void testIfCheckoutClassExist(){
        assertNotNull(new CheckoutHandler());
    }

    
}
