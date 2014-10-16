/*
 * The aim of this example is to show the numerous ways files can be created.
method1,method2 and method3 defines numerous ways this can be achived.
 */
package creatingfiles;


import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author macbook
 */
public class CreatingFiles {
FileWriter fw=null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      new CreatingFiles().method1();
      new CreatingFiles().method2();
      new CreatingFiles().method3();
        }
    
    
 public void method1()//this method shows the most basic way to create a file.
 {

       File file1=null;
       
       
 try {
  file1=
 new File("/Users/macbook/Documents/javaexamprep/CreatingFiles/src/creatingfiles/method1.txt");//using absolute path 
  if(file1.createNewFile())//returns true if files succesfully created
   {    System.out.println("method1 has generated a txt file in the creating file directory");}
   else{System.out.println(" txt files method1 already exist in creating file directory ");}
   } catch (IOException e) {
       e.printStackTrace();
        }
        
        finally{ try {
              
        
        
            } catch (Exception e) {
                e.printStackTrace();
            }}
 
 }
 
 public void method2()//creates a pdf file using the shorter absolute path
 {
 File file1=null;
       
       
 try {
  file1=new File("src/CreatingFiles/method2.pdf");//using absolute path 
  if(file1.createNewFile())//returns true if files succesfully created
   {    System.out.println("method2 has generated a pdf file in the creating file directory");}
   else{System.out.println("pdf files method2 already exist in creating file directory ");}
  
   } catch (IOException e) {
       e.printStackTrace();
        }
        
        finally{ try {
              
        
        
            } catch (Exception e) {
                e.printStackTrace();
            }}
 
 }
 public void method3()
 {
     try {
  fw=new FileWriter("src/CreatingFiles/method3.txt"); 
//the file writer could be either filereader,printwriter,or ever fileinput and outputsream
  
  PrintWriter pw=new PrintWriter("src/CreatingFiles/printwriter.txt");
  FileOutputStream fos=new FileOutputStream("src/CreatingFiles/fos.txt");
  System.out.println("method3 uses high level classes to create files");
     
     } catch (Exception e) {
     }
 
 
 
 
 }
 
}
