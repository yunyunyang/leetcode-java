package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

// 412. Fizz Buzz
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        for (int i = 1; i <= n; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else {
                output.add(String.valueOf(i));
            }
        }
        return output;
    }
}
