package LCM;
import java.util.*;
public class LCM {
    // driver code
    public static void main(String args[]) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        System.out.println("LCM of " + x + " and " + y + " is " + findLcm(x, y));
    }

    static int findGcd(int x, int y) {
        if (x == 0)
            return y;
        return findGcd(y % x, x);
    }

    static int findLcm(int x, int y) {
        return (x / findGcd(x, y)) * y;
    }

}
