package com.stackimplementation;


import com.LinkedListImplementation.LinkedList;
import com.LinkedListImplementation.Node;

public class Stack<T extends Comparable<T>> {
    //UC1
    LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.push(data);
    }

    public void show() {
        linkedList.show();
    }


    public T pop() {
        return linkedList.pop();
    }

    //uc2
    public void peek() {
        Integer peeked = (Integer) linkedList.pop();
        System.out.println("The peek element is " + peeked);
        linkedList.push((T) peeked);
    }



}