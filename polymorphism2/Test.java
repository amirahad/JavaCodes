package polymorphism2;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(3,2);
        Shape s3 = new Triangle(5, 2);

        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
    }
}
