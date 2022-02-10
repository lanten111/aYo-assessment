package co.za.ayoassessment;

import co.za.ayoassessment.service.ConventionInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AyoAssessmentApplicationTests {

    //tests to test application service layer
    @Autowired
    ConventionInterface conventionInterface;

    @Test
    void testTemperature() {

        double celcius = conventionInterface.fahrenheitToCelcius(10);
        double fahrenheit = conventionInterface.celciusToFahrenheit(10);

        Assertions.assertEquals(50, fahrenheit);
        Assertions.assertEquals(-12.222222231999998, celcius);
    }

    @Test
    void testDistance() {

        double feet = conventionInterface.mitersToFeet(10);
        double miters = conventionInterface.feetToMiters(10);

        Assertions.assertEquals(32.808398950000004, feet);
        Assertions.assertEquals(3.0480000000121916, miters);
    }

    @Test
    void testVolume() {

        double liters = conventionInterface.gallonsToLiters(10);
        double gallons = conventionInterface.litersToGallons(10);

        Assertions.assertEquals(37.85411784, liters);
        Assertions.assertEquals(2.641720524, gallons);
    }

    @Test
    void testPressure() {

        double psi = conventionInterface.barToPsi(10);
        double bar = conventionInterface.psiToBar(10);

        Assertions.assertEquals(145.03773773, psi);
        Assertions.assertEquals(0.689476, bar);
    }

    @Test
    void testWeight() {

        double pounds = conventionInterface.KilogramsToPounds(10);
        double kilograms = conventionInterface.poundsToKilograms(10);

        Assertions.assertEquals(22.046226218 , pounds);
        Assertions.assertEquals(4.535923700000001, kilograms);
    }

}
