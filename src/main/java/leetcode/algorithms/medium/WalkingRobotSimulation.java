package leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;

// 874. Walking Robot Simulation
public class WalkingRobotSimulation {

    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for (int[] obstacle : obstacles) {
            set.add(obstacle[0] + "," + obstacle[1]);
        }

        int[][] actions = new int[][] {{0, 1}, {1, 0}, {0, -1},{-1, 0}};
        int direction = 0;

        int[] point = new int[] {0, 0};
        int maxDistance = 0;

        for (int cmd : commands) {
            if (cmd == -1) {
                direction = (direction == 3) ? 0 : direction + 1;
            } else if (cmd == -2) {
                direction = (direction == 0) ? 3 : direction - 1;
            } else {
                for (int i = 0; i < cmd; i++) {
                    String nextStep = (point[0] + actions[direction][0]) + "," + (point[1] + actions[direction][1]);
                    if (!set.contains(nextStep)) {
                        point[0] += actions[direction][0];
                        point[1] += actions[direction][1];
                    }
                }
            }
            maxDistance = Math.max(maxDistance, point[0] * point[0] + point[1] * point[1]);
        }
        return maxDistance;
    }
}
