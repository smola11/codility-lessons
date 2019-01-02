package leader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquiLeaderTest {

    @Test
    public void whenOneElementReturnZero(){
        assertEquals(0, new EquiLeader().solution(new int[]{1}));
    }

    @Test
    public void whenTwoSameElementsReturnOne(){
        assertEquals(1, new EquiLeader().solution(new int[]{1,1}));
    }

    @Test
    public void whenTwoDifferentElementsReturnZero(){
        assertEquals(0, new EquiLeader().solution(new int[]{1,2}));
    }

    @Test
    public void whenThreeSameElementsReturnTwo(){
        assertEquals(2, new EquiLeader().solution(new int[]{1,1,1}));
    }

    @Test
    public void whenTwoSameElementsAndOneDifferentReturnZero(){
        assertEquals(0, new EquiLeader().solution(new int[]{1,1,2}));
    }

    @Test
    public void whenFourSameElementsReturnThree(){
        assertEquals(3, new EquiLeader().solution(new int[]{1,1,1,1}));
    }

    @Test
    public void whenThreeSameElementsAndOneDifferentReturnOne(){
        assertEquals(1, new EquiLeader().solution(new int[]{1,1,1,2}));
    }

}