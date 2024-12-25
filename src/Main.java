import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.print("Введите первое целое число: ");
            try {
                number1 = scanner.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено некорректное значение.");
                scanner.next();
            }
        }
        isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите второе целое число: ");
            try {
                number2 = scanner.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено некорректное значение.");
                scanner.next();
            }
        }

        int sum = number1 + number2;
        System.out.println("Сумма равна: " + sum);
        scanner.close();
    }
}1,