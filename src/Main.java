//#5
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // tracks index of the elements that arent equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3, 4, 5, 6};
        int val = 3;

        int result = new Solution().removeElement(nums, val);

        System.out.println("Number of elements not equal to " + val + ": " + result);
    }
}



//O(n) iterations are proportional to length of array