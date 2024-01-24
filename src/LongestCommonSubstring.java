// Question #2
public class LongestCommonSubstring {

    public static String longestCommonSubstring(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] commonSubstrLength = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    commonSubstrLength[i][j] = commonSubstrLength[i - 1][j - 1] + 1;

                    if (commonSubstrLength[i][j] > maxLength) {
                        maxLength = commonSubstrLength[i][j];
                        endIndex = i - 1;
                    }
                } else {
                    commonSubstrLength[i][j] = 0;
                }
            }
        }

        if (maxLength == 0) {
            return "";
        } else {
            return text1.substring(endIndex - maxLength + 1, endIndex + 1);
        }
    }

    public static void main(String[] args) {
        String text1 = "spy family";
        String text2 = "jujutsu kaisen";

        String result = longestCommonSubstring(text1, text2);
        System.out.println("1st Longest Common Substring: " + result);

        text1 = "hello world";
        text2 = "jelly bean";
        String result2 = longestCommonSubstring(text1, text2);
        System.out.println("2nd Longest Common Substring: " + result2);

        text1 = "calvin";
        text2 = "alvin";
        String result3 = longestCommonSubstring(text1, text2);
        System.out.println("3rd Longest Common Substring: " + result3);

    }
}
//Time complexity O(n^2) because it has 2 input strings