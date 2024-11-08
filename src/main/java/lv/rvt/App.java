package lv.rvt;

public class App {
    public class Main {

        public static void main(String[] args) {

            
           /// Person ada = new Person("Ada");
           /// Person antti = new Person("Antti");
           /// Person martin = new Person("Martin");
    
          ///  ada.printPerson();
           /// antti.printPerson();
           /// martin.printPerson();

            ///Product banana = new Product("Banana");
           /// banana.printProduct();
           
           DecreasingCounter counter = new DecreasingCounter(2);

           counter.printValue();

           counter.decrement();
           counter.printValue();
   
           counter.decrement();
           counter.printValue();
   
           counter.decrement();
           counter.printValue();

        }
    }

}