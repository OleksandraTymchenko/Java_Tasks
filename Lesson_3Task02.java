package com.alex.task02;

public class Lesson_3Task02 {
    public static void main(String[] args) {
        final int WIDTH = 10;
        int line = WIDTH;
        while(line > 0){
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
            line--;
        }
    }
}

