package lv.rvt;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

     
        if (number < 0) {
            System.out.println("Error! Factorial for negative numbers does not exist.");
        } 
        
        else if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        } 
       
        else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }

       
        scanner.close();
    }
}
