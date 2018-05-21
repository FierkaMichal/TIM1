package com.fierka.tal1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Michał on 2018-05-21.
 */

@Service
public class AverageService {

//    public double calculateAverage(String numbers) {
//        //return (IntStream.of(numbers).sum()) / numbers.length;
//        String[] split = numbers.split(",");
//        int sum = 0;
//        for(String n : split) {
//            sum += Integer.valueOf(n);
//        }
//        return sum/split.length;
//    }

    public List<Integer> getNumbers(int count) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i < count; ++i) {
            list.add(r.nextInt(50));
        }
        return list;
    }
}
