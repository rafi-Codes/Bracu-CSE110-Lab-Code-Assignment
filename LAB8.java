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
