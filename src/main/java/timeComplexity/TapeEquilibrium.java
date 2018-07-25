package timeComplexity;

import java.util.Arrays;

public class TapeEquilibrium {

    public int solution(int[] integers) {
        int sum = Arrays.stream(integers).sum();
        int minDifference = Integer.MAX_VALUE;
        int toBeSubstructed = 0;
        for (int i = 0; i < integers.length - 1; i++) {
            toBeSubstructed += integers[i];
            int difference = Math.abs(toBeSubstructed - (sum - toBeSubstructed));
            if (difference < minDifference){
                minDifference = difference;
            }
        }
        return minDifference;
    }
}
