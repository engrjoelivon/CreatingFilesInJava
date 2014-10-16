/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco.SerializationAndInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author mac
 */
public class ArraySerializationMain {
public static void main(String[] args){
 ArraySerialization [] b={new ArraySerialization2(5,6),new ArraySerialization3(7,8,9)};
 
 try{
    FileOutputStream fos=new FileOutputStream("array.txt");
     ObjectOutputStream oos=new ObjectOutputStream(fos);
    
     oos.writeObject(new ArraySerialization2(3,4));
     oos.writeObject(new ArraySerialization3(3,4,4));
     oos.flush();
     oos.close();
     
     FileInputStream fis=new FileInputStream("array.txt");
     ObjectInputStream ois=new ObjectInputStream(fis);
     ArraySerialization2 c;
     c=(ArraySerialization2)ois.readObject();
     ArraySerialization3 d;
     d=(ArraySerialization3)ois.readObject();
     System.out.println(c);
     System.out.println(d);

 
 }
 catch(Exception e){}
    
 
 


}
    
}
