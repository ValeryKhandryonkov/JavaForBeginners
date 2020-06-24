import java.util.Scanner;

public class TwelfthTask {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String userStr = scanner.nextLine();
        System.out.println("Введённый текст без пробелов: \n" + userStr.replaceAll(" ", ""));
    }
}
