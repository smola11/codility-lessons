package maximumSliceProblem;

public class MaxProfit {

    // Poor performance
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxDifference = 0;
        for (int i = 0; i < A.length - 1; i++) {
            int current = A[i];
            for (int j = i + 1; j < A.length; j++) {
                int next = A[j];
                int difference = next - current;
                if (difference > maxDifference){
                    maxDifference = difference;
                }

            }
        }
        return maxDifference;
    }
}
