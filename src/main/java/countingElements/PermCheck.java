package countingElements;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] integers) {
        Arrays.sort(integers);
        if (integers[0] != 1) return 0;
        for (int i = 0; i < integers.length - 1; i++) {
            if (integers[i] + 1 != integers[i + 1]) return 0;
        }
        return 1;
    }

    // solution without sorting
    public int solutionWithoutSorting(int[] A) {
        boolean[] seen = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) return 0;
            if (seen[A[i]] == true) return 0;
            else seen[A[i]] = true;
        }
        return 1;
    }
}
