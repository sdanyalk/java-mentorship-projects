package activity1;

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
    void Sum_GivenTwoNumbers_ReturnsTheSum() {
        assertEquals(activity.sum(1, 2), 3);
    }

    @Test
    void Subtract_GivenTwoNumbers_ReturnsTheDifference() {
        assertEquals(activity.subtract(3, 1), 2);
    }

    @Test
    void Multiply_GivenTwoNumbers_ReturnsTheProduct() {
        assertEquals(activity.multiply(3, 2), 6);
    }

    @Test
    void Divide_GivenTwoNumbers_ReturnsTheDivision() {
        assertEquals(activity.divide(4, 2), 2);
    }
}