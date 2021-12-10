package Puzzles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SubmarineTest {

    Submarine sub;

    @BeforeEach
    void setUp() {
        sub = new Submarine();
    }

    @Test
    void move() {
        Map<String, Integer> dummyMap = new HashMap<>();
        dummyMap.put("forward", 6);
        dummyMap.put("down", 3);
        sub.move(dummyMap);
        dummyMap.put("forward", 8);
        dummyMap.put("down", 5);
        sub.move(dummyMap);
        dummyMap.put("forward", 9);
        dummyMap.put("down",2);
        sub.move(dummyMap);
        assertEquals( 23 ,sub.getSubx().get(0));
        assertEquals(10, sub.getSubaim().get(0));
        assertEquals(96, sub.getSuby().get(0));
        // 3x8 = 24, 9x8 = 72
        //forward X does two things:
        //It increases your horizontal position by X units.
        //It increases your depth by your aim multiplied by X.
    }
}