package countingElements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] integers) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < integers.length; i++) {
            set.add(integers[i]);
        }

        int num = 1;
        while (set.contains(num)) {
            num++;
        }
        return num;
    }

    public int alternativeSolution(int[] integers) {

        Set<Integer> set = new HashSet<>();
        int min = 1;
        for (int integer : integers) {
            if (integer > 0) {
                set.add(integer);
            }
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) return i;
        }
        return min;
    }

}
