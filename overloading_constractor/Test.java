package overloading_constractor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.displayInfo();

        Teacher teacher2 = new Teacher("Ahad","male");
        teacher2.displayInfo();

        Teacher teacher3 = new Teacher("Amir","male", 32938393);
        teacher3.displayInfo();

    }
}
