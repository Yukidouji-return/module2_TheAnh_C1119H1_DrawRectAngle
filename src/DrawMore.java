import java.util.Scanner;

public class DrawMore {
    public static void main(String[] args) {
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("please choose:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.print("please enter the height of triangle:");
                int height = scanner.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = height - 1; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i * 2 + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");

        }
    }
}