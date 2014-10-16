/*
 *
 */
package Aivco.Serialization;

import java.io.Serializable;

/**
 *
 * @author mac
 */
public class Bone implements Serializable{
private int size;
public Bone(int size)//constructor of bone class
{
this.size=size;}
public int getBoneSize(){
return size;
}
    
}
