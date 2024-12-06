package lv.rvt;

public class Statistics {

    private int count;
    private int sum;
    private int odd;
    private int even;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.odd = 0;
        this.even = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;

        if (number % 2 == 0) {
            this.even++;
        } else {
            this.odd++;
        }
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0; 
        }
        return (double) this.sum / this.count;
    }

    public int getEvenCount() {
        return this.even;
    }

    public int getOddCount() {
        return this.odd;
    }
}
