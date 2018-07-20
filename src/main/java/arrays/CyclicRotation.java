package arrays;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] integers, int rotations) {

        rotations = rotations % integers.length;
        if (rotations == 0) return integers;

        int splitPoint = integers.length - rotations;
        int[] subarrayFirst = Arrays.copyOfRange(integers, 0, splitPoint);
        int[] subarraySecond = Arrays.copyOfRange(integers, splitPoint, integers.length);

        return concatArrays(subarraySecond, subarrayFirst);
    }

    private int[] concatArrays(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
