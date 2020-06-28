import java.util.Scanner;

public class FifteenthTask {
    public static void main(String[] args) {
        System.out.print("Сколько элементов должно быть в массиве?\nВведите число: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int userArray[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.print("Введите число для элемента массива с индексом " + i + ": ");
            userArray[i] = scanner.nextInt();
        }
        for (int i = arraySize - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (userArray[j] > userArray[j+1]){
                    int temp = userArray[j];
                    userArray[j] = userArray[j+1];
                    userArray[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int value : userArray) {
            System.out.print(value + " ");
        }
    }
}
