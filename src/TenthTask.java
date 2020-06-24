import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        System.out.print("Сколько строк должно быть в матрице?\nВведите число: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.print("Сколько столбцов должно быть в матрице?\nВведите число: ");
        int columns = scanner.nextInt();
        int matrix[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++ ){
            for (int j = 0; j < columns; j++){
                System.out.print("Введите элемент строки " + (i + 1) + " столбца " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Элементы первой строки, умноженные на 3: ");
        for (int j = 0; j < columns; j++){
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}
