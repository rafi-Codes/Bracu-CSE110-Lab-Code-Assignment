// Task 01
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: ");
        String text = sc.nextLine();
        int max = 0;
        for (int i = 0; i < text.length() - 1; i++){
            char ch1 = text.charAt(i);
            char ch2 = text.charAt(i + 1);
            boolean case1 = (ch1 >= '0' && ch1 <= '9');
            boolean case2 = (ch2 >= '0' && ch2 <= '9');
            int num = 0;
            if (case1 && case2){
                num = (ch1 - 48) * 10 + (ch2 - 48);
                if (num > max){
                    max = num;
                }
            }
        }
        System.out.print("2-Digit PIN: " + max);
        sc.close();
    }
}

