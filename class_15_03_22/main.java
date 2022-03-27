package class_15_03_22;  

public class main {
	public static void main(String[] args) {
        Rectangle r = new Rectangle(4.5F, 6.5F,"Rectangle","Green");
        r.DisplayName();
        System.out.println(r.getArea());
        System.out.println(r.getPerimiter()+"\n");

        Square sq = new Square(5f,"Squre","Blue");
        sq.DisplayName();
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimiter()+"\n");

        Circle c = new Circle(5.2f,"Circle","Blake");
        c.DisplayName();
        System.out.println(c.getArea()+"\n");

        Cylinder cy = new Cylinder(5.5f,3.3f,"Cylinder","Purple");
        cy.DisplayName();
        System.out.println(cy.getArea()+"\n");
        
        Triangle t = new Triangle(2.5f, 6.3f,"Triangle","White");
        t.DisplayName();
        System.out.println(t.getArea()+"\n");
}
}