import java.io.*;
import java.util.Scanner;

public class EighteenthTask {
    public static void main(String[] args) {
        String fileName = "D:\\Программирование\\First Java Project\\OutputInputFile.txt";
        int lineCount = 0;
        System.out.println("Выводим строки файла: ");
        System.out.println();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
        System.out.println();
        System.out.println("Всего строк в файле: " + lineCount);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for (int i = 0; i < lineCount; i++){
                System.out.println("Введите текст для записи в строку " + (i + 1) + ": ");
                writer.write(scanner.nextLine() + "\n");
            }
        } catch (IOException ex){
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
