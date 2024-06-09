package lab.lab1;
import java.util.Scanner;

public class miss4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество минут: ");
        int minutes = scanner.nextInt();
        System.out.print("Количество сообщений: ");
        int messages = scanner.nextInt();
        scanner.close();

        double baseCost = 15.00;
        double additionalMinutesCost = Math.max(0, minutes - 50) * 0.25;
        double additionalMessagesCost = Math.max(0, messages - 50) * 0.15;
        double totalCost = baseCost + additionalMinutesCost + additionalMessagesCost + 0.44;
        double tax = totalCost * 0.05;

        System.out.printf("Базовая стоимость: $%.2f%n", baseCost);
        if (additionalMinutesCost > 0) {
            System.out.printf("Дополнительные минуты: $%.2f (%d минут)%n", additionalMinutesCost, minutes - 50);
        }
        if (additionalMessagesCost > 0) {
            System.out.printf("Дополнительные сообщения: $%.2f (%d сообщений)%n", additionalMessagesCost, messages - 50);
        }
        System.out.printf("Сбор за 911: $%.2f%n", 0.44);
        System.out.printf("Налог: $%.2f (5%% от общей суммы $%.2f)%n", tax, totalCost - tax);
        System.out.printf("Итоговая сумма: $%.2f%n", totalCost);
    }
}