package activity5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ActivityTest {
    Activity activity;

    @BeforeEach
    void setUp() {
        activity = new Activity();
    }

    @Test
    void isPrimeNumber_PrimeNumber_ReturnsTrue() {
        assertTrue(activity.isPrimeNumber(7));
    }

    @Test
    void isPrimeNumber_NotPrimeNumber_ReturnsFalse() {
        assertFalse(activity.isPrimeNumber(6));
    }
}
