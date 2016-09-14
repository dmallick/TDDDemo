package com.tdd.checkout;


import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CheckoutHandlerTest {

    CheckoutHandler checkoutHandler;
    List<String> productList;
    @Before
    public void before(){

        checkoutHandler = new CheckoutHandler();
    }

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
        productList = new ArrayList();
        productList.add("Apple");
        assertTrue(checkoutHandler.calculatePrice(productList) ==50);
    }

    @Test
    public void testIf3ApplePriceIsCorrect(){
        productList = new ArrayList();
        productList.add("Apple");
        productList.add("Apple");
        productList.add("Apple");
        assertTrue(checkoutHandler.calculatePrice(productList) == 125);
    }

    @Test
    public void testIf1OrangePriceIsCorrect(){
        productList = new ArrayList();
        productList.add("Orange");

        assertTrue(checkoutHandler.calculatePrice(productList) == 40);
    }

    @Test
    public void testIf2OrangePriceIsCorrect(){
        productList = new ArrayList();
        productList.add("Orange");
        productList.add("Orange");
        assertTrue(checkoutHandler.calculatePrice(productList) == 70);
    }

    @Test
    public void testIf1MangoPriceIsCorrect(){
        productList = new ArrayList();
        productList.add("Mango");

        assertTrue(checkoutHandler.calculatePrice(productList) == 65);
    }

    @Test
    public void testIf3MangoPriceIsCorrect(){
        productList = new ArrayList();
        productList.add("Mango");
        productList.add("Mango");
        productList.add("Mango");
        assertTrue(checkoutHandler.calculatePrice(productList) == 150);
    }

    @Test
    public void testIf1MangoOrangeAndApplePriceIsCorrect(){
        productList = new ArrayList();
        productList.add("Mango");
        productList.add("Orange");
        productList.add("Apple");

        assertTrue(checkoutHandler.calculatePrice(productList) == 155);
    }

}
