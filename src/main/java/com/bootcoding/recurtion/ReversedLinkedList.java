package com.bootcoding.recurtion;

public class ReversedLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(6);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;


        Node reverse = reverse(head);

        Node temp = reverse;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link

            // Move pointers one position ahead
            prev = current;
            current = next;
        }
        return prev;
    }
}
