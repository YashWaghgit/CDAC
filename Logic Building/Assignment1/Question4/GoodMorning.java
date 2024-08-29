import java.util.Scanner;

public class GoodMorning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        System.out.println("Enter AM OR PM: ");
        sc.nextLine();
        String b = sc.nextLine();

        if (a > 5 && a <= 12) {
            if (b.equals("AM")) {

                System.out.println("Good Morning");

            }

        }
    }
}
