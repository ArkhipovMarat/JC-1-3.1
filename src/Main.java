import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newArrayList = new ArrayList<>();

        for (Integer number : arrayList) {
            if (number>0) newArrayList.add(number);
        }

        newArrayList.removeIf(number -> !(number % 2 == 0));
        newArrayList.sort(Comparator.naturalOrder());
        System.out.println(newArrayList);
    }
}

