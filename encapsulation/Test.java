package encapsulation;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Amir");
        p1.setAge(32);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }   
}
