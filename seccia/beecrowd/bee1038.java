import java.util.Scanner;

public class bee1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] t = new float[] {4.00f, 4.50f, 5.00f, 2.00f, 1.50f};

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        System.out.printf("Total: R$ %.2f%n", t[n-1] * q);

    }
}