package com.alex.homework04;

public class Homework04Task03 {
    
    static void changeToString(int x){
        String str = "" + x;
        char firstChar = str.charAt(str.length()-1);
        char lastChar = str.charAt(str.length()-2);
        String newString = Character.toString(firstChar) + Character.toString(lastChar);
        System.out.println( newString);
    }
    
    public static void main(String[] args) {
        changeToString(689790);
    }
}
