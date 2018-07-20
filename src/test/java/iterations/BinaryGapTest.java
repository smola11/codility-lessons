package iterations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(5, new BinaryGap().solution(1041));
    }

    @Test
    public void testSecondCase() throws Exception {
        assertEquals(2, new BinaryGap().solution(9));
    }

    @Test
    public void testThirdCase() throws Exception {
        assertEquals(4, new BinaryGap().solution(529));
    }

    @Test
    public void testFourthCase() throws Exception {
        assertEquals(1, new BinaryGap().solution(20));
    }

    @Test
    public void testNoBinaryGaps() throws Exception {
        assertEquals(0, new BinaryGap().solution(32));
    }

    @Test
    public void testNoBinaryGapsSecondCase() throws Exception {
        assertEquals(0, new BinaryGap().solution(15));
    }

}