package leetcode.algorithms.medium;

// 3751. Total Waviness of Numbers in Range I
public class TotalWavinessOfNumbersInRangeI {

    public int totalWaviness(int num1, int num2) {
        int res = 0;
        for (int i = num1; i <= num2; i++) {
            res += getWaviness(i);
        }
        return res;
    }

    private int getWaviness(int x) {
        String s = String.valueOf(x);
        int waviness = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            boolean isPekay = s.charAt(i) > s.charAt(i - 1) && s.charAt(i) > s.charAt(i + 1);
            boolean isValley = s.charAt(i) < s.charAt(i - 1) && s.charAt(i) < s.charAt(i + 1);

            if (isPekay || isValley)
                waviness++;
        }
        return waviness;
    }
}
