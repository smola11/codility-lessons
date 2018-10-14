package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(60, new MaxProductOfThree().solution(new int[]{-3,1,2,-2,5,6}));
    }

    @Test
    public void testSecoondCase() throws Exception {
        assertEquals(125, new MaxProductOfThree().solution(new int[]{-5, 5, -5, 4}));
    }
}