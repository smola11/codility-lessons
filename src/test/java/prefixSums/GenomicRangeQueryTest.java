package prefixSums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GenomicRangeQueryTest {

    @Test
    public void testWholeSequence() throws Exception {
        assertArrayEquals(new int[]{1}, new GenomicRangeQuery().solution("CAGCCTA", new int[]{0}, new int[]{6}));
    }

    @Test
    public void testTwoSequence() throws Exception {
        assertArrayEquals(new int[]{1, 1}, new GenomicRangeQuery().solution("CAGCCTA", new int[]{0, 1}, new int[]{6, 5}));
    }

    @Test
    public void testFirstCase() throws Exception {
        assertArrayEquals(new int[]{2, 4, 1}, new GenomicRangeQuery().solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }

}