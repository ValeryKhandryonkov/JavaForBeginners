import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        int X = 15;
        int Y = 6;
        int Z = 33;
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
