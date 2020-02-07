package cn.yanbowen.linklist.queue.stack;

import cn.yanbowen.common.ListNode;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 02/03/2020
 * TIME : 21:56
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.lianbiao
 *
 * @author boweny.yan
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class _24_SwapNodesInPairs {

    /**
     * 递归解法
     *
     * @param head 链表
     * @return 链表
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    /**
     * 迭代
     *
     * @param head 链表
     * @return 链表
     */
    public ListNode swapPairs_(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

}
