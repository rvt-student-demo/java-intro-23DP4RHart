package lv.rvt;

public class ProductWarehouse extends Warehouse {
    private String warehouseName;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.warehouseName = name;
    }

    public String getName() {
        return this.warehouseName;
    }

    public void setName(String name) {
        this.warehouseName = name;
    }

    @Override
    public String toString() {
        return warehouseName + ": Balance = " + getBalance() + ", Capacity = " + getCapacity();
    }
}
