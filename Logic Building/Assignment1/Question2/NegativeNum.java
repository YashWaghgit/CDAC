import java.util.Scanner;

public class NegativeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("It is Negative  Number");
        } else if (a == 0) {
            System.out.println("It is Zero Number");
        } else {
            System.out.println("It is Positive Number");
        }
    }
}
