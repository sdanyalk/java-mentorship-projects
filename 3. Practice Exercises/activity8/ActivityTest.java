package activity8;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        assertEquals(15, activity.sumArray(numbers));
    }

    @Test
    void testCase2() {
        int[] numbers = new int[]{-1, -2, 3, 4, 5};

        assertEquals(9, activity.sumArray(numbers));
    }
}