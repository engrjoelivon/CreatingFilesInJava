/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco.SerializationAndInheritance;

import java.io.Serializable;

/**
 * This class is assumed not serializable.some classes in java are just not serializable 
 * e.g the object class or the runtime classes like strings,runtime,threads etc
 *So now we will check what will happen when a child implements a parent that is not serializable
 * Remember serialization and de serialization is anonymous to creating a new instance of an object.
 *But it differs in a lot of ways e g a serialize object during de serialization contains all the state
 * of that object at the time it was passed into the writeObject method.While the new operator
 * will initialize all the variables back to their default states,defined by the constructor.
 * One simply cnt tell if a class is serializable unless one can see its inheritance tree,if it does
 * extend any class or if it implements serialable
 */
public class NoneSerializableParent1 implements Serializable{
protected int legs=4;
protected int eyes=2;
public int getLeg(){
  return legs;}


protected void setLeg(int l){
     legs=l;
  }   
}
