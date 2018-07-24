package timeComplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJmpTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(3, new FrogJmp().solution(10, 85, 30));
    }

}