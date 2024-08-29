import java.util.Scanner;

public class ThreeLargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the Number2 : ");
        int b = sc.nextInt();
        System.out.println("Enter the Number3 : ");
        int c = sc.nextInt();

        if (a > b && a > c) {2
            System.out.println(a + " is Greater than " + b + " and " + c + "");
        } else if (b > a && b > c) {
            System.out.println(b + " is Greater than " + a + " and " + c + "");
        } else {
            System.out.println(c + " is Greater than " + b + " and " + a + "");
        }

    }
}
