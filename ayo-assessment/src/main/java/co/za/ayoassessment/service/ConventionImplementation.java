package co.za.ayoassessment.service;

import co.za.ayoassessment.constant.ConversionConstant;
import org.springframework.stereotype.Service;

@Service
public class ConventionImplementation implements ConventionInterface {

    @Override
    public double mitersToFeet(double miters) {
        return miters * ConversionConstant.FEET_MITER_CONSTANT;
    }

    @Override
    public double feetToMiters(double feet) {
        return feet / ConversionConstant.FEET_MITER_CONSTANT;
    }

    @Override
    public double celciusToFahrenheit(double celcius) {
        return (celcius * 9/5) + ConversionConstant.CELCIUS_FAHRENHEIT_CONSTANT;
    }

    @Override
    public double fahrenheitToCelcius(double fahrenheit) {
        return  0.555555556 * (fahrenheit - ConversionConstant.CELCIUS_FAHRENHEIT_CONSTANT);
    }

    @Override
    public double psiToBar(double psi) {
        return psi * ConversionConstant.PSI_BAR_CONSTANT;
    }

    @Override
    public double barToPsi(double bar) {
        return bar * ConversionConstant.BAR_PSI_CONSTANT;
    }

    @Override
    public double KilogramsToPounds(double kilograms) {
        return kilograms * ConversionConstant.KILO_POUNDS_CONSTANT;
    }

    @Override
    public double poundsToKilograms(double pounds) {
        return pounds * ConversionConstant.POUNDS_KILO_CONSTANT;
    }

    @Override
    public double litersToGallons(double liters) {
        return liters * ConversionConstant.LITERS_GALLONS_CONSTANT;
    }

    @Override
    public double gallonsToLiters(double gallons) {
        return gallons * ConversionConstant.GALLONS_LITERS_CONSTANT;
    }
}
