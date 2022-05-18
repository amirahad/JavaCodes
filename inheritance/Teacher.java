package inheritance;

public class Teacher  extends Person{
    String qualification;

    
    public Teacher(String name, int age, String qualification) {
        super(name,age);
        this.qualification = qualification;
    }
    void display2(){
        display1();
        System.out.println("Qualification : "+qualification);
    }
    
}
