class Solution {
    public boolean isIsomorphic(String s, String t) {

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (s.indexOf(ch1) != t.indexOf(ch2)) {
                return false;
            }
        }

        return true;
    }
}
