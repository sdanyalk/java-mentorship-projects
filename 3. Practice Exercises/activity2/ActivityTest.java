package activity2;

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
    void ConvertToCelsius_TemperatureInFahrenheit_ReturnsTemperatureInCelsius() {
        assertEquals(activity.convertToCelsius(65), 18.33333396911621);
    }

    @Test
    void ConvertToFahrenheit_TemperatureInCelsius_ReturnsTemperatureInFahrenheit() {
        assertEquals(activity.convertToFahrenheit(18), 64.4000015258789);
    }
}