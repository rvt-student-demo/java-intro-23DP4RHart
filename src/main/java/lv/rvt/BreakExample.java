package lv.rvt;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        int sum = 0;
        int cipari = 0;
        int average = 0;
        int oddCount = 0;
        int evenCount = 0;

        while (true) {
            System.out.print("Ievadi ciparu: "); 
            int input = Integer.valueOf(scanner.nextLine()); 
            
            if (input == -1) {  
                System.out.println("OK! Bye!");
                break;
            }
            
            sum = sum + input;
            cipari++;
            average = sum / cipari;

            
            if (input % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Visu ciparu summa: " + sum);  
        System.out.println("Ievadīto ciparu skaits: " + cipari);
        System.out.println("Vidējais skaitlis ir:  " + average);
        System.out.println("Nepāra skaitļu skaits: " + oddCount);
        System.out.println("Pāra skaitļu skaits: " + evenCount);
        
        scanner.close();
    }
}


