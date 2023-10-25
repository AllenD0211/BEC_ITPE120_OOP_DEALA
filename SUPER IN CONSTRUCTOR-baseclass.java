public class Vehicle {
     private String type;
     private int year;
   
    public Vehicle(String type ,  int year) {
        this.type = type;
        this.year = year;
    }

    public void color(){
        System.out.println("The car repainted since "+year);
    }

    public void bodykits() {
        System.out.println("The car has never been change since "+year );
    }
}
