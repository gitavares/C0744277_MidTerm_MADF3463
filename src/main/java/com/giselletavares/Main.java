package com.giselletavares;

public class Main {

    public static void main(String[] args) {

        LambtonStringTools str = new LambtonStringTools();

        // reverse
        System.out.println("reverse: " + str.reverse("Lambton"));

        // binary to decimal
        System.out.println("binaryToDecimal: " + str.binaryToDecimal("1000"));
        System.out.println("binaryToDecimal: " + str.binaryToDecimal("10001"));
        System.out.println("binaryToDecimal: " + str.binaryToDecimal("111111"));
        System.out.println("binaryToDecimal: " + str.binaryToDecimal("111112"));
        System.out.println("binaryToDecimal: " + str.binaryToDecimal("100001.1"));
        System.out.println("binaryToDecimal: " + str.binaryToDecimal(""));

        // replaceSubString
        System.out.println("replaceSubString: " + str.replaceSubString("the dog jumped over the fence", "the", "that"));



        // initials
        System.out.println("Initials: " + str.initials(" Giselle Cristina Tavares "));

        // mostFrequent
        System.out.println("Most Frequent: " + str.mostFrequent("Some sentence"));





    }


}
