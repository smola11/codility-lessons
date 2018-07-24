package timeComplexity;

public class FrogJmp {

    // Not optimal
    public int notOptimalsolution(int X, int Y, int jumpDistance) {

        int minJumps = 0;
        while (X < Y) {
            X += jumpDistance;
            minJumps++;
        }
        return minJumps;
    }

    // Optimal O(n)
    public int solution(int X, int Y, int jumpDistance) {

        int jumpNumber = (Y - X) / jumpDistance;
        return (Y - X) % jumpDistance == 0 ? jumpNumber : jumpNumber + 1;
    }
}
