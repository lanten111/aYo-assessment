package co.za.ayoassessment.service;

import org.springframework.stereotype.Component;

@Component
public interface ConventionInterface {

    double mitersToFeet(double miters);

    double feetToMiters(double feet);

    double celciusToFahrenheit(double celcius);

    double fahrenheitToCelcius(double celcius);

    double psiToBar(double psi);

    double barToPsi(double bar);

    double KilogramsToPounds(double kilograms);

    double poundsToKilograms(double pounds);

    double litersToGallons(double liters);

    double gallonsToLiters(double gallons);
}
