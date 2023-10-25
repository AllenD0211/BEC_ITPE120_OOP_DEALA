class Car extends Vehicle {
    private String brand;

    public Car(String type, String brand) {
        super(type);
        this.brand = brand;
    }

    @Override
    public void color() {
        super.color(); 
        System.out.println("The " + brand + " car is repainted to red");
    }

    public void wheels() {
        System.out.println("The wheels of " + brand + " is Michelin.");
    }
}
