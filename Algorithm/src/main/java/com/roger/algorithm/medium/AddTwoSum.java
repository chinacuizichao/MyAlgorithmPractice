package com.roger.algorithm.medium;

/**
 * 1. 链表角标后移
 * 2. 需要链表某一个角标可以用临时对象来记录
 * 3. % 如果比10小不会有影响
 * 4. 处理循环运算的时候需要考虑最后一次的特殊情况
 */
public class AddTwoSum {

    public static void main(String[] args) {


    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode temp = sentinel;

        int sum = 0;

        while (node1 != null && node2 != null) {
            // 每次计算进位
            sum /= 10;

            if (node1 != null) {
                sum += node1.val;
                node1 = node1.next;
            }

            if (node2 != null) {
                sum += node2.val;
                node2 = node2.next;
            }

            sentinel.next = new ListNode(sum % 10);
            sentinel = sentinel.next;
        }

        // 最后一次没有进位计算，所以在循环外进行
        if (sum / 10 == 1)
            sentinel.next = new ListNode(sum % 10);

        return temp.next;
    }
}
