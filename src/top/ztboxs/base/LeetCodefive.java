package top.ztboxs.base;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2024/04/11/20:48
 * @Description: LeetCode 第五题: 最长回文子串
 */
public class LeetCodefive {

        public boolean isPalindrome(String s) {
            int len = s.length();
            for (int i = 0; i < len / 2; i++) {
                if (s.charAt(i) != s.charAt(len - i -1)) {
                    return false;
                }
            }
            return true;
        }

        public String longestPalindrome(String s) {
            String ans = "";
            int max = 0, len = s.length();
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j <= len; j++) {
                    String substring = s.substring(i, j);
                    if (isPalindrome(substring) && substring.length() > max) {
                        ans = s.substring(i, j);
                        max = Math.max(max, ans.length());
                    }
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        String s = "babad";
        LeetCodefive leetCodefive = new LeetCodefive();
        String push = leetCodefive.longestPalindrome(s);
        System.out.println(push);
    }
}
