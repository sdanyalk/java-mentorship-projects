package activity9;

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
        int[] numbers = new int[]{1, 2, 5, 3, 9};

        assertEquals(9, activity.max(numbers));
    }

    @Test
    void testCase2() {
        int[] numbers = new int[]{-1, 2, 10, 3, 5};

        assertEquals(10, activity.max(numbers));
    }
}