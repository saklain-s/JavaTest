package com.Genrics;
interface A{}
class B implements A{}
class C implements A{}
class MyArray<T>
{
    T A[] = (T[]) new Object[10];
    int length = 0;
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0; i<length; i++)
        {
            System.out.println(A[i]);
            
        }
    }
}
public class wildcard {
    static void fun(MyArray<?> obj)
    {
        obj.display();
    }

    public static void main(String[] args) {
        
        
        MyArray<String> ma2 = new MyArray<>();
        ma2.append("Nigga");
        ma2.append("ProNigga");
        
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        
        fun(ma);
        fun(ma2);
    }
}