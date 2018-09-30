package prefixSums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(1, new MinAvgTwoSlice().solution(new int[]{4,2,2,5,1,5,8}));
    }

}