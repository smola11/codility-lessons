package timeComplexity;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] integers) {

        // if array has 0 or 1 element
        if (integers.length == 0) return 1;
        if (integers.length == 1) {
            if (integers[0] == 1) return 2;
            else return 1;
        }
        Arrays.sort(integers);
        for (int i = 0; i < integers.length - 1; i++) {
            if (integers[i] + 1 != integers[i + 1]) {
                return integers[i] + 1;
            }
        }
        // if last or first missing
        if (integers[integers.length - 1] == integers.length + 1) {
            return integers[0] - 1;
        } else {
            return integers[integers.length - 1] + 1;
        }
    }

    // solution using more "mathematical" approach
    public int solutionWithMathApproach(int[] integers) {
        long N = integers.length + 1;
        long total = N * (N + 1) / 2;
        for (int i : integers) {
            total -= i;
        }
        return (int) total;
    }


}
