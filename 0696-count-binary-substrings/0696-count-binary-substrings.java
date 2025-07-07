class Solution {
    public int countBinarySubstrings(String s) {
        int pre = 0, cur = 0, ret = 0;
        for (int i = 0; i < s.length(); i++) {
            if (cur == 0) {
                cur++;
            } else {
                if (s.charAt(i - 1) != s.charAt(i)) {
                    if (pre != 0) {
                        ret += Math.min(pre, cur);
                    }
                    pre = cur;
                    cur = 1;
                } else {
                    cur++;
                }
            }
        }
        ret += Math.min(pre, cur);
        return ret;
    }
    }
