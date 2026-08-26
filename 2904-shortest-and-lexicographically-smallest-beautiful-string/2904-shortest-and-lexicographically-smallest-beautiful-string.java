class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
       String ans = "";

        // Choose starting index
        for (int i = 0; i < s.length(); i++) {

            // Number of 1s in current substring
            int ones = 0;

            // Choose ending index
            for (int j = i; j < s.length(); j++) {

                // Add current character to our count
                if (s.charAt(j) == '1') {
                    ones++;
                }

                // More than k ones -> impossible to become beautiful
                if (ones > k) {
                    break;
                }

                // Exactly k ones -> beautiful substring
                if (ones == k) {

                    // Get the actual substring
                    String current = s.substring(i, j + 1);

                    // First beautiful substring
                    if (ans.equals("")) {
                        ans = current;
                    }

                    // Current substring is shorter
                    else if (current.length() < ans.length()) {
                        ans = current;
                    }

                    // Same length -> choose lexicographically smaller
                    else if (current.length() == ans.length()
                            && current.compareTo(ans) < 0) {
                        ans = current;
                    }
                }
            }
        }

        return ans; 
    }
}