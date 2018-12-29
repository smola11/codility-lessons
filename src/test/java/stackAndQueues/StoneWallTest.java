package stackAndQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneWallTest {

   @Test
    public void test1(){
       assertEquals(2, new StoneWall().solution(new int[]{1,2,2}));
   }

    @Test
    public void test2(){
        assertEquals(3, new StoneWall().solution(new int[]{2,1,2}));
    }

    @Test
    public void test3(){
        assertEquals(1, new StoneWall().solution(new int[]{1,1,1}));
    }

    @Test
    public void test4(){
        assertEquals(4, new StoneWall().solution(new int[]{4,1,2,3}));
    }

    @Test
    public void test5(){
        assertEquals(2, new StoneWall().solution(new int[]{1,1,2,1}));
    }

    @Test
    public void test6(){
        assertEquals(7, new StoneWall().solution(new int[]{8,8,5,7,9,8,7,4,8}));
    }

}