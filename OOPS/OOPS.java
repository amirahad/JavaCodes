package OOPS;
class Pen{
    String color;
    String type;

    public void printcolor(){
        System.out.println("the color of the pen is " + this.color);
    }
    public void write(){
        System.out.println(" the pen is " + this.type);
    }
 }

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        System.out.println("constractor called");
        this.name = name;
        this.age = age; 
    }
} 

public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen() ;
        // p1.color= "blue";
        // p1.type = "Ballpoint";

        // Pen p2 = new Pen();
        // p2.color = "black";
        // p2.type = "Gelpen";

        // Pen p3 = new Pen();
        // p3.color = "orenge";
        // p3.type = "Normal Pen";

        // p1.printcolor();
        // p1.write();
        // p2.printcolor();
        // p2.write();
        // p3.printcolor();
        // p3.write();

        Student s1 = new Student("AMIR AHAD", 22);
        // s1.name = "AMIR AHAD";
        // s1.age = 22;

        s1.printInfo();
    }
}