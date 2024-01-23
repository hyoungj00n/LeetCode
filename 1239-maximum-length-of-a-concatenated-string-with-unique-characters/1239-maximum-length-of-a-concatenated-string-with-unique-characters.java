import java.util.List;

class Solution {
    public int maxLength(List<String> arr) {
        return dfs(arr, 0, "");
    }

    private int dfs(List<String> arr, int index, String current) {
        if (!isUnique(current)) {
            return 0;
        }

        int maxLength = current.length();

        for (int i = index; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, dfs(arr, i + 1, current + arr.get(i)));
        }

        return maxLength;
    }

    private boolean isUnique(String s) {
        boolean[] seen = new boolean[26]; 
        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) {
                return false; 
            }
            seen[c - 'a'] = true;
        }
        return true;
    }
}