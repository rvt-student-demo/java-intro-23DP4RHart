package lv.rvt;

public class App {
    public class Main {

        public static void main(String[] args) {
            Person ada = new Person("Ada");
            Person antti = new Person("Antti");
            Person martin = new Person("Martin");
    
            ada.printPerson();
            antti.printPerson();
            martin.printPerson();
        }
    }

}