package arrays;

import java.util.HashMap;

public class OddOccurrencesInArray {

    // Solution with XOR - Exclusive OR
    // The main challenge of this question is the XOR operations: X^X=0, and 0^X=X.
    // Logically, the addition and subtraction operations also are able to do this work.

    // It is the same as arithmetic solution. We might use addition and subtraction, because x + a – a = x.
    // Here it is used the XOR operation, with x XOR a XOR a = x.
    // One great advantage of XOR over addition and subtraction is that, XOR never lead to overflow.
    // As a result, the XOR operation is widely used in encryption.

    public int solution(int[] integers) {
        int elem = 0;
        for (int i = 0; i < integers.length; i++) {
            System.out.println(Integer.toBinaryString(integers[i]));
            elem ^= integers[i];
            System.out.println("Element: " + Integer.toBinaryString(elem));
        }
        return elem;
    }

    public int SolutionWithMap(int[] integers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int integer : integers) {
            if (map.containsKey(integer) && map.get(integer) == 1) {
                map.remove(integer);
            } else {
                map.put(integer, 1);
            }
        }
        for (int key : map.keySet()) {
            return key;
        }
        return 0;
    }
}

