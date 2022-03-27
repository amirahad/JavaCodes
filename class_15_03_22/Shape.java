package class_15_03_22;

abstract class Shape {
    public String name,color;
    public Shape(String name,String color){
        this.name = name;
        this.color = color;
    }
    public void DisplayName(){
        System.out.println(name+"\n"+color);
    }
}
