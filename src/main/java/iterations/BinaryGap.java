package iterations;

public class BinaryGap {

    public int solution(int number) {
        String binary = Integer.toBinaryString(number);
        int maxGap = 0;
        int gapCounter = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0'){
                gapCounter++;
            } else {
                if (gapCounter > maxGap){
                    maxGap = gapCounter;
                }
                gapCounter = 0;
            }
        }
        return maxGap;
    }
}
