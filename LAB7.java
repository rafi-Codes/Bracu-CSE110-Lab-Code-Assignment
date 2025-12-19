// Task 01
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) arr[i] = 1;
            else if (arr[i] < 0) arr[i] = 0;
        }

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

// Task 02
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                System.out.println(target + " is at index " + i);
                sc.close();
                return;
            }
        }
        System.out.println("Element not found");
        sc.close();
    }
}

// Task 03
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextDouble();
        }
        int minIdx = 0, maxIdx = 0;
        double sum = 0;
        
        for (int i = 0; i < arr.length; i++){
            if (arr[minIdx] > arr[i]){
               minIdx = i;
            }
            if (arr[maxIdx] < arr[i]){
                maxIdx = i;
            }
            sum += arr[i];
        }
        System.out.println("Maximum element " + arr[maxIdx] +" found at index " + maxIdx);
        System.out.println("Minimum element " + arr[minIdx] +" found at index " + minIdx);
        System.out.println("Summation: " + sum);
        System.out.printf("Average: %.2f" ,sum / n);
        sc.close();
    }
}

// Task 04
