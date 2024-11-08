package lv.rvt;

public class Stars {
    // Method to print stars
    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");  
            i++;  
        }
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");  
            i++;  
        }
    }
    

    public static void main(String[] args) {
        
      

        // printSquare(4);
        // System.out.println();

        // printRectangle(17, 3);
        // System.out.println();

        // printTriangle(4);
        //printTriangle2(4);
        christmassTree(20);
       
    }
    public static void printSquare(int size){
        for (int i = 0; i < size; i++){
            printStars(size);
            
        }
     
    }
    public static void printRectangle(int widt, int height){
        for (int i = 0; i < height; i++)    {  
            printStars(widt);
        }
    }

     public static void printTriangle(int size){
        for (int i = 1; i <= size; i++){
            printStars(i);
        }
    
    }
    public static void printTriangle2(int size){
        for (int i = 1; i <= size; i++){
            printSpaces(size - i);
            printStars(i);
            System.out.println(); // \n
        }
    
    }

    public static void christmassTree(int height) {
        for (int i = 0; i <= height; i++){
            printSpaces(height - i);
            printStars(i * 2 + 1);
            System.out.println();
        }
        printSpaces(height - 1);
        printStars(3);
        System.out.println();
        printSpaces(height - 1);
        printStars(3);
        System.out.println();

    }

}
