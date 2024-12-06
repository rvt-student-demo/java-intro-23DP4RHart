package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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
    


}


