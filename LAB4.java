// Task 01
import java.util.Scanner;
public class task01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int start = sc.nextInt() , end = sc.nextInt();

        for (int i = start; i <= end; i++){
            int digit = (int) Math.log10(i) + 1;
            int sum = 0;
            int op = i;
            boolean earlyBreak = false;

            while (op > 0){
                sum += (int) Math.pow((op % 10),digit);
                op /= 10;
                if (sum > i){
                    earlyBreak = true;
                    break;
                }
            }

            if (earlyBreak) continue;
            else if (sum == i){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

// Task 02
import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of students to check: ");
        int student = sc.nextInt();

        while (student --> 0){
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();

            if ((Math.log(id) / Math.log(2)) % 1 == 0){
                System.out.println("Lucky ID");
            } else {
                System.out.println("Not Lucky");
            }
        }
        sc.close();
    }
}

// Task 03
import java.util.Scanner;
public class task03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        for (int i = 1; i <= days; i++){
            System.out.printf("Enter sales for Day %d:\n",i);
            double totalSale = 0;
            int PROD = 3;
            while (PROD --> 0){
                int sale = sc.nextInt();
                totalSale += sale;
            }

            if (totalSale >= 500){
                totalSale += (totalSale * 0.10);
            }
            else if (totalSale >= 200){
                totalSale += ( totalSale * 0.05);
            }
            else {
                totalSale += (totalSale * 0.02);
            }

            System.out.printf("Day %d: Total Sales with Tax: %.1f\n",i,totalSale);            

        }
        sc.close();
    }
}

// Task 04
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Number of Members: ");
        int members = sc.nextInt();

        for (int i = 1; i <= members; i++){
            System.out.printf("Exercises for Member-%d:",i);
            int exs = sc.nextInt();
            if (exs > 3){
                System.out.println("(Can’t do more than 3 exercise)\n");
                exs = 3;
            }
            int rawSum = 0, totalCal = 0;

            for (int j = 1; j <= exs; j++){
                System.out.printf("Exercise-%d: ",j);
                int cal = sc.nextInt();
                rawSum += cal;

                if (cal > 350){
                    cal += (cal * 0.50);
                }
                totalCal += cal;

            }

            if ((rawSum / 3) < 200){
                totalCal -= (totalCal * 0.10);
            }

            else if ((rawSum / 3) > 400){
                totalCal += 150;
            }

            System.out.printf("Average calories earned per day for Member-%d: %.3f\n",i,(totalCal / 3.0));
        }

        sc.close();
    }
}

// Ungraded Task 01
import java.util.Scanner;

public class ungrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int X = sc.nextInt();
        System.out.print("Y: ");
        int Y = sc.nextInt();

        int sum = 0;
        while (Y > 0) {
            for (int i = 2; i * i <= X; i++){
                if (X % i != 0) {
                    sum += X;
                    Y--;
                }
            }
            X++;
        }
        
        System.out.println("Sum: " + sum);
        sc.close();
    }
}

// Ungraded Task 02
import java.util.Scanner;

public class ungrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int X = sc.nextInt();
        System.out.print("Y: ");
        int Y = sc.nextInt();

        if (X % 2 == 0){
            X++;
        }

        int sum = 0;
        while (Y --> 0) {
            sum += X;
            X += 2;
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
}

// Ungraded Task 03
import java.util.Scanner;
import java.util.Arrays;

public class ungrade {
    public static boolean [] sieve(){
        boolean arr[] = new boolean[1000+1];
        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;
        for (int i = 2; i * i <= 1000; i++){
            if (arr[i]){
                for(int j = i * i; j <= 1000; j += i){
                    arr[j] = false;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[] = sieve();
        int i = 2;
        while (n > 0){
            if (arr[i]){
                System.out.println(i);
                n--;
            }
            i++;
        }
        sc.close();
    }
}

// Ungraded Task 04
import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int cnt = 0;
        for (int a = 1; a <= p; a++) {
            for (int b = a + 1; b <= p; b++) {
                int cSqr = (a * a) + (b * b) ;
                int c = (int) Math.sqrt(cSqr);
                if ( (a + b + c) == p && (c * c) == cSqr) {
                    System.out.printf("%d %d %d\n", a, b, c);
                    cnt++;
                }
            }
        }
        System.out.print("Total- " + cnt);
        sc.close();
    }
}

// Another way to solve task 2
import java.util.Scanner;
public class codeforces {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of students to check: ");
        int student = sc.nextInt();

        while (student --> 0){
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            int op = id;

            if (op == 0){
                System.out.println("Not Lucky");
                sc.close();
                return; 
            }

            while (op > 2){
                if (op % 2 == 0) op /= 2;
                else {
                    System.out.println("Not Lucky");
                    sc.close();
                    return;
                }
            }
            
            System.out.println("Lucky ID");  

        sc.close();
        }
    }
}

