// Task 01
import java.util.Scanner;

public class task01 {
    public static int factorial(int n){
        if (n == 0 || n == 1) return 1;
        else return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}

// Task 02
import java.util.Scanner;

public class task02 {
    public static int power(int base, int exp){
        if (exp == 0) return 1;
        else return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(power(a,x));
        sc.close();
    }
}

// Task 03
import java.util.Scanner;

public class task03 {
    public static void print_elements(int[] arr, int idx){
        if (idx == arr.length) return;
        else {
            System.out.println(arr[idx]);
            print_elements(arr,idx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,6,2,1,8,7};
        int index = 2;
        print_elements(arr,index);
    }
}

// Task 04
import java.util.Scanner;

public class task04 {
    public static int fibonacci(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci (n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}




