import java.util.Scanner;

public class FourteenthTask {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        final String S = scanner.nextLine();
        final int X = Integer.parseInt(S);
        final double Y = X;
        System.out.println("String: " + S);
        System.out.println("int: " + X);
        System.out.println("double: " + Y);
    }
}
