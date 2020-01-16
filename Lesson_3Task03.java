package com.alex.task03;

public class Lesson_3Task03 {
    public static void main(String[] args) {
        final int WIDTH = 10;
        int line = 0;
        while(line < WIDTH){
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
    }
}
