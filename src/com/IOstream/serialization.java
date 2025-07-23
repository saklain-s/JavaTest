package com.IOstream;
import java.io.*;

class Student implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Student() {}

    public Student(int r, String n, float a, String d) {
        rollno = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll " + rollno +
                "\nName " + name +
                "\nAverage " + avg +
                "\nDept " + dept +
                "\nData " + Data +
                "\nTransient " + t + "\n";
    }
}

public class serialization {
    public static void main(String[] args) throws Exception {
        // Serialization
        FileOutputStream fos = new FileOutputStream("serialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(10, "John", 89.9f, "CSE");
        oos.writeObject(s);

        oos.close();
        fos.close();

        // Deserialization
        FileInputStream fis = new FileInputStream("serialization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student deserializedStudent = (Student) ois.readObject();
        System.out.println(deserializedStudent);

        ois.close();
        fis.close();
    }
}
