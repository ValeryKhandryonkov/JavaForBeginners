import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondFinalTask {
    public static void main(String[] args) {
        System.out.print("Сколько элементов должно быть в массиве?\nВведите число: ");
        Scanner scanner = new Scanner(System.in);
        boolean isException = false;
        int arraySize = 0;
        try {
            arraySize = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Введённое значение не является числом: " + ex);
            isException = true;
        }
        int userArray[] = new int[arraySize];
        try {
            for (int i = 0; i < arraySize; i++) {
                System.out.print("Введите число для элемента массива с индексом " + i + ": ");
                userArray[i] = scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Введённое значение не является числом: " + ex);
            isException = true;
        }
        if (!isException){
            System.out.println();
            System.out.println("Массив чисел до сортировки:\n" + Arrays.toString(userArray));
            // Сортировка вставками
            for (int left = 0; left < arraySize; left++) {
                int value = userArray[left];
                int i = left - 1;
                for (; i >= 0; i--) {
                    if (value < userArray[i]) {
                        userArray[i + 1] = userArray[i];
                    } else {
                        break;
                    }
                }
                userArray[i + 1] = value;
            }
            System.out.println("Массив чисел после сортировки:\n" + Arrays.toString(userArray));
        }
    }
}
