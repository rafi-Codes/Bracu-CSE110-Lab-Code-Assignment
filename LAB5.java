// Task 01
import java.util.Scanner;
public class task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int k = n - i - 1; k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i + 1); j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--){
            for (int k = 1; k <= n - i - 1; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i + 1); j++){
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}

// Task 02
import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n - 1; i++){
          for (int j = 1; j < n-i; j++){
            System.out.print(" ");
          }
          int space = i - 1 ;
          for (int k = n - i; k <= n; k++){
            System.out.print(k);
            if (i != n - 1){
                while (space --> 0){
                    System.out.print(" ");
                    k = n - 1;
                }
            }
          }
          System.out.println();
        }
        sc.close();
    }
}

// Task 03
import java.util.Scanner;
public class task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int k = n - i - 1; k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i + 1); j++){
                if (!(j == 1 || j == (2*i + 1)) && i != n - 1 ){
                    System.out.print(" ");
                }   
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

// Task 04
import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int k = n - i - 1; k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i + 1); j++){
                if (!(j == 1 || j == (2*i + 1))){
                    System.out.print(" ");
                }   
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--){
            for (int k = n - i - 1; k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i + 1); j++){
                if (!(j == 1 || j == (2*i + 1))){
                    System.out.print(" ");
                }   
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

// Task 05
import java.util.Scanner;
public class task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = n - i; k >= 1; k--){
                System.out.print(" ");
            }
            int j = 1;
            while (j <= 2 * i - 1){
                if (j <= i) {
                    System.out.print(j);       
                } else {
                    System.out.print(2 * i - j);
                }
                j++;
            }
            System.out.println();
        }

        sc.close();
    }
}

// Task 06
import java.util.Scanner;
public class taask06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--){
            for (int k = n - i; k >= 1; k--){
                System.out.print(" ");
            }
            int j = 1;
            while (j <= 2 * i - 1){
                if (j <= i) {
                    System.out.print(j);       
                } else {
                    System.out.print(2 * i - j);
                }
                j++;
            }
            System.out.println();
        }

        sc.close();
    }
}

// Task 07
import java.util.Scanner;
public class task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        n = (n / 2) + 1;

        for (int i = n; i >= 1; i--){
            for (int k = n - i; k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++){
            for (int k = n - i; k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}

// Ungraded Task 01 
import java.util.Scanner;
public class ungradedTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of Loaves: ");
        int n = sc.nextInt();
        int star = 5;
        for (int i = 0; i < n; i++){
            for (int j = 1; j <= 20; j++){
                if (j == star){
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            star += 5;
            System.out.println();
        }

        sc.close();
    }
}

// Ungraded Task 02
import java.util.Scanner;
public class ungradedTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Time: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("/");
            }
            for (int j = 1; j <= n - i; j++){
                System.out.print("|");
            }
            System.out.println();
        }

        sc.close();
    }
}

// Ungraded Task 03
import java.util.Scanner;
public class ungradedTask03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        n /= 2; 
        int light = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= light; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= n - light; j++) {
                System.out.print("*");
            }
            light--;
            System.out.println();
        }

        int off = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= off; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - off; j++) {
                System.out.print(".");
            }
            off--;
            System.out.println();
        }

        sc.close();
    }
}

