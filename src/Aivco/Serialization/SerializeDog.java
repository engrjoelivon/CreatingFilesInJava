/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author mac
 */
public class SerializeDog {
   
public static void main(String [] args){

    try{
        
        Dog dg=new Dog(new Bone(3), 5);
        FileOutputStream fis= new FileOutputStream("first2");
        ObjectOutputStream os= new ObjectOutputStream(fis);
        os.writeObject(dg);
        os.flush();
        os.close();
    System.out.println(dg.getDogStrenght());
    
    }
    catch(Exception e){e.printStackTrace();}


}
    
}
