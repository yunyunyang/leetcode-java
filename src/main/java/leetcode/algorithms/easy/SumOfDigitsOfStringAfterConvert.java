package leetcode.algorithms.easy;

import javax.sound.midi.SysexMessage;

// 1945. Sum of Digits of String After Convert
public class SumOfDigitsOfStringAfterConvert {

    public static int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            num.append(c - 'a' + 1);
        }

        while (k > 0) {
            int tmp = 0;
            for (char i : num.toString().toCharArray()) {
                tmp += i - '0';
            }
            num = new StringBuilder(String.valueOf(tmp));
            k --;
        }
        return Integer.parseInt(num.toString());
    }
}
