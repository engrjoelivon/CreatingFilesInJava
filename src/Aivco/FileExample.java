/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco;
import java.io.*;

/**
 *
 * @author mac
 */
public class FileExample {
    
    public static final String seperator =System.getProperty("file.pathSeparator");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fw=null;
       File file1=null;
       System.out.println("the seperator is"+seperator);
       
        try {
            File file2=new File("/Users/macbook/Documents/javaexamprep/CreatingFiles/src/Aivco/file8.txt"); 
         file1=new File("file7.txt");
       file1.createNewFile();
        file2.createNewFile();
        
        fw=new FileWriter(file2);
        fw.write("welcome333333");
        fw.flush();
        } catch (Exception e) {
        }
        
        finally{ try {
          fw=new FileWriter(file1);      
        
        fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        
        
        
        
        try{
            FileOutputStream fos=new FileOutputStream(":Users:mac:Desktop:java2.txt");
        File file=new File("MyfirstFile.txt");//Creating an instance of file
        boolean doesExist=false;
        System.out.println("does file "+"\t"
                + file.exists());
  doesExist=      file.createNewFile();
  System.out.println("does file "+"\t"
                + file.exists());
        }
        catch(IOException eo){}
    }
}
