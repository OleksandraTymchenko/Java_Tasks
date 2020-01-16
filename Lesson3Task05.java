package com.alex.task05;

public class Lesson3Task05 {
    public static void main(String[] args) {
        final int MIDDLE = 10;
        int line = 0;
        while(line < MIDDLE){
            int space = 0;
            while (space < MIDDLE - line) {
                System.out.print(" ");
                space++;
            }
            int star = 0;
            while (star < line*2 + 1) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            line++;
        }

        int line2 = MIDDLE;
        while(line2 > -1){
            int space2 = 0;
            while (space2 < MIDDLE - line2) {
                System.out.print(" ");
                space2++;
            }
            int star2 = 0;
            while (star2 < line2*2 + 1) {
                System.out.print("*");
                star2++;
            }
            System.out.println();
            line2--;
        }
    }
}

