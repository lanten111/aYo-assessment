package co.za.ayoassessment.controller;

import co.za.ayoassessment.constant.Symbol;
import co.za.ayoassessment.service.ConventionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convention")
public class ConversionController {
    //controller for convention between imperial and metric
    @Autowired
    ConventionInterface conventionInterface;

    @GetMapping("/miters-to-feet")
    public ResponseEntity<String> mitersToFeet(@RequestParam("miters") double miters){
       return ResponseEntity.ok(conventionInterface.mitersToFeet(miters) + Symbol.ft.name());
    }

    @GetMapping("/feet-to-miter")
    public ResponseEntity<String> FeetToMiters(@RequestParam("feet") double feet){
        return ResponseEntity.ok(conventionInterface.feetToMiters(feet) + Symbol.m.name());
    }

    @GetMapping("/celcius-to-fahrenheit")
    public ResponseEntity<String> celciusToFahrenheit(@RequestParam("celcius") double celcius){
        return ResponseEntity.ok(conventionInterface.celciusToFahrenheit(celcius) + Symbol.C.name());
    }

    @GetMapping("/fahrenheit-to-celcius")
    public ResponseEntity<String> fahrenheitToCelsius(@RequestParam double fahrenheit){
        return ResponseEntity.ok(conventionInterface.fahrenheitToCelcius(fahrenheit) + Symbol.F.name());
    }

    @GetMapping("/psi-to-bar")
    public ResponseEntity<String> psiToBar(@RequestParam double psi){
        return ResponseEntity.ok(conventionInterface.psiToBar(psi) + Symbol.psi.name());
    }

    @GetMapping("/bar-to-psi")
    public ResponseEntity<String> barToPsi(@RequestParam double bar){
        return ResponseEntity.ok(conventionInterface.barToPsi(bar) + Symbol.lbs.name());
    }

    @GetMapping("/kilogram-to-pounds")
    public ResponseEntity<String> KilogramsToPounds(@RequestParam double kilogram){
        return ResponseEntity.ok(conventionInterface.KilogramsToPounds(kilogram) + Symbol.lbs.name());
    }

    @GetMapping("/pounds-to-kilogram")
    public ResponseEntity<String> PoundsToKilograms(@RequestParam double pounds){
        return ResponseEntity.ok(conventionInterface.poundsToKilograms(pounds) + Symbol.kg.name());
    }

    @GetMapping("/gallons-to-liters")
    public ResponseEntity<String> gallonsToLiters(@RequestParam double gallons){
        return ResponseEntity.ok(conventionInterface.gallonsToLiters(gallons) + Symbol.L.name());
    }

    @GetMapping("/liters_to_gallons")
    public ResponseEntity<String> litersToGallons(@RequestParam double liters){
        return ResponseEntity.ok(conventionInterface.litersToGallons(liters) + Symbol.gal_US.name());
    }
}
