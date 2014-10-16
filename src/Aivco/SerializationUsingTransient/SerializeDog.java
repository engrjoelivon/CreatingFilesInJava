/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco.SerializationUsingTransient;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author mac
 */
public class SerializeDog {
   
public static void main(String [] args){

    try{
        
        Dog2 dg=new Dog2(new Bone1(3), 5);
        FileOutputStream fis= new FileOutputStream("first");
        ObjectOutputStream os= new ObjectOutputStream(fis);
        os.writeObject(dg);
        os.close();
    System.out.println(dg.getDogStrenght());
    
    }
    catch(Exception e){e.printStackTrace();}


}
    
}
