package activity6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActivityTest {
    Activity activity;

    @BeforeEach
    void setup() {
        activity = new Activity();
    }

    @Test
    void testCase1() {
        assertEquals("Fizz", activity.fizzbuzz(3));
    }

    @Test
    void testCase2() {
        assertEquals("Buzz", activity.fizzbuzz(5));
    }

    @Test
    void testCase3() {
        assertEquals("FizzBuzz", activity.fizzbuzz(15));
    }

    @Test
    void testCase4() {
        assertNull(activity.fizzbuzz(4));
    }
}
