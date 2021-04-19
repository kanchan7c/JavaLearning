package com.company;

public class Main {

    public static void main(String[] args) {
        float myNum = 2910.68f;
        System.out.println(myNum);
        double weightInPound = 200d;
        double onePoundInKgs = 0.45359237d;
        double weightInKilograms = weightInPound * onePoundInKgs;
        System.out.println(weightInPound+" Pound = " + weightInKilograms+ " Kilograms");
    }
}
