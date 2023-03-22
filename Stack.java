package com.stackimplementation;


import com.LinkedListImplementation.LinkedList;

public class Stack<T extends Comparable<T>> {
    //UC1
    LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.push(data);
    }

    public void show() {
        linkedList.show();
    }
}