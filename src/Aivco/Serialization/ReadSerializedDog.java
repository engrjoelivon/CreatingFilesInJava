/*
 * This class is to read the serialized object file that has been created by the previous serialeddog.j
 * java file.
 * We were able to prove in both class the serialazable abilities of java,that when one class
 * extends the serialable interface and an object of that class is passed into the 
 * objectinputstream for serialization,it will be irrelevance even if the class has as one of its instance variable,another 
 * class.Because the serialable interface will attach along itself every class found with the object
 * as long as every object class extends the marker interface serialzable.Just like the Dog class 
 * and the bone class.
 * 
 */
package Aivco.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

/**
 *
 * @author mac
 */
public class ReadSerializedDog {
 private static  Bone b=new Bone(15);//remember instance 
 //variable has to be declared as private.encapasulation
 
 
public static void main(String [] args){
    
 //remember whenever we are creating a file, reading or writing to a file it has to be caught or declared  
    try{
        FileOutputStream fos=new FileOutputStream("write");
        ObjectOutputStream ois=new ObjectOutputStream(fos);
        
        Dog d=new Dog(b, 30);
        /*As we pass object be into the write object method its automatically saves all the datas attached
        to be this is possible because both dog and bone class implemented the serializable interface.*/
        ois.writeObject(d);
        ois.flush();
        ois.close();
        
    
    }
    catch(Exception e){}
//remember whenever we are creating reading or writing to a file it has to be caught or declared
    try{
    FileInputStream fis=new FileInputStream("write");
        ObjectInputStream ios=new ObjectInputStream(fis);
    Dog a= (Dog)   ios.readObject();//we had to cast this to dod because it return an object.
    System.out.println("read for the input"+"\n"+a.getDogStrenght());}
    catch(Exception e){}
    
   
    
    

}
    
}
