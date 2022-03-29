package Basics;
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = "Amir Ahad";
        
        for(int i =0; i<a; i++){
            System.out.println("hello " + b);
        }
    }
}

