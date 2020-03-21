package cn.yanbowen.recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 03/15/2020
 * TIME : 23:37
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.recursion
 *
 * @author boweny.yan
 * <p>
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class _169_MajorityElement {

    class Solution {
        public int majorityElement(int[] nums) {
            // 哈希表
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.merge(num, 1, Integer::sum);
            }
            Map.Entry<Integer, Integer> result = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (result == null || entry.getValue() > result.getValue()) {
                    result = entry;
                }
            }
            return result.getKey();
        }

        public int majorityElement2(int[] nums) {
            // 排序
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    }
}
