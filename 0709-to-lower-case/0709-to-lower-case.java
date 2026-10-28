class Solution {
    public String toLowerCase(String s) {

        // Approach 1: Built-in Method (Easy Way)
        // return s.toLowerCase();

        //  Approach 2: Manual ASCII Conversion
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (65 <= ch && ch <= 90) {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        
        return result;
        
    }
}