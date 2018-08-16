package prefixSums;

public class GenomicRangeQuery {


    // Prefix sums: https://codility.com/media/train/3-PrefixSums.pdf

    // Poor performance
    public int[] solution(String dna, int[] starts, int[] ends) {
        int[] results = new int[starts.length];
        int[] integers = mapDnaToIntegers(dna);

        for (int i = 0; i < starts.length; i++) {
            int start = starts[i];
            int end = ends[i];
            int min = 4;
            for (int j = start; j <= end; j++) {
                if (integers[j] < min) {
                    min = integers[j];
                }
            }
            results[i] = min;
        }
        return results;
    }

    private int[] mapDnaToIntegers(String dna) {
        int[] integers = new int[dna.length()];
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'A':
                    integers[i] = 1;
                    break;
                case 'C':
                    integers[i] = 2;
                    break;
                case 'G':
                    integers[i] = 3;
                    break;
                case 'T':
                    integers[i] = 4;
                    break;
                default:
                    break;
            }
        }
        return integers;
    }

    // https://rafal.io/posts/codility-genomic-range-query.html
    public int[] alternativeSolutionWithPrefixSum(String S, int[] P, int[] Q) {
        int len = S.length();
        int[][] arr = new int[len][4];
        int[] result = new int[P.length];

        for(int i = 0; i < len; i++){
            char c = S.charAt(i);
            if(c == 'A') arr[i][0] = 1;
            if(c == 'C') arr[i][1] = 1;
            if(c == 'G') arr[i][2] = 1;
            if(c == 'T') arr[i][3] = 1;
        }
        // compute prefixes
        for(int i = 1; i < len; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] += arr[i-1][j];
            }
        }

        for(int i = 0; i < P.length; i++){
            int x = P[i];
            int y = Q[i];
            for(int a = 0; a < 4; a++){
                int sub = 0;
                if(x-1 >= 0) sub = arr[x-1][a];
                if(arr[y][a] - sub > 0){
                    result[i] = a+1;
                    break;
                }
            }
        }
        return result;
    }
}
