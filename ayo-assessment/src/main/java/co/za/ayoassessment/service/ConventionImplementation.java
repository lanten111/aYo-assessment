package co.za.ayoassessment.service;

import co.za.ayoassessment.constant.ConversionConstant;
import org.springframework.stereotype.Service;

@Service
public class ConventionImplementation implements ConventionInterface {

    @Override
    public double mitersToFeet(double miters) {
        //convert miters to feet
        return miters * ConversionConstant.FEET_MITER_CONSTANT;
    }

    @Override
    public double feetToMiters(double feet) {
        //convert feet to miters
        return feet / ConversionConstant.FEET_MITER_CONSTANT;
    }

    @Override
    public double celciusToFahrenheit(double celcius) {
        //convert celcius to fahrenheit
        return (celcius * 9/5) + ConversionConstant.CELCIUS_FAHRENHEIT_CONSTANT;
    }

    @Override
    public double fahrenheitToCelcius(double fahrenheit) {
        //convert fahrenheit to celcius
        return  0.555555556 * (fahrenheit - ConversionConstant.CELCIUS_FAHRENHEIT_CONSTANT);
    }

    @Override
    public double psiToBar(double psi) {
        //convert psi to bas
        return psi * ConversionConstant.PSI_BAR_CONSTANT;
    }

    @Override
    public double barToPsi(double bar) {
        //convert bar to psi
        return bar * ConversionConstant.BAR_PSI_CONSTANT;
    }

    @Override
    public double KilogramsToPounds(double kilograms) {
        //convert kilogram to pounds
        return kilograms * ConversionConstant.KILO_POUNDS_CONSTANT;
    }

    @Override
    public double poundsToKilograms(double pounds) {
        //convert pounds to kilogram
        return pounds * ConversionConstant.POUNDS_KILO_CONSTANT;
    }

    @Override
    public double litersToGallons(double liters) {
        //convert liters to gallons
        return liters * ConversionConstant.LITERS_GALLONS_CONSTANT;
    }

    @Override
    public double gallonsToLiters(double gallons) {
        //convert gallons to liters
        return gallons * ConversionConstant.GALLONS_LITERS_CONSTANT;
    }
}
