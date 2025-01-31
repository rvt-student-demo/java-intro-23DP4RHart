package lv.rvt;

public class Box {
    public double length;
    public double width;
    public double height;
    public double biggerBox;
    public double smallerBox;
    public double outsideBox;
    private double volume;


    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }


    public double topArea(){
        return width * length;
    }
    public double sideArea(){
        return length * width;
    }
 
    public double faceArea() {
        return length * height;
    }
    public double volume(){
        return length * width * height;
    } 
    public Box biggerBox( Box oldBox ){
        return new Box( 1.25*oldBox.width, 1.25*oldBox.length, 1.25*oldBox.height);
} 
    public Box smallerBox(Box oldBox){
        return new Box(0.75*oldBox.width, 0.75*oldBox.length, 0.75*oldBox.height);
    }

    public boolean nests( Box outsideBox){
        if biggerBox.volume > smallerBox.volume{
            return("True");
        }
    }
        
}






