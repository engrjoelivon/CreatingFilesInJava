/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author mac
 */
public class Dog implements Serializable//seriablizable here is a marker interface ie it does not
//contain any methods.
{ 
private Bone bone;
private int size;
public Dog(Bone a ,int size)/*constructor of dog accepts as part of its constructor parameter a
 * bone instance*/
{
this.bone=a;
this.size=size;
}
public int  getDogStrenght()//this is a getter method that returns 
{
   int ans=bone.getBoneSize();
return ans*size;



}
    
}
