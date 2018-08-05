package prefixSums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassingCarsTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(5, new PassingCars().solution(new int[]{0, 1, 0, 1, 1}));
    }

}