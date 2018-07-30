package countingElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(5, new MissingInteger().solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void testSecondCase() throws Exception {
        assertEquals(4, new MissingInteger().solution(new int[]{1, 2, 3}));
    }

    @Test
    public void testThirdCase() throws Exception {
        assertEquals(1, new MissingInteger().solution(new int[]{-1, -3}));
    }


}