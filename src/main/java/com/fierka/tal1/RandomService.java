package com.fierka.tal1;

import org.springframework.stereotype.Service;

/**
 * Created by Michał on 2018-05-21.
 */

@Service
public class RandomService {

    public double calculateAverage(String numbers) {
        //return (IntStream.of(numbers).sum()) / numbers.length;
        String[] split = numbers.split(",");
        int sum = 0;
        for(String n : split) {
            sum += Integer.valueOf(n);
        }
        return sum/split.length;
    }
}
