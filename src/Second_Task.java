import java.util.Scanner;

public class Second_Task {
    public static void printWeatherAdvice(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите какая сейчас погода:");

        String weather = in.next();

        System.out.println(weather.equals("Дождь")? "Беру с собой зонт" : "Иду налегке");

        System.out.println("Люблю гулять!");
    }
}
