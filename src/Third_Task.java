import java.util.Scanner;

public class Third_Task {
    public static void recommendBreakfast(){
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько у вас яиц в холодильнике?");

        int count_egg = in.nextInt();

        System.out.println(count_egg >= 3? "Рекомендую приготовить омлет." : "Рекомендую позавтракать бутербродами.");

        System.out.println("Приятного аппетита!");
    }
}
