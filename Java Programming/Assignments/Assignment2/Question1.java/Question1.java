// Write a program that checks if a given year is a leap year or not using both if-else and switch-case.

import java.util.Scanner;

class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");

        int num = sc.nextInt();

        if (num % 4 == 0) {

            if (num % 100 == 0) {

                if (num % 400 == 0) {
                    System.out.println(num + " is the leap Year");
                } else {
                    System.out.println(num + " is not a leap Year");
                }
            } else {
                System.out.println(num + " is the leap Year");
            }
        } else {
            System.out.println(num + " is not a leap Year");
        }

    }
}