package countingElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(6, new FrogRiverOne().solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }

    @Test
    public void oneElementShouldReturn0() throws Exception {
        assertEquals(0, new FrogRiverOne().solution(1, new int[]{1}));
    }

}