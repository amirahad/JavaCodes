package class_15_03_22;

import javax.annotation.processing.SupportedSourceVersion;

public class Circle extends Shape{
    public float radious;
    public Circle(float r,String name,String color){
        super(name, color);
        radious = r;
    }
    public float getArea(){
        return (float)Math.PI*radious*radious;
    }
    // public float setRadious(float r){
    //     radious = r;
    //     return radious;
    // }
    // public float getRadious(){
    //     return radious;
    // }
    // public float getArea(){
    //     return (float)(Math.PI)*radious*radious;
    // }
    // public float getCircumference(){
    //     return (float)Math.PI*radious*2;
    // }
    // public String toString(){
    //     return "Circle [Radious = " + this.radious + "]";
    // }
}