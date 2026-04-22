package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

// 2452. Words Within Two Edits of Dictionary
public class WordsWithinTwoEditsOfDictionary {

    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();
        for (String qry : queries) {
            boolean valid = false;

            for (String dic : dictionary) {
                int diff = 0;
                for (int i = 0; i < dic.length(); i++) {
                    if (qry.charAt(i) != dic.charAt(i))
                        diff++;

                    if (diff > 2)
                        break;
                }

                if (diff <= 2)
                    valid = true;
            }

            if (valid)
                res.add(qry);
        }
        return res;
    }
}
