package com.stackimplementation;

//import com.LinkedListImplementation.LinkedList;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Number> Queue1 = new Queue<>();
//        LinkedList<Number> Queue =new LinkedList<>();

        Queue1.append(56);
        Queue1.append(30);
        Queue1.append(70);

        Queue1.show();
    }
}
