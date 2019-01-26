package maximumSliceProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSliceSumTest {

    @Test
    void poorShouldReturn5() {
        assertEquals(5, new MaxSliceSum().solutionPoorPerformance(new int[]{3, 2, -6, 4, 0}));
    }

    @Test
    void poorTwoElementArray() {
        assertEquals(4, new MaxSliceSum().solutionPoorPerformance(new int[]{-2, 4}));
    }

    @Test
    void shouldReturn5() {
        assertEquals(5, new MaxSliceSum().solution(new int[]{3, 2, -6, 4, 0}));
    }

    @Test
    void twoElementArray() {
        assertEquals(4, new MaxSliceSum().solution(new int[]{-2, 4}));
    }
}