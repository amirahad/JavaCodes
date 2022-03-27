package class_15_03_22;

public class Triangle extends Shape{
    public float hight,length;
    public Triangle(float hight, float length,String name,String color){
        super(name, color);
        this.hight = hight;
        this.length = length;
    }
    public float getArea(){
        return 0.5F*length*hight;
    }
}