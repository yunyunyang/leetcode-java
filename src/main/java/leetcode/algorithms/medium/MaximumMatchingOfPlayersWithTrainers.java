package leetcode.algorithms.medium;

import java.util.Arrays;

// 2410. Maximum Matching of Players With Trainers
public class MaximumMatchingOfPlayersWithTrainers {

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = players.length - 1;
        int j = trainers.length - 1;

        int match = 0;
        while (i >= 0 && j >= 0) {
            if (players[i] <= trainers[j]) {
                match ++;
                i--;
                j--;
            } else {
                i--;
            }
        }
        return match;
    }
}
