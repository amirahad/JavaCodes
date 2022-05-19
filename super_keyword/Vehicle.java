package super_keyword;

public class Vehicle {
    String color;
    double weight;


    public Vehicle(String c, double w) {
        color = c;
        weight = w;
    }
    void attribute(){
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
    }

}
