package arrays;

public class CyclicRotation {

    public int[] solution(int[] integers, int rotations) {
        int size = integers.length;
        int[] cyclic = new int[size];
        for (int x = 0; x < size; x++) {
            cyclic[(x + rotations) % size] = integers[x];
        }
        return cyclic;
    }
}
