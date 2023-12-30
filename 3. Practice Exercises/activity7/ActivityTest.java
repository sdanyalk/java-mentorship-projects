package activity7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActivityTest {
    Activity activity;

    @BeforeEach
    void setUp() {
        activity = new Activity();
    }

    @Test
    void testCase1() {
        assertTrue(activity.isLeapYear(2012));
    }

    @Test
    void testCase2() {
        assertFalse(activity.isLeapYear(2007));
    }
}
