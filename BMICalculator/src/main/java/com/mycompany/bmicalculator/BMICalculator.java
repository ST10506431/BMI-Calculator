/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bmicalculator;

import java.util.Scanner;

/**
 *
 * @author hazel
 */

/*
Activity 5: BMI Calculator
Objective: Learn how to use division and multiplication in a real-world formula.
Steps to Follow:
1. Create a new Java project called BMICalculator.
2. Import the Scanner class at the beginning.
3. Inside the main method, do the following:
o Ask the user to enter:
▪ Weight in kilograms (kg)
▪ Height in meters (m)
o Use the formula:
BMI = weight / (height × height)
o Divide the weight by the square of the height.
o Display the BMI value.
*/
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.print("Please enter in you weight in kilograms:");
         double weight = scan.nextDouble();
         System.out.print("Please enter in you hieght in meters:");
         double height = scan.nextDouble();
         
         double bmi = (weight)/(height*height);
        System.out.println("Your weight  is : " +weight+ "kg");

         System.out.println("Your height is : " +height+ "m");
         System.out.println("Your bmi is : " +bmi);

         scan.close();
    }
}
