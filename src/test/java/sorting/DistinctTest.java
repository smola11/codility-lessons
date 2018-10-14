package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistinctTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(4, new Distinct().solution(new int[]{2,3,1,1,4,2}));
    }



}