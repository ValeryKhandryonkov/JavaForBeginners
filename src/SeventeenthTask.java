import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeventeenthTask {
    public static void main(String[] args) {
        String userStr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Завершение записи в файл - строка 'Стоп'");
        try (FileWriter fw = new FileWriter("D:\\Программирование\\First Java Project\\FileForInput.txt")){
            do {
                System.out.println("Введите строку для записи в файл: ");
                userStr = br.readLine();
                if (userStr.compareTo("Стоп") == 0) break;
                userStr = userStr + "\r\n";
                fw.write(userStr);
            } while (userStr.compareTo("Стоп") != 0);
        } catch (IOException ex){
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
