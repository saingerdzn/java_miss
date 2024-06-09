import java.util.Scanner;

public class bee1046 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startHour = scanner.nextInt();
        int endHour = scanner.nextInt();
        scanner.close();

        int duration;
        if (startHour == endHour) {
            duration = 24;
        } else if (startHour < endHour) {
            duration = endHour - startHour;
        } else {
            duration = (24 - startHour) + endHour;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duration);
    }
}