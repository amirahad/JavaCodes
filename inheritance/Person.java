package inheritance;

public class Person {
    String name;
    int age;

    void display1(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
