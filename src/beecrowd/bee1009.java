import java.util.Scanner;

public class bee1009 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double Salary = scanner.nextDouble();
        double Sales = scanner.nextDouble();

        double total = Salary + (Sales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);

    }
}