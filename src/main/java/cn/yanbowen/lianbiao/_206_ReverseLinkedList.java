package cn.yanbowen.lianbiao;

import cn.yanbowen.common.ListNode;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 02/03/2020
 * TIME : 16:50
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.lianbiao
 *
 * @author boweny.yan
 * <p>
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class _206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode curTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curTemp;

        }
        return pre;
    }

}
