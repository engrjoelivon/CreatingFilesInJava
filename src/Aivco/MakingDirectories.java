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
public class MakingDirectories {
private static  boolean a;
private static boolean b,c,d;

 
public static void main(String [] args){
    try{
   
 File mkDir=new File("myDir");//create a make a directory name
 mkDir.mkdir();//this line is used to make the directory 
 File file=new File(mkDir, "dirfile.txt");/*the file constuctor is overloaded,this constructor accept
  *both a dir name and a file name to be added in the dir
  */
 File file2=new File(mkDir,"dirfile2.txt");
 file.createNewFile();/*we still needed to invoke the create new file,without this 
  * invocation the file will not be created
  */
 file2.createNewFile();
 FileWriter fw=new FileWriter(file);
 FileWriter fw2=new  FileWriter(file2);
 fw.write("welcome to the new cirty");
 fw2.write("welcome to the new city2");
 
 fw2.close();
 fw.flush();
 fw.close();
 
    }
    catch(IOException e){}
    MakingDirectories MK =new MakingDirectories();
    System.out.println(MK.makeString());
MK.deletingDirOFiles();
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);

}
 
public String makeString(){
    String a=null;
   
 try{
 /*in this example we do not invoke make directory on file because we called the file writer and 
  passed the file as one of its parameter*/
 File mkdir=new File("mkdir");
 //mkDir.mkdir(); in this case we do not need to call the mkdir 
 File file=new File(mkdir, "dirfile.txt");//this line is used to pass the file into the new directory
 //file.createNewFile();
 FileWriter writer=new FileWriter(file);
 BufferedWriter bw=new BufferedWriter(writer);
 bw.write("welcome to the hit of the new day");
 bw.flush();
 bw.close();
 
 
 FileReader fw=new FileReader(file);
 BufferedReader br=new BufferedReader(fw);
 if((a=br.readLine()) != null){
    
 

}
 
   
   
 }
    catch(IOException e){}

return a;

}
   public void deletingDirOFiles(){
       try{
   File dirFile = new File("myDir");//creating dir name
   dirFile.mkdir();//creating a dir on the system
   File myFile=new File(dirFile,"myfile.txt");//creating file name
   File myFile2=new File(dirFile,"myfile2.txt");//creating another file name within this dir
   myFile.createNewFile();
   myFile2.createNewFile();
  a= dirFile.delete();//will return true or false depending on if action was succesful
  b=myFile2.delete();//will return true or false depending on if action was succesful
  c=myFile.delete();
  d= dirFile.delete();//this proves that you cant delete a file unless it is empty   
       
       
       }//creating file on the system
   catch(IOException e){}
   
   
   } 
   
}
