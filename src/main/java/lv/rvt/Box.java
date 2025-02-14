package lv.rvt;

import java.util.ArrayList;

public class Box implements Packable {
    private double maximumCapacity;
    private ArrayList<Packable> items;

    public Box(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maximumCapacity) {
            items.add(item);
        } else {
            System.out.println("Nav pietiekamas vietas");
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}

