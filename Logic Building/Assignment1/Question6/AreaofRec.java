import java.util.Scanner;

public class AreaofRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length : ");
        int a = sc.nextInt();
        System.out.println("Enter the width : ");
        int b = sc.nextInt();

        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}
