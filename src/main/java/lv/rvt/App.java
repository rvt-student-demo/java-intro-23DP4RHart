package lv.rvt;

public class App {
    public static void main(String[] args) {
        // Box box = new Box(2.5, 5.0, 6.0);
        // System.out.println("Area: " + box.area() + " Volume: " + box.volume());
        // System.out.println("Top Area: " + box.topArea());

        // Box biggerBox = box.biggerBox();
        // System.out.println("Bigger Box (Volume): " + biggerBox.volume());
        // System.out.println("Bigger Box (Area): " + biggerBox.area());

        // Box smallerBox = box.smallerBox();
        // System.out.println("Smaller Box (Volume): " + smallerBox.volume());
        // System.out.println("Smaller Box (Area): " + smallerBox.area());

        // Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        // Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        // System.out.println(ada);
        // System.out.println(esko);

        // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        // System.out.println(ollie);
        // ollie.study();
        // System.out.println(ollie);

        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // juice.addToWarehouse(1.0);
        // System.out.println(juice); // Juice: balance = 989.7, space left = 10.3

        ChangeHistory history = new ChangeHistory;
        history.add(currentBalance:0);
        history.average();
    }
}
