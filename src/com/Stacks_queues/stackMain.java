package com.Stacks_queues;

public class stackMain {
    public static void main(String[] args) throws stackException {
        //customstack stack = new customstack(5);
        DynamicStack stack = new DynamicStack();
        stack.push(34);
        stack.push(14);
        stack.push(54);
        stack.push(34);
        stack.push(12);
        stack.push(54);
        stack.push(34);
        stack.push(12);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
