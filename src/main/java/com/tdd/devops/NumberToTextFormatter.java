package com.tdd.devops;


public class NumberToTextFormatter {
    public boolean validateInput(String inputData) {
        boolean isInputValid = false;
        try {
            int number = Integer.parseInt(inputData);
            isInputValid = true;
        }catch (NumberFormatException e) {

        }
        return isInputValid;
    }
}
