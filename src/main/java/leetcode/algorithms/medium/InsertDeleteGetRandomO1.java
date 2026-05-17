package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// 380. Insert Delete GetRandom O(1)
public class InsertDeleteGetRandomO1 {
    private List<Integer> nums;
    private Map<Integer, Integer> valToIndex;
    private Random rand;

    public InsertDeleteGetRandomO1() {
        nums = new ArrayList<>();
        valToIndex = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (valToIndex.containsKey((val)))
            return false;

        nums.add(val);
        valToIndex.put(val, nums.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val))
            return false;

        int index = valToIndex.get(val);
        int lastElement = nums.get(nums.size() - 1);

        nums.set(index, lastElement);
        valToIndex.put(lastElement, index);

        nums.remove(nums.size() - 1);
        valToIndex.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}
