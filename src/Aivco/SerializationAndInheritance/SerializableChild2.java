/*
 * To change this template, choose Tools | Templates
 * 
 */
package Aivco.SerializationAndInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *this class extends a parent that is not serializable,the goal is to show the effects of a non 
 * serializable parent on a child or subclass
 * 
 */
public class SerializableChild2 extends NoneSerializableParent1 implements Serializable{
public SerializableChild2(int leg){
 this.legs=leg;
}
    
public static void main(String []args ){
   
 SerializableChild2 sc=new SerializableChild2(10);
 sc.setLeg(5);
     try{
    FileOutputStream fos=new FileOutputStream("newfile.txt");
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(sc);
         oos.flush();
         oos.close();
    FileInputStream fis=new FileInputStream("newfile.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
 SerializableChild2 sc2= (SerializableChild2)  ois.readObject();
 System.out.println(sc2.getLeg());
    
     
     }catch(Exception e){}


}
    
 
    

    
}
