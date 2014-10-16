/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco.SerializationUsingTransient;

import java.io.Serializable;



/**IN this class we declared bone as being final meaning that it can not be overrriden
 * Our goal in this project is to assume we do not have access to this class code ie we can not 
 * declare it to implement the serializable interface
 *
 * 
 */
public final  class  Bone1 {
private int size;
public Bone1(int size){
this.size=size;}
public int getBoneSize(){
return size;
}
    
}

    

