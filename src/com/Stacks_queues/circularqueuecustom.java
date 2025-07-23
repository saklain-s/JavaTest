package com.Stacks_queues;

public class circularqueuecustom {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;


    public circularqueuecustom (){
        this(DEFAULT_SIZE);
    }

    public circularqueuecustom (int size){
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length-1;
    }

    private boolean isEmpty() {
        return size == -1;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[0];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void  display(){
        int i = front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i %= data.length;;
        }while( i != end);
        System.out.println("END");
    }
}
