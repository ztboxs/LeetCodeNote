package top.ztboxs.base;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2024/04/09/12:11
 * @Description: 238. 除自身以外数组的乘积
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if (len == 0) return new int[0];
        int[] numbar = new int[len];
        numbar[0] = 1;
        int tem = 1;
        for (int i = 1; i < len; i++) {
            numbar[i] = numbar[i - 1] * nums[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            tem *=nums[i+1];
            numbar[i] *= tem;
        }
        return numbar;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // 给定的数组
        Solution solution = new Solution();
        int[] result = solution.productExceptSelf(nums);
        // 打印结果
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

