package cn.yanbowen.lianbiao;

import cn.yanbowen.common.ListNode;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 11/21/2019
 * TIME : 19:31
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.lianbiao
 *
 * @author boweny.yan
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class _21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode head = list;
        while (true) {
            if (l1 == null) {
                list.next = l2;
                break;
            }
            if (l2 == null) {
                list.next = l1;
                break;
            }
            if (l1.val > l2.val) {
                list.next = l2;
                list = list.next;
                l2 = l2.next;
            } else {
                list.next = l1;
                list = list.next;
                l1 = l1.next;
            }
        }
        return head.next;
    }
}
