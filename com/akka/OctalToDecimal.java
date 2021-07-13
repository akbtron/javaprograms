package com.akka;

public class OctalToDecimal {
    public static void main(String[] args) {
        int decimal = convertToDecimal("17");
        System.out.println("The decimal number is :"+decimal);
    }

    private static int convertToDecimal(String s) {
        int conversion = 1;
        int result = 0;

        for(int i=1;i<=s.length();i++){
            int octalNum = Integer.parseInt(s.charAt(s.length() - i) + "");
            result+= conversion*octalNum;
            conversion = conversion * 8;
        }

        return result;
    }
}
