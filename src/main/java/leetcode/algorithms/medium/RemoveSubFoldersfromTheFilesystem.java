package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1233. Remove Sub-Folders from the Filesystem
public class RemoveSubFoldersfromTheFilesystem {

    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        for (String f : folder) {
            result.add(f);
            for (int i = 0; i < f.length(); i++) {
                if (f.charAt(i) == '/' && result.contains(f.substring(0, i))) {
                    result.remove(result.size() - 1);
                    break;
                }
            }
        }
        return result;
    }
}
