package com.Stacks_queues;

public class customstack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    int ptr = -1;
    public customstack(){
        this(DEFAULT_SIZE);
    }

    public customstack(int size) {
        this.data = new int[size];
    }
    public int pop() throws stackException  {
        if(isEmpty()){
            throw new stackException("Cannot pop from any empty stack");
        }
//        int removed  = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }
    public int peek() throws stackException{
        if(isEmpty()){
            throw new stackException("Cannot peek from any empty stack");
        }
        return data[ptr];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("customstack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}
