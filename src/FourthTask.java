import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в двоичной системе счисления: ");
        String binStr = scan.nextLine();
        try {
            int binNum = Integer.parseInt(binStr, 2);
            System.out.println("Введённое число в десятичной системе счисления: " + binNum);
        } catch (NumberFormatException e) {
            System.out.println("Введённое значение \"" + binStr + "\" не является числом в двоичной системе счисления.");
        }

    }

}