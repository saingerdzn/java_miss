package lab.lab1;

import java.util.HashMap;
import java.util.Map;

public class miss5 {
    public static void main(String[] args) {
        Map<String, Integer> transactions = new HashMap<>();
        transactions.put("пополнение через банкомат", 1000);
        transactions.put("оплата интернета", -500);
        transactions.put("кафе", -300);
        transactions.put("зарплата", 15000);
        transactions.put("штраф за парковку", -2500);
        transactions.put("подарок", 2000);

        int balance = calculateBalance(transactions);
        System.out.println("Итоговая сумма на счету составляет " + balance);
    }

    public static int calculateBalance(Map<String, Integer> transactions) {
        int balance = 0;
        for (int amount : transactions.values()) {
            balance += amount;
        }
        return balance;
    }
}