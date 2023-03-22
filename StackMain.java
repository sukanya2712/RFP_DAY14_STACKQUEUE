package com.stackimplementation;

public class StackMain {
    public static void main(String[] args) {
        //UC1
        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println("----------CREATED STACK---------- ");
        stack.show();

        //uc2
        System.out.println("");
        System.out.println("----------PEEK ELEMENT-----------");
        stack.peek();
        System.out.println("");

        System.out.println("---------POPPING ELEMENT TILL STACK IS EMPTY-------");
        Integer poppedData;
        do {
            poppedData = stack.pop();
            if (poppedData == null)
                System.out.println("Stack is Empty");
            else
                System.out.println("The element popped is => " + poppedData);
            stack.show();
        } while( poppedData != null);


    }
}
