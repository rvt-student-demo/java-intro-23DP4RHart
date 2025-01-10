package lv.rvt;

class Box {
    private double length;
    private double width;
    private double height;
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
    
}




