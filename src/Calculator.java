import java.util.ArrayList;

public class Calculator {


    public Integer multiple(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        else {
            Integer mult = 1;
            for (Integer i:list) {
                mult *= i;
            }
            return mult;
        }
    }
}