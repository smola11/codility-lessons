package prefixSums;

public class PassingCars {

    public int solution(int[] cars) {

        int sumOfWest = 0;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == 1) sumOfWest++;
        }

        int numberOfPairs = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == 0) {
                numberOfPairs += sumOfWest;
            } else {
                sumOfWest--;
            }
            if (numberOfPairs > 1000000000) return -1;
        }
        return numberOfPairs;
    }

    public int alternativeSolution(int[] A) {
        int zCount = 0;  // how many going east
        int passing = 0; // total passing pairs

        for(int i : A){
            if(i == 1){
                passing += zCount;
            }
            else zCount++;
        }
        if(passing > 1e9 || passing < 0) return -1;
        else return passing;
    }
}
