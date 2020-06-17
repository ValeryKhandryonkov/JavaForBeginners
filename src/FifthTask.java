import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        try {
            int userNum = scan.nextInt();
            System.out.println("Таблица умножения:");
            System.out.println("1 x " + userNum + " = "+ userNum);
            System.out.println("2 x " + userNum + " = "+ 2 * userNum);
            System.out.println("3 x " + userNum + " = "+ 3 * userNum);
            System.out.println("4 x " + userNum + " = "+ 4 * userNum);
            System.out.println("5 x " + userNum + " = "+ 5 * userNum);
            System.out.println("6 x " + userNum + " = "+ 6 * userNum);
            System.out.println("7 x " + userNum + " = "+ 7 * userNum);
            System.out.println("8 x " + userNum + " = "+ 8 * userNum);
            System.out.println("9 x " + userNum + " = "+ 9 * userNum);
            System.out.println("10 x " + userNum + " = "+ 10 * userNum);
        } catch (Exception e) {
            System.out.println("Введённое значение не является числом");
        }
    }
}
