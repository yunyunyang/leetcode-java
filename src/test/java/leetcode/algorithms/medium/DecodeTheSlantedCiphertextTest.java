package leetcode.algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

public class DecodeTheSlantedCiphertextTest {

    @Test
    public void test1() {
        String encodedText = "ch   ie   pr";
        int rows = 3;

        String output = "cipher";
        Assert.assertEquals(output, DecodeTheSlantedCiphertext.decodeCiphertext(encodedText, rows));
    }

    @Test
    public void test2() {
        String encodedText = "iveo    eed   l te   olc";
        int rows = 4;

        String output = "i love leetcode";
        Assert.assertEquals(output, DecodeTheSlantedCiphertext.decodeCiphertext(encodedText, rows));
    }

    @Test
    public void test3() {
        String encodedText = "coding";
        int rows = 1;

        String output = "coding";
        Assert.assertEquals(output, DecodeTheSlantedCiphertext.decodeCiphertext(encodedText, rows));
    }
}
