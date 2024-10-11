package lv.rvt;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    System.out.print("Cik reizes?");
    int number = Integer.parseInt(reader.nextLine());
    int i = 0;
    while (i <= number){
        i++;
        printText();
    }


    

  

    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
    
}
