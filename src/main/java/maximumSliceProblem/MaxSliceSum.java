package maximumSliceProblem;

public class MaxSliceSum {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int max_ending = A[0];
        int max_slice = A[0];

        for (int i = 1; i < A.length; i++) {
            if (max_ending < 0) {
                max_ending = A[i];
            } else {
                max_ending = max_ending + A[i];
            }
            if (max_ending > max_slice) {
                max_slice = max_ending;
            }
        }

        return max_slice;
    }
    // Correctness 100% Performance 60%
    public int solutionPoorPerformance(int[] A) {
        // write your code in Java SE 8
        int maxSum = A[0];

        for (int i = 0; i < A.length - 1; i++) {
            int sum = A[i];
            if (sum > maxSum) maxSum = sum;

            for (int j = i + 1; j < A.length; j++) {
                if (A[j] > maxSum) maxSum = A[j];
                sum += A[j];
                if (sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }
}
