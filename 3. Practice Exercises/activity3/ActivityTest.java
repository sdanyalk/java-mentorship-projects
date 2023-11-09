package activity3;

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
    void OddOrEven_EvenNumber_ReturnsEven() {
        assertEquals(activity.oddOrEven(4), "even");
    }

    @Test
    void OddOrEven_OddNumber_ReturnsOdd() {
        assertEquals(activity.oddOrEven(5), "odd");
    }
}