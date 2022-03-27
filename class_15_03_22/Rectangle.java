package class_15_03_22;

public class Rectangle extends Shape{
    public float hight,length;
    public Rectangle(float hight,float length,String name,String color){
        super(name, color);
        this.hight = hight;
        this.length = length;
    }
    public float getArea(){
        return hight*length;
    }
    public float getPerimiter(){
        return (length+hight)*2;
    }
    

}