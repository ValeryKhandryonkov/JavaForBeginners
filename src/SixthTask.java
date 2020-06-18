import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = scanner.nextInt();
        System.out.println("Введите число y: ");
        int y = scanner.nextInt();
        System.out.println("Введите число z: ");
        int z = scanner.nextInt();
        double arithmeticalMean = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое чисел " + x + ", " + y + " и " + z + " = " + arithmeticalMean);
        if (arithmeticalMean / 2 > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
