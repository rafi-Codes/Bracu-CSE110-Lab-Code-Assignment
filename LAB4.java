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


