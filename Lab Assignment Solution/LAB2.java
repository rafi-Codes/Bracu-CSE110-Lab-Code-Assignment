// Task 01
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num % 5 == 0 &&  num % 7 == 0){
            System.out.println("Invalid: Divisible by both");
        } 
        else if (num % 5 == 0){
            System.out.println("Divisible by 5 Only");
        } 
        else if (num % 7 == 0) {
            System.out.println("Divisible by 7 Only");
        }
        else {
            System.out.println("No");
        }
      
        sc.close();
    }
}

// Task 02
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Electricity Consumed: ");
        int elecConsum = sc.nextInt();

        double baseBill = elecConsum * 15;
        
        if (age < 18){
            baseBill -= (baseBill  * 0.20);
        } 
        else if (age > 60){
            baseBill -= (baseBill  * 0.10);
        } 
        else if (age <= 0) {
            System.out.println("Invalid");
        }
        

        if (elecConsum > 100)
            baseBill += (baseBill * 0.05);

        
        System.out.println("Final Bill: " + baseBill);
        sc.close();
    }
}

// Task 03
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 2;
        float min = sc.nextFloat();
        float max = min;
        while (n --> 0){
            float x = sc.nextFloat();
            if (min > x){
                min = x;
            }
            if (max < x){
                max = x;
            }

        }
        
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

        sc.close();
    }
}

// Task 04
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3){
            System.out.println("This is a Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("This is a Isosceles triangle");
        } else {
            System.out.println("This is a Scalene triangle");
        }

        sc.close();
    }
}

// Task 5
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int needToPay = sc.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int paid = sc.nextInt();

        if (needToPay > paid){
            System.out.println("Please pay " + (needToPay - paid) +" taka more");
            return;
        }

        int returnAmount = paid - needToPay;
        System.out.println("The returned amount is " + returnAmount + " taka.");

        if (returnAmount > 0){
            System.out.println("100 taka note: " + (returnAmount / 100));
            returnAmount %= 100;
            System.out.println("50 taka note: " + (returnAmount / 50));
            returnAmount %= 50;
            System.out.println("20 taka note: " + (returnAmount / 20));
            returnAmount %= 20;
            System.out.println("10 taka note: "+ (returnAmount / 10));
            returnAmount %= 10;
            System.out.println("5 taka coin: " + (returnAmount / 5));
            returnAmount %= 5;
            System.out.println("2 taka coin: "+ (returnAmount / 2));
            returnAmount %= 2;
            System.out.println("1 taka coin: "+ (returnAmount / 1));
            returnAmount %= 1;
        }
        sc.close();
    }
}

// Task 06
import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        } else if (num1 == num2 || num2 == num3 || num1 == num3){
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }

        sc.close();
    }
}
