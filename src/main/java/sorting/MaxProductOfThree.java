package sorting;

import java.util.Arrays;

public class MaxProductOfThree {
    // -5, 5, -5, 4 => -5, -5, 4, 5
    public int solution(int[] A) {
        Arrays.sort(A);
        int max1 = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        int max2 = A[0] * A[1] * A[A.length - 1];
        return Math.max(max1, max2);
    }
}
