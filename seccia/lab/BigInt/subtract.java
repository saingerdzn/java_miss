import java.util.ArrayList;
import java.util.Collections;

public class subtract {
    public static void main(String[] args) {
        BigIntegerCustom a = new BigIntegerCustom("3287498723489");
        BigIntegerCustom b = new BigIntegerCustom("123454689956");
        ArrayList<Integer> result = BigIntegerCustom.subtractBigInt(a, b);
        
        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }
        
        Collections.reverse(result);
        System.out.print("Вычитание: ");
        for (int digit : result) {
            System.out.print(digit);
        }
        System.out.println();
    }
}

class BigIntegerCustom {
    private ArrayList<Integer> list;

    public BigIntegerCustom(String d) {
        for (char c : d.toCharArray()) {
            if (Character.isLetter(c)) {
                throw new IllegalArgumentException("Illegal character: " + c);
            }
        }
        d = d.replaceAll(" ", "");
        list = new ArrayList<>();
        for (int i = d.length() - 1; i >= 0; i--) {
            list.add(d.charAt(i) - '0');
        }
    }

    public static ArrayList<Integer> subtractBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        
        int borrow = 0;
        for (int i = 0; i < aList.size(); i++) {
            int aDigit = aList.get(i);
            int bDigit = i < bList.size() ? bList.get(i) : 0;
            int diff = aDigit - bDigit - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.add(diff);
        }

        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }
        
        return result;
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }
}