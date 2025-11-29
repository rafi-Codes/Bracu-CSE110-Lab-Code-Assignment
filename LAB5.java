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

