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

// Task 02
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String vowel = "";
        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'O' || ch == 'U' 
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                vowel += ch;
            }
        }
        int len = vowel.length() - 1;
        String ans = "";
        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'O' || ch == 'U' 
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                ans += vowel.charAt(len--);
            }
            else {
                ans += text.charAt(i);
            }
        }
        System.out.print(ans);
        sc.close();
    }
}

// Task 03
import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        String temp = "";
        String maxStr = "";
        System.out.println("Names of the spells:");
        do {
            temp = sc.next();
            if (max < temp.length()){
                max = temp.length();
                maxStr = temp;
            }
        } while (!temp.equals("stop"));

        int power = 0;
        temp = "";
        for (int i = 0; i < maxStr.length(); i++){
            char ch = maxStr.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                ch -= 32;
                temp += ch;
                power += (ch);
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                temp += ch;
                power += ch;
            }
        }
        System.out.println("Largest Spell : " + temp);
        System.out.println("Power Level : " + power);
        sc.close();
    }
}

// Task 04

// Task 05
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int len = text.length() - 1;
        int i = 0;
        while (i < text.length()){
            if (text.charAt(len--) != ' '){
                i++;
            } else {
                break;
            }
        }
        System.out.println(i);
        sc.close();
    }
}
