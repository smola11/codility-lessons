package sorting;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            // Beware of overflow
            if (A[i] >= 0 && A[i] > A[i+2] - A[i+1]) return 1;
        }
        return 0;
    }
}
