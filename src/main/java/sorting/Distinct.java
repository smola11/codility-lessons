package sorting;

import java.util.Arrays;

public class Distinct {

    public int solution(int[] a) {
        if (a.length == 0) return 0;
        Arrays.sort(a);
        int distinct = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) continue;
            distinct++;
        }
        return distinct;
    }
}
