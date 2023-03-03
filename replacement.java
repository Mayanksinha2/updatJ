package com.Learning_Java;

public class replacement {
    public static void main(String args[])
    {
        String Str = new String("Mayank Kumar");
        System.out.println("Original String : " + Str);
        System.out.println("Replacement value : " +  Str.replaceFirst("Kumar", "Sinha"));
    }
}

