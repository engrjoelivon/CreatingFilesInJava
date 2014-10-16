/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco.SerializationAndInheritance;

import java.io.Serializable;

/**
 *
 * @author mac
 */
public class ArraySerialization {
private int [] a;
    public ArraySerialization(int...a) {
        this.a=a;
    
    }
    public int getLenght(){
        int b=a.length;
     return b;
    
    }

   public String toString(){
       String b=String.valueOf(a.length);
  return b;
   
   }
    
}
