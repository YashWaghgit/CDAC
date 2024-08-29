import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("It is Even Number");
        } else {
            System.out.println("It is Odd Number");
        }
    }
}
