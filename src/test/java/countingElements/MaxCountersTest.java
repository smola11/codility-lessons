package countingElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    @Test
    public void testFirstCase() throws Exception {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, new MaxCounters().solutionGoodPerformance(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

}