import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        final int X = 15;
        final int Y = 6;
        final int Z = 33;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number == X | number == Y | number == Z){
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
