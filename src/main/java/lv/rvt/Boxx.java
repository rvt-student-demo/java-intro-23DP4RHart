package lv.rvt;

public class Boxx {
    public double length;
    public double width;
    public double height;
    public double biggerBox;
    public double smallerBox;
    public double outsideBox;
    private double volume;


    public Boxx(double length, double width, double height) {
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
    public Boxx biggerBox( Boxx oldBox ){
        return new Boxx( 1.25*oldBox.width, 1.25*oldBox.length, 1.25*oldBox.height);
} 
    public Boxx smallerBox(Boxx oldBox){
        return new Boxx(0.75*oldBox.width, 0.75*oldBox.length, 0.75*oldBox.height);
    }


        
}






