package activity4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityTest {
    Activity activity;

    @BeforeEach
    void setUp() {
        activity = new Activity();
    }

    @Test
    void CalculateFactorial_IntegerNumber_ReturnsFactorial() {
        assertEquals(activity.calculateFactorial(4), 24);
    }
}