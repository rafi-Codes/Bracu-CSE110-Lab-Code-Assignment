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

        System.out.println("After modifying: ");
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
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the array 1: ");
        int n = sc.nextInt();
        int [] arr1 = new int[n];

        System.out.println("Please enter the elements of the arr1: ");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Please enter the length of the array 2: ");
        n = sc.nextInt();
        int [] arr2 = new int[n];

        System.out.println("Please enter the elements of the arr2: ");
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr1.length; j++){
                if (arr1[j] == arr2[i]){
                    n--;
                    break;
                }
            }
            
        }
        if (n == 0){
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
        sc.close();
    }
}

// Task 05
import java.util.Arrays;
public class task05 {
    public static void main(String[] args) {

        int [] marks = {85, 90, 75, 44, 99};
        String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};

        for (int i = 0; i < marks.length - 1; i++){
            for (int j = 0; j < marks.length - i - 1; j++){
                if (marks[j] > marks[j + 1]){

                    int temp = marks[j];
                    String tempStr = names[j];

                    marks[j] = marks[j + 1];
                    names[j] = names[j + 1];

                    marks[j + 1] = temp;
                    names[j + 1] = tempStr;

                }
            }
            
        }
        
        System.out.println("Sorted Array: ");
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
    }
}        
