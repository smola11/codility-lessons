package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CyclicRotationTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(new int[]{9, 7, 6, 3, 8}, new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 3));
    }



    @Test
    public void testSecondCase() throws Exception {
        assertEquals(new int[]{1,2,3,4}, new CyclicRotation().solution(new int[]{1,2,3,4}, 4));
    }

}