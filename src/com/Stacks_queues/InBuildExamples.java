package com.Stacks_queues;

import java.util.Stack;

public class InBuildExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(12);
        stack.push(9);
        stack.push(18);
        stack.push(14);

        //LIFO



        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.pop());



    }

}
