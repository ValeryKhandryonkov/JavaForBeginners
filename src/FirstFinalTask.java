import java.util.Scanner;

public class FirstFinalTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в двоичной системе счисления: ");
        String binStr = scan.nextLine();
        boolean isBin = true;
        for (char element : binStr.toCharArray()){
            if (element != '0' & element != '1'){
                System.out.println("Введённое значение \"" + binStr + "\" не является числом в двоичной системе счисления.");
                isBin = false;
                break;
            }
        }
        int sum = 0;
        if (isBin) {
            for (int i = binStr.length() - 1, j = 1; i >= 0; i--, j *= 2) {
                sum += (binStr.charAt(i) - '0') * j;
            }
            System.out.println("Введённое число после перевода в десятичную систему счисления: " + sum);
        }
    }
}