package lv.rvt;

public class Product {

    private String name;
    private double value;
    private double amount;

    public Product(String Initialname) {
        this.name = Initialname;
        this.value = 1.1;
        this.amount = 13;
    }

    public void printProduct(){
        System.out.println(this.name + ","+ "price " + this.value + "," + this.amount );
    }

}
