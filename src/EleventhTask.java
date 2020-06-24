import java.util.Scanner;

public class EleventhTask {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String userStr = scanner.nextLine();
        System.out.println("Вы ввели: \n" + userStr);
    }
}
