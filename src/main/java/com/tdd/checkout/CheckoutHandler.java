package com.tdd.checkout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutHandler {

    private Map<String, Map<Integer, Integer>> productPriceMap;

    public CheckoutHandler() {
        loadPriceRules();
    }


    public boolean loadPriceRules() {
        boolean isSuccessful = true;
        Map<Integer, Integer> applePriceMap =  new HashMap();
        Map<Integer, Integer> orangePriceMap=  new HashMap();
        Map<Integer, Integer> mangoPriceMap=  new HashMap();

        try {
            productPriceMap  =  new HashMap();

            applePriceMap.put(Integer.valueOf(1),Integer.valueOf((50)));
            applePriceMap.put(Integer.valueOf(3),Integer.valueOf((125)));

            orangePriceMap.put(Integer.valueOf(1),Integer.valueOf((40)));
            orangePriceMap.put(Integer.valueOf(2),Integer.valueOf((70)));

            mangoPriceMap.put(Integer.valueOf(1),Integer.valueOf((65)));
            mangoPriceMap.put(Integer.valueOf(3),Integer.valueOf((150)));

            productPriceMap.put("Apple", applePriceMap);
            productPriceMap.put("Orange", orangePriceMap);
            productPriceMap.put("Mango", mangoPriceMap);
        }catch (Exception e){
            isSuccessful = false;
        }
        return isSuccessful;
    }


    public int getPrice(String apple, int numbers) {
        return productPriceMap.get(apple).get(numbers);
    }

    public int calculatePrice(List<String> productList) {
        Map<String, Integer> productNumberMap = new HashMap();
        int totalPrice = 0;
        int numberOfProduct= 1;
        for (String product: productList){
            if (productNumberMap.get(product) == null) {
                numberOfProduct = 0;
                productNumberMap.put(product, ++numberOfProduct);
            }else
            productNumberMap.put(product, ++numberOfProduct);
        }
        for (String product: productNumberMap.keySet()){
            totalPrice = totalPrice + productPriceMap.get(product).get(productNumberMap.get(product));
        }
        //totalPrice = productPriceMap.get(apple).get(numbers)

        return totalPrice;
    }


}
