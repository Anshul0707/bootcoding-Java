package com.bootcoding.recurtion;

public class TraversedLinkedListUsingReursion {
    public void travers(Node head ){
        Node temp = head;
        if(temp==null){
            return;
        }
        System.out.println(temp.data);
        //  head =head.next;
        travers(temp.next);
    }
    public Node addData(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(6);
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=null;
        return  head;
    }

}

