public class Vehicle {
     private String type;

    // Constructor for the base class
    public Vehicle(String type) {
        this.type = type;
    }

    public void color(){
        System.out.println("The orginal color of "+type + " is blue ");
    }

    public void bodykits() {
        System.out.println("The "+type + " has carbon body kits");
    }
}
