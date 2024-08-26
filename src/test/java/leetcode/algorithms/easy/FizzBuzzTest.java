package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {

    @Test
    public void example1() {
        int n = 3;
        List<String> output = Arrays.asList("1","2","Fizz");
        Assert.assertEquals(FizzBuzz.fizzBuzz(n), output);
    }

    @Test
    public void example2() {
        int n = 5;
        List<String> output = Arrays.asList("1","2","Fizz","4","Buzz");
        Assert.assertEquals(FizzBuzz.fizzBuzz(n), output);
    }

    @Test
    public void example3() {
        int n = 15;
        List<String> output = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        Assert.assertEquals(FizzBuzz.fizzBuzz(n), output);
    }
}
