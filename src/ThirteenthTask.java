import java.util.Scanner;

public class ThirteenthTask {
    public static void main(String[] args) {
        System.out.println("Введите строку №1: ");
        Scanner scanner = new Scanner(System.in);
        String userStr1 = scanner.nextLine();
        System.out.println("Введите строку №2: ");
        String userStr2 = scanner.nextLine();
        System.out.println("Сравниваем длины строк...");
        System.out.println();
        if (userStr1.length() == userStr2.length()){
            System.out.println("Строки имеют одинаковую длину!");
        } else if (userStr1.length() > userStr2.length()) {
            System.out.println("Из двух строк длиннее строка:\n\"" + userStr1 + "\"");
        } else {
            System.out.println("Из двух строк длиннее строка:\n\"" + userStr2 + "\"");
        }
    }
}
