package Activities;

public class Activity1 {
    public static void main(String[] args){
        Car maruthi = new Car();
        maruthi.make = 2014;
        maruthi.color = "Black";
        maruthi.transmission = "Manual";

        //Car Class methods
        maruthi.displayCharacterstics();
        maruthi.accelerate();
        maruthi.brake();
    }
}

