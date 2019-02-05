package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // equation for BMI is BMI=kg/m*m
        Scanner keyboard;
        int inches, pounds;
        keyboard = new Scanner(System.in);
        System.out.println("What is your height in inches?");
        inches = keyboard.nextInt();
        System.out.println("What is your weight in pounds?");
        pounds = keyboard.nextInt();

        double meters, kg,BMI;
        meters = inches*(0.0254/1);
        kg = pounds*(0.453592/1);

        BMI = kg/(meters*meters);
        System.out.println("Your BMI is "+BMI);


    }
}
