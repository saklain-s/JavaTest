package com.arrays;

import java.util.*;
/**
 *
 * @author User
 */
public class Array4
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max1,max2 ;
        max1=max2=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }

        }
        System.out.println("Maximum element is "+max1);
        System.out.println("Second Maximum element is "+max2);
    }

}
