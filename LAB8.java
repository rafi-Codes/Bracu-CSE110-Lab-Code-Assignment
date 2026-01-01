// Task 01
import java.util.Scanner;

public class task01 {
    public static boolean isPrime(int a){
        if (a <= 1) return false;
        else {
            for (int i = 2; i * i <= a; i++){
                if (a % i == 0) return false;
            }
            return true;
        } 
    }

    public static boolean isPerfect(int a){
        if (a <= 1) return false;
        else {
            int sum = 1;
            for (int i = 2; i < a; i++){
                if (a % i == 0){
                    sum += i;
                }   
            }
            return (sum == a);
        }
    }

    public static int special_sum (int range){
        int sum = 0;
        for (int i = 1; i <= range; i++){
            if (isPrime(i) || isPerfect(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(special_sum(n));
        sc.close();
    }
}

// Task 02
import java.util.Scanner;

public class task02 {
    public static void show_palindrome(int n){
        for (int i = 1; i <= n; i++){
            System.out.print(i);
        }
        for (int i = n - 1; i >= 1; i--){
             System.out.print(i);
        }
    }

    public static void showDots (int n){
        for (int i = 1; i <= n; i++){
            System.out.print(".");
        }
    }

    public static void showDiamond (int range){
        for (int i = 1; i <= range; i++){
            showDots(range - i);
            show_palindrome(i);
            showDots(range - i);
            System.out.println();
        }
        for (int i = range - 1; i >= 1; i--){
            showDots(range - i);
            show_palindrome(i);
            showDots(range - i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        showDiamond(n);
        sc.close();
    }
}

// Task 03
import java.util.Scanner;

public class task03 {
    public static double calcTax (int age, int salary) {
        int tax = 0;
        if (age < 18 || salary < 10000) return 0.0;
        else if (salary >= 10000 && salary <= 20000) return salary * 0.07f;
        else return salary * 0.14f;
    }

    public static void calcYearlyTax () {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double totalTax = 0.0;
        for (int i = 1; i <= 12; i++){
            int salary = sc.nextInt();
            double tax =  calcTax(age,salary);
            totalTax += tax;
            System.out.println("Month"+i+" tax : "+ (tax == 0.0 ? "0" : tax));
        }
        System.out.println("Total Yearly Tax: " + totalTax);
        sc.close();
    }
    public static void main(String[] args) {
        calcYearlyTax();
    }
}
