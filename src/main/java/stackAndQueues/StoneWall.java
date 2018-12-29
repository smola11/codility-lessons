package stackAndQueues;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {
        Stack<Integer> wall = new Stack<Integer>();
        int count = 0;
        for(int i = 0; i < H.length; i++){
            while(!wall.empty() && H[i] < wall.peek()){
                wall.pop();
            }
            if(wall.empty() || H[i] > wall.peek()){
                wall.push(H[i]);
                count++;
            }
        }
        return count;
    }
}
