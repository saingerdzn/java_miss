package lab.lab1;
import java.util.ArrayList;
import java.util.List;

public class miss9 {
    public static void main(String[] args) {
        int[] workHours = {8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0};

        List<Integer> hoursPerWeek = calculateHoursPerWeek(workHours);
        System.out.println("Часы работы по неделям: " + hoursPerWeek);

        double averageDailyHours = calculateAverageDailyHours(workHours);
        System.out.println("Среднее количество часов в день (учитывая только рабочие дни): " + averageDailyHours);
    }

    public static List<Integer> calculateHoursPerWeek(int[] workHours) {
        List<Integer> hoursPerWeek = new ArrayList<>();
        int weekHours = 0;
        for (int i = 0; i < workHours.length; i++) {
            weekHours += workHours[i];
            if ((i + 1) % 5 == 0) {
                hoursPerWeek.add(weekHours);
                weekHours = 0;
            }
        }
        return hoursPerWeek;
    }

    public static double calculateAverageDailyHours(int[] workHours) {
        int totalHours = 0;
        int workDays = 0;
        for (int hours : workHours) {
            if (hours != 0) {
                totalHours += hours;
                workDays++;
            }
        }
        return (double) totalHours / workDays;
    }
}