import java.util.Scanner;

public class bee1010 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        float m1 = scanner.nextFloat();

        int n2 = scanner.nextInt();
        float m2 = scanner.nextFloat();

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", (n1 * m1) + (n2 * m2)));

    }
}