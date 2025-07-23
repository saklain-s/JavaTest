package com.Genrics;
/**
 *
 * @author User
 */
public class Generics<T> {

    
    T data[] = (T[]) new Object[3];  // Unchecked cast warning, but necessary
    public static void main(String[] args) throws Exception {
        
        // TODO code application logic here
        Generics<String> g = new Generics<>();  // Use diamond operator
        g.data[0] = "Hi";
        g.data[1] = "Bye";
        String str = g.data[0];
    }
}
