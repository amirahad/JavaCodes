package inheritance;

public class Person {
    // String name;
    // int age;

    // void display1(){
    //     System.out.println("name : "+name);
    //     System.out.println("age : "+age);
    // }

    // public Person(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void display1(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }

    
}
