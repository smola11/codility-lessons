package maximumSliceProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    @Test
    void ascending() {
        assertEquals(4, new MaxProfit().solution(new int [] {1,2,3,4,5}));
    }

    @Test
    void descending() {
        assertEquals(0, new MaxProfit().solution(new int [] {5,4,3,2,1}));
    }
}