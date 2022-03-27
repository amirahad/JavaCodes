package class_15_03_22;

public class Cylinder extends Circle{
    float hight;
    public Cylinder(float radious,float hight,String name,String color){
        super(radious,name,color);
        this.hight = hight;
    }
    public float getArea(){
        return (float)Math.PI*radious*radious*hight*2 + (float)Math.PI*radious*radious;
    }
}
