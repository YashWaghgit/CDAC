import java.util.Scanner;

public class AreaOfSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        int area = a * a;
        System.out.println("Area of Square: " + area);
    }
}
