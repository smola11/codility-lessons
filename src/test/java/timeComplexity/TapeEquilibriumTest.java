package timeComplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(1, new TapeEquilibrium().solution(new int[]{3, 1, 2, 4, 3}));
    }

}