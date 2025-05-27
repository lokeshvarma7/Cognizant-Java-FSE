// 3. Even or Odd Checker
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}