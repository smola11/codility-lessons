package countingElements;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int numberOfCounters, int[] integers) {
        int[] counters = new int[numberOfCounters];

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > numberOfCounters) {
                int maxInCounters = Arrays.stream(counters).max().getAsInt();
                counters = Arrays.stream(counters).map(x -> maxInCounters).toArray();
            } else {
                int counterPosition = integers[i] - 1;
                counters[counterPosition]++;
            }
        }
        return counters;
    }

    public int[] solutionGoodPerformance(int N, int[] A) {
        int max = 0;
        int lastMax = 0;
        int[] counters = new int[N];

        for (int k = 0; k < A.length; k++) {
            if (A[k] >= 1 && A[k] <= N) {
                counters[A[k] - 1] = Math.max(counters[A[k] - 1], lastMax);
                counters[A[k] - 1] += 1;
                max = Math.max(max, counters[A[k] - 1]);
            } else if (A[k] == N + 1) {
                lastMax = max;
            }
        }
        for(int i = 0 ; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastMax);
        }
        return counters;
    }
}
