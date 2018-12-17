package stackAndQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketsTest {

    @Test
    public void shouldReturnOneWhenTwoOppositeBrackets1() {
        assertEquals(1, new Brackets().solution("()"));
    }

    @Test
    public void shouldReturnOneWhenTwoOppositeBrackets2() {
        assertEquals(1, new Brackets().solution("[]"));
    }

    @Test
    public void shouldReturnOneWhenTwoOppositeBrackets3() {
        assertEquals(1, new Brackets().solution("{}"));
    }

    @Test
    public void shouldReturnZeroWhenTwoDifferentBrackets() {
        assertEquals(0, new Brackets().solution("{]"));
    }

}