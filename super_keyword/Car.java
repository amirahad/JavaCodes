package super_keyword;

public class Car extends Vehicle {
    int gear;
    public Car(String c, double w, int g) {
        super(c,w);
        gear= g;
    }

    @Override
    void attribute(){
        // System.out.println("Color : "+color);
        // System.out.println("Weight : "+weight);
        super.attribute();
        System.out.println("Gear :"+gear);
    }
    
}
