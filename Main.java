package com.alex.task01;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10;
        int line = 1;
        while(line < SIZE){
            int space = SIZE;
            while (space < SIZE) {
                System.out.print(" ");
                space++;
            }
            int star = 0;
            while (star < line) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            line++;
        }
        int line2 = SIZE;
        while (line2 > 0) {
            int space2 = SIZE;
            while (space2 < SIZE ) {
                System.out.print(" ");
                space2++;
            }
            int star2 = 0;
            while (star2 < line2) {
                System.out.print("*");
                star2++;
            }
            System.out.println();
            line2--;
        }
    }
    }

