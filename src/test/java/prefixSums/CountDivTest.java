package prefixSums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(3, new CountDiv().solution(6, 11, 2));
    }

    @Test
    public void testSecondCase() throws Exception {
        assertEquals(20, new CountDiv().solution(11, 345, 17));
    }

}