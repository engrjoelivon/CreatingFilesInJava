/*
 * 
 * 
 */
package Aivco.SerializationUsingTransient;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *because bone class is a final class,meaning we can not extend it nor can it 
 * implement the serializable interface
 * our option is to declare the bone instance variable as transient.
 * This means it will not be save during serialization 
 * ie to say during 
 * de serialization this variable will be pointing to null.For that the vm 
 * machine will throw a null pointer exception 
 */
public class Dog2 implements Serializable{ 
private transient Bone1 bone;//cannot be serialized so it must be marked as transient.During deseriali
//tion the variable bone will be assigned its default value,in this case null.
//and redefine it.Except we implement the readObject

private int size;
public Dog2(Bone1 a ,int size){
this.bone=a;
this.size=size;
}
public int  getDogStrenght(){
   int ans=bone.getBoneSize();
return ans*size;}
/*The solution to this problem is below.Java gives a set of private method,that can
 be implemented within the class.This methods will be invoked autormatically during serialization 
 and deserialization.This method acts like they are part of the serialization interface
 but they are not.This methods let you step inbetween serialization and deserialization*/
private void writeObject(ObjectOutputStream oos){
    

 try{
/*by calling the method below we are asking the jvm to follow through with its normal serialization
process*/
oos.defaultWriteObject();
oos.writeInt(bone.getBoneSize());//We called the getter method getBonesize because that is what makes
//a bone obect.during deserialization the bone will be reacreated.

 
 }
 catch(Exception e){e.printStackTrace();}
}private void readObject(ObjectInputStream ois){

 try{
     
ois.defaultReadObject();//the default read object has to follow the same positioning as the defaultWriteObject
bone =new Bone1(ois.readInt());//this is the state of the bone class that we require so we manually pass it
//it into ObjectInputStream 
 }
 catch(Exception e){e.printStackTrace();}

}}

/*The most reason why we implement the writeObject and readObject is when we have to save some part of
 an object state manually.then declare the defaultWriteObject and DefaultReadObject to do the rest.
 to do the rest of the serialization.iF we decide we want to write all of the state we dont need to
 include the default methods*/

