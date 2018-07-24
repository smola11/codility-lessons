package timeComplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    @Test
    public void testFirstCase() throws Exception {
        assertEquals(3, new PermMissingElem().solution(new int[]{2,3,1,5}, 4));
    }

}