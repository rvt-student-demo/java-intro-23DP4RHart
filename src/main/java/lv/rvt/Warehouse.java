package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.capacity = Math.max(capacity, 0);
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            this.balance = Math.min(this.balance + amount, this.capacity);
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount <= 0) {
            return 0;
        }
        double amountTaken = Math.min(amount, this.balance);
        this.balance -= amountTaken;
        return amountTaken;
    }

    @Override
    public String toString() {
        return "Balance = " + getBalance() + ", Space left = " + howMuchSpaceLeft();
    }
}
