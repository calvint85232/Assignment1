//Question #1
public class LongestCommonSubsequence {

    public static int findLongestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();


        int[][] lcs = new int[len1 + 1][len2 + 1];

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]); //compares x,y to see which is bigger
                }
            }
        }

        return lcs[len1][len2];
    }

    public static void main(String[] args) {
        // Examples with the variable name changed to lcs
        String text1 = "abc", text2 = "abc";
        System.out.println(findLongestCommonSubsequence(text1, text2));  // output 3 'abc'

        text1 = "almanacs";
        text2 = "albatross";
        System.out.println(findLongestCommonSubsequence(text1, text2));  // output 4 'alas'

        text1 = "almanac";
        text2 = "ferris";
        System.out.println(findLongestCommonSubsequence(text1, text2));  // output 0

        text1 = "rainbow";
        text2 = "brine";
        System.out.println(findLongestCommonSubsequence(text1, text2)); //output 3 'rin'
    }
}
//O(n^2) time and space complexity, bc n is the length of the longer text1 or text2 using nested loop