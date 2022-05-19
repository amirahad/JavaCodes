package oop_assignment;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int n,m;
        System.out.println("Enter your array size: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        int[] arr = new int[n];  
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            Scanner a = new Scanner(System.in);
            arr[i] = a.nextInt();   
        }
    

        System.out.println("\nWhich Sorting Operation you want to make:");
        System.out.println("1. Bubble Sort ");
        System.out.println("2. Quick Sort ");
        System.out.println("3. Merge Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Insertion Sort");

        System.out.println("Enter your option:");
        m = sc.nextInt();
        sc.close();

        System.out.println("Array Before Sorting :");  
        for(int i=0; i < n; i++){  
                System.out.print(arr[i] + " ");  
        }
        System.out.println("\n");


        switch(m){   
            case 1:
            BubbleSort B = new BubbleSort();   
            B.bubbleSort(arr); 
         
            System.out.println("Array After Bubble Sort");  
            for(int i=0; i < n; i++){  
                System.out.print(arr[i] + " ");  
            } 
            break;  
            case 2:
            QuickSort Q = new QuickSort();
            Q.quick(arr, 0, n-1); 
            System.out.println("Array After Quick Sort");  
            for(int i=0; i < n; i++){  
                System.out.print(arr[i] + " ");  
            }
            break;  
            case 3: 
            MergeSort M = new MergeSort();
            M.sort(arr, 0, n-1); 
            System.out.println("Array After Merge Sort");  
            for(int i=0; i < n; i++){  
                System.out.print(arr[i] + " ");  
            }
            break; 
            case 4: 
            Selection S = new Selection();
            S.sort(arr);
            System.out.println("Array After Selection Sort");  
            for(int i=0; i < n; i++){  
                System.out.print(arr[i] + " ");  
            }
            break; 
            case 5:
            Insertion I = new Insertion();
            I.sort(arr);
            System.out.println("Array After Insertion Sort");  
            for(int i=0; i < n; i++){  
                System.out.print(arr[i] + " ");  
            }
            break;
            default:
            System.out.println("Invalid Option Choosen.");  
        }  
        
    }  
}

