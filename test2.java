import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");12

        if (!sc.hasNextInt()) {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        } else {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
            System.out.println
        }

    }
}
