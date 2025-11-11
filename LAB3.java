// Task 01
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) continue;
            else if (i % 5 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}

// Task 02
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter number of Herbs (H): ");
        int h = sc.nextInt();
        System.out.print("Please Enter number of Crystals (C): ");
        int b = sc.nextInt();
        int potionCount = 0;
        while ( h >= 3 && b >= 2) {
            System.out.println("Potion-"+ ++potionCount +" created");
            h -= 3; 
            b -= 2;
            System.out.printf("Remaining Herbs: %d, Remaining Crystals: %d\n", h, b);
        }

        System.out.println("Potions created: "+ potionCount);
        if (potionCount % 2 == 0)
            System.out.println("Stable Brew");
        else
            System.out.println("Volatile Elixir");

        sc.close();
    }
}

// Task 03
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Energy (E): ");
        int e = sc.nextInt();
        System.out.print("Number of River (N): ");
        int n = sc.nextInt();
        int d = 0;
        while (n --> 0) {
            System.out.printf("Enter River Distance D%d: ", ++d);
            int distance = sc.nextInt();
            if (distance > 5){
                e -= (distance / 2);
            } else {
                e -= 2;
            }

            if (e < 0){
                System.out.println("Tired at River "+ d);
                return;
            }            
        }

        System.out.println("All Done");
        System.out.println( e+" energy Left");

        sc.close();
    }
}

// Task 04
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 0){
            System.out.print(num % 10);
            num /= 10;
            if (num > 0) System.out.print(",");
        }

        sc.close();
    }
}

// Task 5
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N-digit vault code: ");
        int num = sc.nextInt();
        int op = num;
        int digit = 0;
        while (op > 0){
            digit++;
            op /= 10;
        }
        digit--;
        int extr = 1;
        while (digit --> 0){
            extr *= 10;
        }

        while (num > 0){
            System.out.print(num / extr);
            num %= extr;
            extr /= 10;
            if (num > 0) System.out.print(", ");
        }
        
        sc.close();
    }
}

// Task 06
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isNotPrime = false;
        int sum = 1;

						
	  if (num <= 1) {
            System.out.println(num + " is not a prime number");
            System.out.println(num + " is not a perfect number");
            sc.close();
            return;
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                if (!isNotPrime){
                    isNotPrime = true;
                }
                sum += i;
            }
        }
        if (isNotPrime){
            System.out.println(num +" is not a prime number");
        } else {
            System.out.println(num +" is a prime number");
        }

        if (sum == num){
            System.out.println(num +" is a perfect number");
        } else {
            System.out.println(num +" is not a perfect number");
        }
        sc.close();
    }
}

// Task 07
public class task7 {
    public static void main(String[] args) {
    
        int sum = 0;
        for (int i = 1; i < 600; i++){
            if (i % 7 == 0 ^ i % 9 == 0){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}

// Task 08
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int cnt = 0,pos = 0,neg = 0;
        while (n --> 0){
            System.out.printf("Enter number %d: ", ++cnt);
            int num = sc.nextInt();
            if (num < 0){
                neg++;
                continue;
            }
            pos++; 
        }
        System.out.println(pos +" Non-negative Numbers");
        System.out.println(neg +" Negative Numbers");
        sc.close();
    }
}
