package com.alex.task04;

public class Main {
    public static void main(String[] args) {
        final int WIDTH = 10;
        int line = 0;
        while (line < WIDTH) {
            int space = 0;
            while (space < WIDTH - line) {
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

        int line2 = WIDTH;
        while (line2 > 0) {
            int space2 = 0;
            while (space2 < WIDTH - line2) {
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

