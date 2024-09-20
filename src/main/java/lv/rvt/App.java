package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        double num1;
        double num2;
        double res;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ievadiet primo ciparu");
        num1 = scan.nextDouble();
        System.out.println("Ievadiet otro ciparu");
        num2 = scan.nextDouble();


       res=num1+num2;
        System.out.println("Summation: "+res);
        res=num1-num2;
        System.out.println("Subtraction: "+res);
        res=num1*num2;
        System.out.println("Multiplication: "+res);
        res=num1/num2;
        System.out.println("Division: "+res);
       
    }
}
