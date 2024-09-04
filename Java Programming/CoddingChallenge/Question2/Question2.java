import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the triangle: ");
        int side = scanner.nextInt();

        if (side <= 1) {
            System.exit(0);
        }

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < side - i; j++) {
                if (j == 0 || j == side - i - 1 || i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
