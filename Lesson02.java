package com.sasha.task02;

import java.util.Scanner;

public class Lesson02 {
    public static void main(String[] args) {
        // First task
        int number = 123;
        int numbRev = number % 10 * 100 + number / 10 % 10 * 10 + number / 100 % 10;
        int numberMinusnumRev = number - numbRev;
        System.out.println( "Result" + " : " + numberMinusnumRev);

        // Second task
        System.out.println("Введите число в фунтах: ");
        Scanner sc = new Scanner (System.in);
        double weight = sc.nextDouble();
        double funtInGramms = weight * 453.6;
        int kilo = (int) funtInGramms / 1000;
        int gramms = (int)funtInGramms % 1000;
        System.out.println(weight + " Funt" + " = " + kilo + " Kilo " + gramms + " gramms");

        // Third task
        int deposit = 2000;
        int month = 3;
        int procentInYear = 14;
        double oneDayProfit = (deposit/100.0*14)/365;
        double threeMonthProfit = oneDayProfit * 90;
        System.out.println("Прибыль составит " + threeMonthProfit);


        }

    }

