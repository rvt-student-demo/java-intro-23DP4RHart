package lv.rvt;

public class Person {
    public String name;
    private int age;
    private int height;
    private int weight;
    public String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }

    public void setWeight(int amount) {
        this.weight = amount;
    }


    public int getHeight(){
        return height; 
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name + address;
    }
    


}


