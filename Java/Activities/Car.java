package Activities;

public class Car {
    // Car Class Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    //Constructor
    Car() {
        tyres = 4;
        doors = 4;
    }
    //Methods
    public void displayCharacterstics() {
        System.out.println("Color of the Car:" + color);
        System.out.println("Make of the Car:" + make);
        System.out.println("Trasmission of the Car:" + transmission);
        System.out.println("No. of tyres:" + tyres);
        System.out.println("No. of Door" + doors);
    }
    public void accelerate() {
        System.out.println("Car is moving forward.");
    }
    public void brake() {
        System.out.println("Car has stopped.");
    }

}
