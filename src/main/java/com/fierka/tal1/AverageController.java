package com.fierka.tal1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Michał on 2018-05-21.
 */

@RestController
@CrossOrigin("http://localhost:4200")
public class AverageController {

    @Autowired
    private RandomService randomService;

    @RequestMapping(path = "getAverage", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Double> calculateAverage(@RequestParam("numbers") String numbers) {

        double v = randomService.calculateAverage(numbers);

        return new ResponseEntity<>(v, HttpStatus.OK);
    }
}
