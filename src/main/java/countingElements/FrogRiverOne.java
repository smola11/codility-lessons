package countingElements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int lastPosition, int[] leaves) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < leaves.length; i++) {
            if (set.add(leaves[i])) {
                lastPosition--;
            }
            if (lastPosition == 0) {
                return i;
            }
        }
        return -1;
    }

}
