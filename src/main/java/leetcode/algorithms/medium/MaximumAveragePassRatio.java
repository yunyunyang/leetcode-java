package leetcode.algorithms.medium;

import java.util.PriorityQueue;

// 1792. Maximum Average Pass Ratio
public class MaximumAveragePassRatio {

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int[] singleClass : classes) {
            int passes = singleClass[0];
            int total = singleClass[1];
            double ratio = calculateRatio(passes, total);
            maxHeap.offer(new double[]{ratio, passes, total});
        }

        while (extraStudents-- > 0) {
            double[] current = maxHeap.poll();
            double ratio = current[0];
            int passes = (int) current[1];
            int total = (int) current[2];
            maxHeap.offer(new double[]{
                    calculateRatio(passes + 1, total + 1),
                    passes + 1,
                    total + 1
            });
        }

        double totalRatio = 0;
        while (!maxHeap.isEmpty()) {
            double[] current = maxHeap.poll();
            int passes = (int) current[1];
            int total = (int) current[2];
            totalRatio += (double) passes / (double) total;
        }

        return totalRatio / classes.length;
    }

    private double calculateRatio(int passes, int total) {
        return (double) (passes + 1) / (total + 1) - (double) passes / total;
    }
}
