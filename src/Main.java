import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите: \n" +
                    "1 - Первое задание\n" +
                    "2 - Второе задание\n" +
                    "3 - Третье задание\n\n" +
                    "0 - Выход из программы");
            Scanner in = new Scanner(System.in);
            int select_task = in.nextInt();

            switch (select_task) {
                case 1:
                    First_Task.converterCurrency();
                    break;
                case 2:
                    Second_Task.printWeatherAdvice();
                    break;
                case 3:
                    Third_Task.recommendBreakfast();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Возможно вы ввели не ту цифру...");
            }
        }
    }
}