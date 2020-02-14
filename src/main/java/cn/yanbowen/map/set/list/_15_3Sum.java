package cn.yanbowen.map.set.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 02/14/2020
 * TIME : 14:03
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.map.set.list
 *
 * @author boweny.yan
 * <p>
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class _15_3Sum {

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            int len = nums.length;
            if (nums == null || len < 3) {
                return result;
            }
            Arrays.sort(nums);
            for (int i = 0; i < len - 1; i++) {
                if (nums[i] > 0) {
                    break;
                }
                if (i >= 1 && nums[i] == nums[i - 1])
                    continue;
                int left = i + 1;
                int right = len - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum > 0)
                        right--;
                    else
                        left++;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new Solution().threeSum(new int[]{0, 0, 0, 0});
        System.out.println(lists);
    }
}
