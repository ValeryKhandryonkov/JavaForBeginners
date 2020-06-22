import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        System.out.print("Сколько элементов должно быть в массиве?\nВведите число: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int userArray[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.print("Введите число для элемента массива с индексом " + i + ": ");
            userArray[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Элементы массива после умножения на 2:");
        for (int n : userArray){
            System.out.print(n * 2 + " ");
        }
    }
}
