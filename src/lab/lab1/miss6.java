package lab.lab1;
import java.util.Scanner;

public class miss6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес на Земле в кг: ");
        double weightOnEarth = scanner.nextDouble();

        System.out.println("Результаты:");
        double[] moonWeights = calculateMoonWeights(weightOnEarth, 15);
        for (int i = 0; i < moonWeights.length; i++) {
            System.out.printf("%d год: %.3f кг%n", i + 1, moonWeights[i]);
        }

        scanner.close();
    }

    public static double[] calculateMoonWeights(double weightOnEarth, int years) {
        double[] moonWeights = new double[years];
        double weightOnMoon;
        for (int i = 0; i < years; i++) {
            weightOnMoon = weightOnEarth * 0.165;
            moonWeights[i] = weightOnMoon;
            weightOnEarth *= 1.032;
        }
        return moonWeights;
    }
}