package cn.yanbowen.linklist.queue.stack;

import cn.yanbowen.common.ListNode;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 11/12/2019
 * TIME : 21:31
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.lianbiao
 *
 * @author boweny.yan
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class _19_RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        ListNode frist = listNode;
        ListNode second = listNode;
        for (int i = 0; i < n + 1; i++) {
            second = second.next;
        }
        while (second != null) {
            frist = frist.next;
            second = second.next;
        }
        frist.next = frist.next.next;
        return listNode.next;
    }
}
