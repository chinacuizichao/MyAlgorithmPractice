package com.roger.algorithm.linkedlist;

/**
 * 合并两个有序列表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/he-bing-liang-ge-you-xu-lian-biao-by-leetcode/
 */
public class MergeTwoLinkedList {

    public static void main(String[] args) {

        Node list1 = null;
        for (int i = 0; i < 10; i++) {
            if (list1 == null) {
                list1 = new Node();
                list1.setData(i);
                list1.setNext(null);
            } else {
                Node pointer = list1;
                while (pointer.getNext() != null) {
                    pointer = pointer.getNext();
                }
                Node newNode = new Node();
                newNode.setData(i);
                pointer.setNext(newNode);
            }
        }

        Node list2 = null;
        for (int i = 10; i < 20; i++) {
            if (list2 == null) {
                list2 = new Node();
                list2.setData(i);
            } else {
                Node pointer = list2;
                while (pointer.getNext() != null) {
                    pointer = pointer.getNext();
                }
                Node newNode = new Node();
                newNode.setData(i);
                pointer.setNext(newNode);
            }
        }

        ReverseSingleLinkedList.logLinkedList(merge2Sequencelist(list1, list2));
    }


    /**
     * 尾节点递归
     */
    public static Node mergeTwoSequenceList(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.getData() < list2.getData()) {
            list1.setNext(mergeTwoSequenceList(list1.getNext(), list2));
            return list1;
        } else {
            list2.setNext(mergeTwoSequenceList(list1, list2.getNext()));
            return list2;
        }
    }

    /**
     * 不能直接操作对象，要用指针
     */
    public static Node merge2Sequencelist(Node list1, Node list2) {
        Node head = new Node();

        Node pointer = head;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                pointer.setNext(list2);
                list2 = list2.getNext();
            } else if (list2 == null) {
                pointer.setNext(list1);
                list1 = list1.getNext();
            } else if (list1.getData() < list2.getData()) {
                pointer.setNext(list1);
                list1 = list1.getNext();
            } else {
                pointer.setNext(list2);
                list2 = list2.getNext();
            }

            pointer = pointer.getNext();
        }

        return head.getNext();
    }

}
