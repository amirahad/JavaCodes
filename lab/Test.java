package lab;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Amir Ahad", "male", 12342343);
        // teacher1.name= "Amir Ahad";
        // teacher1.gender = "male";
        // teacher1.phone = 28748378;
        // teacher1.setInformation("Amir Ahad", "male", 12342343);
        teacher1.display();
        Teacher teacher2 = new Teacher("anisul islam", "male", 6543221);
        // teacher2.setInformation("anisul islam", "male", 6543221);
        teacher2.display();
        Teacher teacher3 = new Teacher();
        teacher3.display();
    }

}
