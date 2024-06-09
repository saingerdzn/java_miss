import java.util.Scanner;

public class bee1017 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double h = scanner.nextInt();
        double vm = scanner.nextInt();

        System.out.printf("%.3f%n", (h * vm) / 12);

    }
}