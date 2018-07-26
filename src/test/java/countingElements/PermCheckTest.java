package countingElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {

    @Test
    public void shouldReturnTrue() throws Exception {
        assertEquals(1, new PermCheck().solution(new int[]{4, 1, 3, 2}));
    }

    @Test
    public void shouldReturnFalse() throws Exception {
        assertEquals(0, new PermCheck().solution(new int[]{4, 1, 3}));
    }

    @Test
    public void whenSingleElementShouldReturnTrue() throws Exception {
        assertEquals(1, new PermCheck().solution(new int[]{1}));
    }

}