package com.arrays;


public class Array7
{
    public static void main(String[] args)
    {
        int A[]={8,6,10,9,2};

        System.out.println("Length of A="+A.length);

        int B[]=new int[5];

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;

        System.out.println("Length of A="+A.length);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(B[i]+" ");
        }

    }
}