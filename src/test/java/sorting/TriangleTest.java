package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    public void testFirstPositiveCase() throws Exception {
        assertEquals(1, new Triangle().solution(new int[]{10,5,8}));
    }

    @Test
    public void testFirstNegativeCase() throws Exception {
        assertEquals(0, new Triangle().solution(new int[]{10,50,1}));
    }

    @Test
    public void testSecondPositiveCase() throws Exception {
        assertEquals(1, new Triangle().solution(new int[]{1,10,5,8}));
    }

    @Test
    public void testThirdPositiveCase() throws Exception {
        assertEquals(1, new Triangle().solution(new int[]{10,2,5,1,8,20}));
    }

    @Test
    public void testSecondNegativeCase() throws Exception {
        assertEquals(0, new Triangle().solution(new int[]{10,50,5,1}));
    }
}