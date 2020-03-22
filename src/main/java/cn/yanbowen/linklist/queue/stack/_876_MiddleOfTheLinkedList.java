package cn.yanbowen.linklist.queue.stack;

import cn.yanbowen.common.ListNode;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 03/23/2020
 * TIME : 00:53
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.linklist.queue.stack
 *
 * @author boweny.yan
 * <p>
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * <p>
 * 如果有两个中间结点，则返回第二个中间结点。
 * <p>
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 */
public class _876_MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int num = 0;
        int i = 0;
        ListNode flag = head;
        while (flag != null) {
            num++;
            flag = flag.next;
        }
        flag = head;
        while(i<num/2){
            flag = flag.next;
            i++;
        }
        return flag;
    }

    public ListNode middleNode2(ListNode head) {
        /**
         * 用两个指针 slow 与 fast 一起遍历链表。slow 一次走一步，fast 一次走两步。那么当 fast 到达链表的末尾时，slow 必然位于中间。
         */
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
