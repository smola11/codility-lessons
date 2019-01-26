package leader;

public class Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int stackSize = 0;
        int value = 0;

        for (int i = 0; i < A.length; i++) {
            if (stackSize == 0) {
                stackSize++;
                value = A[i];
            } else {
                if (value != A[i]) {
                    stackSize--;
                } else {
                    stackSize++;
                }
            }
        }

        int candidate = -1;
        if (stackSize > 0) {
            candidate = value;
        }
        int leader = -1;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                count++;
            }
            if (count > n / 2) {
                leader = candidate;
                return i;
            }
        }
        return leader;
    }
}
