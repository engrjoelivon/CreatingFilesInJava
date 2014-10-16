
package Aivco.SerializationUsingTransient;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author mac
 */
public class ReadUnSerializedDog3 {
public static void main(String [] args){
    try{
        FileOutputStream fis=new FileOutputStream("first");
        ObjectOutputStream ois=new ObjectOutputStream(fis);
        Bone1 b= new Bone1(15);
        Dog2 d= new Dog2(b, 20);
         ois.writeObject(d);
         ois.flush();
         ois.close(); }
    catch(Exception e){e.printStackTrace();}
    
    try{
     FileInputStream fis=new FileInputStream("first");
     ObjectInputStream ois =new ObjectInputStream(fis);
     Dog2 d=(Dog2)ois.readObject();
     System.out.println("read for the input"+"\n"+d.getDogStrenght());
    
    
    }
    catch(Exception e){}

}
    
}
