package com.roger.algorithm.linkedlist;

/**
 * 单链表反转 leetcode 206
 * https://leetcode-cn.com/problems/reverse-linked-list/comments/
 */
public class ReverseSingleLinkedList {

    public static Node linkedList;
    public static int size = 0;

    public static void main(String[] args) {
        // 添加数据
        for (int i = 1; i < 10; i++) {
            add(i);
            size++;
        }

        Node node = reverseList(linkedList);

        logLinkedList(node);
    }


    /**
     * 尾递归
     */
    public static Node reverseRecursion(Node head) {

        if (head == null || head.getNext() == null) {
            return head;
        }
        // 利用栈的缓存
        Node temp = head.getNext();
        // 返回头节点
        Node newHead = reverseRecursion(head.getNext());
        // 倒序链接
        temp.setNext(head);
        // 将原指针断掉
        head.setNext(null);

        return newHead;

    }

    /**
     * 迭代法
     */
    public static Node reverseList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;
    }

    // 不带哨兵
    public static void add(int data) {
        // head node
        if (linkedList == null) {
            linkedList = new Node();
            linkedList.setData(data);
            linkedList.setNext(null);
            return;
        }


        Node pointer = linkedList;

        while (pointer.getNext() != null) {
            // 移动指针
            pointer = pointer.getNext();
        }

        Node newNode = new Node();
        newNode.setData(data);
        pointer.setNext(newNode);
    }

    public static void logLinkedList(Node node) {
        Node pointer = node;

        if (pointer == null) {
            System.out.println(" null ");
        }

        while (pointer.getNext() != null) {
            System.out.print(pointer.getData() + ", ");
            pointer = pointer.getNext();
        }

        // end
        System.out.print(pointer.getData() + ". ");
    }


}
