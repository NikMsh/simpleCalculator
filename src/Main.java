import java.util.ArrayList;

public class Main {
    private static boolean isNumeric(String str) {
        try {
            Integer value = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ArrayList<Integer> list = new ArrayList();

        for (String str:args) {
            if (isNumeric(str))
                list.add(Integer.valueOf(str));
        }
        calculator.multiple(list);

        System.out.println();
    }
}
