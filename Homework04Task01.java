package com.alex.homework04;

public class Homework04Task01 {

    static  void  getUniqueSymbols(String str){
        int n = 0;

        while(n < str.length()){
            char symbol = str.charAt(n);
                if (str.indexOf(symbol) == str.lastIndexOf(symbol)){
                    System.out.print(symbol);

                }
                n++ ;
            }
        }
    public static void main(String[] args) {
        getUniqueSymbols("hello world");
    }
}
