import java.io.*;

public class SixteenthTask {
    public static void main(String[] args) {
        String str;
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Программирование\\First Java Project\\TestFile.txt"))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ex){
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}