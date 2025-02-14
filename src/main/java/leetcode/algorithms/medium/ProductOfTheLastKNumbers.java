package leetcode.algorithms.medium;

import java.util.ArrayList;

// 1352. Product of the Last K Numbers
public class ProductOfTheLastKNumbers {

    private ArrayList<Integer> prefix = new ArrayList<>();
    private int size = 0;

    public ProductOfTheLastKNumbers() {
        prefix.add(1);
        size = 0;
    }

    public void add(int num) {
        if (num == 0) {
            prefix = new ArrayList<>();
            prefix.add(1);
            size = 0;
        } else {
            prefix.add(prefix.get(size) * num);
            size++;
        }
    }

    public int getProduct(int k) {
        if (k > size) return 0;
        return (
                prefix.get(size) / prefix.get(size - k)
        );
    }
}
