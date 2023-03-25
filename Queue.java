package com.stackimplementation;

import com.LinkedListImplementation.Node;

public class Queue<T> {
    Node<T> head;
    Node<T> tail;


    public void append(T data) {
        Node<T> newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void show(){
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();

    }

    //UC4
    public T popBegin() {
        Node<T> temp = head;
        if (head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }


        public boolean isEmpty() {
            return head == null;
        }

}
