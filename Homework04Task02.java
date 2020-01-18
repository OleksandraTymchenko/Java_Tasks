package com.alex.homework04;

public class Homework04Task02 {
    
    static void getByteCode(int x){
        int y;
        String str ="";
        while (x != 0){
            y = x%2;
            str = y + str;
            x = x/2;
        }
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        getByteCode(1090900);
    }
}
