package com.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Writer {
public static void main(String[] args) throws IOException, ClassNotFoundException {
    Employee employee = new Employee();
    employee.setEmpName("Jagdish");
    employee.setEmpAge((byte) 30);

    FileOutputStream fout = new 
FileOutputStream("./employee.obj");
    ObjectOutputStream oos = new ObjectOutputStream(fout);
    oos.writeObject(employee);
    oos.close();
    System.out.println("Process complete");
    
    employee = new Employee();
    FileInputStream fin = new 
    FileInputStream("./employee.obj");
    ObjectInputStream ois = new ObjectInputStream(fin);
    employee = (Employee) ois.readObject();
    ois.close();
    System.out.println(employee.whoIsThis());
}
}
