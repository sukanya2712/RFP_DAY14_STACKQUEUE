package com.stackimplementation;

//import com.LinkedListImplementation.LinkedList;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Number> Queue1 = new Queue<>();
//        LinkedList<Number> Queue =new LinkedList<>();

        //UC3
        Queue1.append(56);
        Queue1.append(30);
        Queue1.append(70);
        Queue1.show();

        //UC4 => DEQUEUE FROM BEGINING
        while (!Queue1.isEmpty()){
            Queue1.popBegin();
            Queue1.show();

            System.out.println("Do you want to continue? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("N")){
                break;
            }
        }

    }
}
