import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1. Операции с числами");
            System.out.println("2. Сравнение строк");
            System.out.println("3. Вывод чётных чисел");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new NumberOperations().compareAndCalculate();
                    break;
                case 2:
                    new StringComparison().compareStrings();
                    break;
                case 3:
                    new EvenNumbers().printEvenNumbers();
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    return;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}