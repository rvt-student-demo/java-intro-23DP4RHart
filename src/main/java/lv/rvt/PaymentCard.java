package lv.rvt;

public class PaymentCard {
    private double balance;
    private double healthy = 2.60;
    private double heartily = 4.60; 

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    public void eatAffordably() {
        this.balance = this.balance - healthy;
        
        

    }
    
    public void eatHeartily() {
       this.balance = this.balance - heartily;
    }

    public String toString() {
        return "Nauda uz kartes: " + balance;
        
    }
    
}
