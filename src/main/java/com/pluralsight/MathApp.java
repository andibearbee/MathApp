package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declaring Gary, Bob, and highest salary
        double garySalary = 67000.00;
        double bobSalary = 52000.00;
        double highestSalary = Math.max(garySalary, bobSalary);
        System.out.println("The highest salary is " + highestSalary);
        // Question 2
        //declaring Car Prices
        double carPrice = 75000.99;
        double truckPrice = 134000.99;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);
        // Question 3
        //  Find and display the area of a circle whose radius is 7.25


        double radius = 7.25;
        double area = Math.PI * Math.pow(radius , 2);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area);



        //Question 4
        // Find and display the square root a variable after it is set to 5.0

        double number = 5.0;
        double sqrtValue = Math.sqrt(5.0);

        System.out.println("sqrt of " + number + " is " + sqrtValue);



//        Question 5
//        Find and display the distance between the points (5, 10) and (85, 50)

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between some points "+ distance);






    }

}
