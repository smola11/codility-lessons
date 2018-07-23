package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {

    @Test
    public void testThreeElements() throws Exception {
        assertEquals(3, new OddOccurrencesInArray().solution(new int[]{9, 3, 9}));
    }

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(7, new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }


}