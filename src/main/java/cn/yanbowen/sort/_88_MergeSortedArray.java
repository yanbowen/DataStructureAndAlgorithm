package cn.yanbowen.sort;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 11/21/2019
 * TIME : 18:10
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.paixu
 *
 * @author boweny.yan
 *
 * <p>
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 */
public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; j < n; j++) {
            nums1[i + j] = nums2[j];
        }
        // 冒泡
        for (int i = 0; i < m + n; i++) {
            boolean flag = true;
            for (int j = 0; j < m + n - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j + 1];
                    nums1[j + 1] = nums1[j];
                    nums1[j] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
        }

        // 插入
        for (int i = 1; i < m + n; i++) {
            int value = nums1[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums1[j] > value) {
                    nums1[j + 1] = nums1[j];
                } else {
                    break;
                }
            }
            nums1[j + 1] = value;
        }

        // 快排
    }

    /**
     * 快排
     *
     * @param a 待排序数组
     * @param low 开始下标
     * @param high 结束下标
     */
    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];

        while (end > start) {
            // 从后往前比较
            while (end > start && a[end] >= key) // 如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            // 从前往后比较
            while (end > start && a[start] <= key)// 如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            // 此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        // 递归
        if (start > low)
            sort(a, low, start - 1);// 左边序列。第一个索引位置到关键值索引-1
        if (end < high)
            sort(a, end + 1, high);// 右边序列。从关键值索引+1到最后一个
    }
}
