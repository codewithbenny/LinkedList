package LinkedList;

import Implementation.MySinglyLinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        MySinglyLinkedList linkedList=new MySinglyLinkedList();
        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.traverse();
    //    linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.traverse();

    }
}
