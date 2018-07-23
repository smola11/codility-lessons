package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CyclicRotationTest {

    @Test
    public void testFirstCase() throws Exception {
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 3));
    }

    @Test
    public void testSecondCase() throws Exception {
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 1));
    }

    @Test
    public void testRotationsBiggerThanArray() throws Exception {
        assertArrayEquals(new int[]{3, 4, 1, 2}, new CyclicRotation().solution(new int[]{1, 2, 3, 4}, 10));
    }


    @Test
    public void testShouldReturnSameArray() throws Exception {
        assertArrayEquals(new int[]{1, 2, 3, 4}, new CyclicRotation().solution(new int[]{1, 2, 3, 4}, 4));
    }

    @Test
    public void testShouldReturnSameArraySecondCase() throws Exception {
        assertArrayEquals(new int[]{1, 2, 3, 4}, new CyclicRotation().solution(new int[]{1, 2, 3, 4}, 8));
    }

    @Test
    public void testEmptyArray() throws Exception {
        assertArrayEquals(new int[]{}, new CyclicRotation().solution(new int[]{}, 8));
    }

}