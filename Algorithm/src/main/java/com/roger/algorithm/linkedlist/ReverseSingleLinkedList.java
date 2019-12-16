package com.roger.algorithm.linkedlist;

/**
 * 单链表反转
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

        logLinkedList();
    }


    public static void reverse1() {
        Node tempNode = new Node();
//        while (linkedList.getNext() != null)
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

    public static void logLinkedList() {
        Node pointer = linkedList;

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
