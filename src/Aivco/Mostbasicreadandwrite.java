/*
 * The aim of this practise is to enhance my skill in reading and writing to a file at the most basic level.
To read from a file,first,a file need to be created.There are two ways a file can be created one
creating an instance of a file,then pass in a filename and calling the createnewfile method.
ii. Instantializing one of the higher level file creation class like FileReader and passing in the name 
of the file to be created.
iii.when writing to a file it needs to be flused so as to ensure all the text are written to the file
before it closed
iv.when reading from a file,it can be read char by char,read as a string or int.In the example below
it was read as int.because i already know that it is a text that is being read i casted it to its
corresponding char.
v.At the end of every action that involves a file,i ensured that the file is closed,this is done within 
the finally 
 */
package Aivco;
import java.io.*;
import java.util.ArrayList;

import java.util.Scanner;
/**
 *
 * @author macbook
 */
public class Mostbasicreadandwrite {
    private File file1;
    private File file2;
    private FileWriter fw;
    private FileReader fr;
    private BufferedReader bufferedReader ;
    private FileInputStream fis;
    private ByteArrayInputStream bais;
    private BufferedWriter bW;
    private static String ValToWrite;
    int a;
    byte [] b;
    private static Scanner scan;
 
  public static void main(String []args){
     Mostbasicreadandwrite  mbrw=new Mostbasicreadandwrite();
    mbrw. readrawbytes();
     scan=new Scanner(System.in);
     System.out.println("enter the either read to read from a file or write to write to a file");
   String res=  scan.nextLine();//will block at this point waiting from input from keyboard
   if(res.equals("read"))
   {     mbrw.readFile();           }
   else{if(res.equals("write")){
   System.out.println("enter text  to write to file");
   ValToWrite= scan.nextLine();//will also block at this point waiting for text that will be written to file
    mbrw.writeFile();   
   }
   else{ System.out.println("retry and enter the right value");}
   }
   
 
 
 }
 public  void readFile()//in this example we used the fileinputstream to read the file,the bufferedreader 
         //is an easier and better option because it reads string.
 { 
    try{
    file1=new File("src/Aivco/first18.txt");
    file1.createNewFile();
    fr=new FileReader(file1);
    fis=new FileInputStream(file1);
    
    
    //bufferedReader= new BufferedReader(fr);
   
    while((a=fis.read()) != -1)
    {  char c=(char)a;    
        System.out.print(c);
    
    }
    
   
   
    
   
    }
    catch(Exception e){}
    finally{
        try {
            fis.close();
        } catch (Exception e) {
            
        }
    
    }
 }
 public void writeFile()
 {
      try{
    file1=new File("src/Aivco/first18.txt");
    file1.createNewFile();
    fw=new FileWriter(file1);
    
    fw.write(ValToWrite);
    fw.flush();
    
    
   
   
    
   
    }
    catch(Exception e){}
    finally{
        try {
            fw.close();
        } catch (Exception e) {
            
        }
    
    }
     
 }
 public void readrawbytes()//this method reads raw bytes which could be sounds movies,pics etc
 {   
     byte [] b =new byte[200000000];
    
 
     try(FileInputStream fis=new FileInputStream("/Users/macbook/Documents/sdk/samples/android-11/ApiDemos/res/raw/test_cbr.mp3");
          FileOutputStream fos=new FileOutputStream("/Users/macbook/Downloads/testsong.mp3");
             ){
         
         fis.read(b);
         fos.write(b);
         fos.flush();
         
         System.out.println("Already printed"); 
         System.out.println(b); 
         
         
     }
     catch(IOException e){e.printStackTrace();}
 
 
 } 
}
