package lv.rvt;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter
    private int i = 8;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
        
    }

    public void printValue() {
        System.out.println("value: " + this.value);
        
    }

    public void decrement() {
        if(value > 0){
            this.value = this.value - 1;
            
        }

        
    }

 
}

