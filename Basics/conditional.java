package basics;
import java.util.*;

public class conditional {
    public static void main(String[] args) {
        System.out.println("Choose operator '+','-','*'or '/'");
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().charAt(0);
        System.out.println("Enter the first value:");
        int a = sc.nextInt();
        System.out.println("Enter the second value:");
        int b = sc.nextInt();
        int c;
        sc.close();
        switch (operator){
            case '+':
                c = a+b;
                System.out.println(c);
                break;
            case '-':
                c = a-b;
                System.out.println(c);
                break;
            case '*':
                c = a*b;
                System.out.println(c);
                break;
            case '/':
                if(a<b){
                    System.out.println("check your inputs, First input should be greater than second for division");
                }else{
                    c = a/b;
                    System.out.println(c);
                }
                // float e = (float)c;
                // e = a/b;
                // System.out.println(e);
                break;
                
            default:
                System.out.println("error occoured");
                break;
        }

        // if (age>18){
        //     System.out.println("adult");
        // }
        // System.out.println("not adult");
    }
}
