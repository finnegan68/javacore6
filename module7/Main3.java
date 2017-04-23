package module7;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(10000);
        List<String> strings = new LinkedList<String>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < numbers.size(); i++) {
            numbers.add(i);
        }
        String lol = "lol";
        for (int j = 0; j < 10000; j++) {
            strings.add(lol);
        }
        // поиск смысла жизни ...
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        System.out.println(timeConsumedMillis);


    }
}
