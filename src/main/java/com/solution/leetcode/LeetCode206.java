package com.solution.leetcode;

public class LeetCode206 {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node reverseList(Node head) {
        Node prevHead = null;
        while(head != null){
            Node recordNext = head.next;
            head.next = prevHead;
            prevHead = head;
            head = recordNext;
        }
        return prevHead;
    }

    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        LeetCode206 list = new LeetCode206();
        Node node = new Node(85);
        node.next = new Node(15);
        node.next.next = new Node(4);
        node.next.next.next = new Node(20);

//        System.out.println("Given Linked list");
//        list.printList(node);
        Node reverse = list.reverse(node);
//        System.out.println("Reversed linked list ");
//        list.printList(reverse);
        Node reverse2 = list.reverseList(node);
        System.out.println(reverse2.data);
        list.printList(reverse2);
    }
}



