import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdFinalTask {
    public static void main(String[] args) {
        boolean isResult = false;
        while (!isResult) {
            Scanner scanner = new Scanner(System.in);
            double usdExchangeRate;
            double rurAmount;
            double usdAmount;
            boolean isException = false;
            try {
                System.out.print("Введите текущий курс доллара: ");
                usdExchangeRate = scanner.nextDouble();
                System.out.print("Введите количество рублей: ");
                rurAmount = scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Введённое значение не является числом или использована точка в качестве разделителя: " + ex);
                isException = true;
                continue;
            }
            if (!isException) {
                usdAmount = rurAmount / usdExchangeRate;
                System.out.printf("Можно купить долларов: %.2f", usdAmount);
                isResult = true;
            }
        }
    }
}