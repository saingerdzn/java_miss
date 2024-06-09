package lab.lab1;
import java.util.Scanner;

public class miss7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст пользователя: ");
        int age = scanner.nextInt();
        scanner.close();

        System.out.print("Вывод: ");
        for (int i = 1; i <= age; i += (age % 2 == 0) ? 2 : 1) {
            System.out.print(i + ((i < age) ? ", " : ""));
        }
    }
}