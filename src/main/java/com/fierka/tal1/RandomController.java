package com.fierka.tal1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Michał on 2018-05-21.
 */

@Controller
@CrossOrigin("http://localhost:4200")
public class RandomController {

    @Autowired
    private AverageService averageService;

    @RequestMapping(path = "getRandom", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Integer>> getNumbers(@RequestParam("numbersCount") int numbersCount ) {

        List<Integer> numbers = averageService.getNumbers(numbersCount);

        return new ResponseEntity<List<Integer>>(numbers, HttpStatus.OK);
    }
}
