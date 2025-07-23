package com.arrays;

import java.util.*;
/**
 *
 * @author User
 */
public class Array3
{

    /**3
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int key ;
        key = sc.nextInt();
        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("FOund");
                System.exit(0);
            }

        }
        System.out.println("Not found");

    }

}
