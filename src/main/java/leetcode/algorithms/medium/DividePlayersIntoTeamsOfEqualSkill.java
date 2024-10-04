package leetcode.algorithms.medium;

import java.util.Arrays;

// 2491. Divide Players Into Teams of Equal Skill
public class DividePlayersIntoTeamsOfEqualSkill {

    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int left = 0;
        int right = skill.length - 1;
        long product = 0;
        int chemistry = skill[left] + skill[right];
        while (left < right) {
            if (skill[left] + skill[right] == chemistry) {
                product += ((long) skill[left] * skill[right]);
                left ++;
                right --;
            } else {
                return -1;
            }
        }
        return product;
    }
}
