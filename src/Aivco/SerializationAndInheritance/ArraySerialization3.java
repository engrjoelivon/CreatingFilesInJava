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
public class ArraySerialization3 extends ArraySerialization implements Serializable{
    private int [] a;
 public ArraySerialization3(int...a) {
        this.a=a;
    
    }
    public int getLenght(){
        int b=a.length;
     return b;
    
    }

    @Override
   public String toString(){
       String b=String.valueOf(a.length);
  return b;
   
   }
}
