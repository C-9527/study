package Test;

import java.util.Arrays;

/**
 * @author : Shadow
 * @className : Solution3
 * @description :TODO
 * @date : 2021/02/03 16:07
 **/
public class Solution3 {

    private int[] memo;

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        memo = new int[len];
        memo[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                memo[i] = Math.max(memo[i], nums[i] + j + 2 < len ? memo[j + 2] : 0);
            }
        }
        return memo[0];
    }

    private int dfs(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        if (memo[index] != 0) {
            return memo[index];
        }
        int res = 0;
        for (int i = index; i < nums.length; i++) {
            res = Math.max(res, nums[i] + dfs(nums, i + 2));
        }
        memo[index] = res;
        return res;

    }

    public static void main(String[] args) {
        final int rob = new Solution3().rob(new int[]{2, 7, 9, 3, 1});
        System.out.println(rob);
    }
}
