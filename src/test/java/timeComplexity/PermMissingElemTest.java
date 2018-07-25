package timeComplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(4, new PermMissingElem().solution(new int[]{2,3,1,5}));
    }

    @Test
    public void testMissingLast() throws Exception {
        assertEquals(5, new PermMissingElem().solution(new int[]{2,3,1,4}));
    }

    @Test
    public void testMissingFirst() throws Exception {
        assertEquals(1, new PermMissingElem().solution(new int[]{2,3,5,4}));
    }

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals(1, new PermMissingElem().solution(new int[]{}));
    }

    @Test
    public void testOneElementArrayWithOne() throws Exception {
        assertEquals(2, new PermMissingElem().solution(new int[]{1}));
    }

    @Test
    public void testOneElementArrayWithTwo() throws Exception {
        assertEquals(1, new PermMissingElem().solution(new int[]{2}));
    }

}