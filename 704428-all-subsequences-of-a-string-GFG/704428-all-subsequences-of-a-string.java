import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<String> powerSet(String s) {
        List<String> result = new ArrayList<>();
        generateSubsequences(s, 0, "", result);
        Collections.sort(result);
        return result;
    }
    void generateSubsequences(String s, int index, String current, List<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }
        generateSubsequences(s, index + 1, current, result);
        generateSubsequences(s, index + 1, current + s.charAt(index), result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna