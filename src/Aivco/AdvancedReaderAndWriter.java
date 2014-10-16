/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco;
import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author mac
 */
public class AdvancedReaderAndWriter {
   
public static void main(String [] args){
char ex=90;//this shows some properties of char,it can be assigned to a number not and also a literal
System.out.println("this is ex"+ex);
File file =new File("Third.txt");
File file2 =new File("fourth.txt");

try{
FileOutputStream fos=new FileOutputStream(file2);
BufferedOutputStream bos=new BufferedOutputStream(fos);
String s="welcome";

byte [] st2=new byte [20];
for(int c=0;c<st2.length; c++){
st2[c]=(byte)(10*c);

}
byte [] st=s.getBytes();//this is used to get the byte of the string

bos.write(st2);//here we passed in an array of byte
bos.write(st);//here we passed in an integer
bos.flush();
bos.close();

FileInputStream fis=new FileInputStream(file2);
BufferedInputStream bis=new BufferedInputStream(fis);
int a=bis.available();
System.out.println("the value of a"+"\t"+a);
byte [] b=new byte[a];
for(int c=0;c<b.length; c++){
    System.out.println("the value of b.length"+"\t"+b.length);
  int dc= bis.read(new byte[a]);
    b[c]=(byte)bis.read();}
for(int d=0;d<b.length; d++){System.out.println (b[d] +"\t");}
//System.out.println("answer in char"+"\t"+(char)bis.read());//values formatted by casting to char
//System.out.println("answer in byte"+"\t"+(byte)bis.read());//values read exaxtly the way it came ie byte
FileWriter writefile=new FileWriter(file);
PrintWriter bw=new PrintWriter(writefile);
bw.println("i am here for sure i no get time at ll no time to joke or do anything whe no make sence na me be this no be you ");
bw.flush();
bw.close();
FileReader fw=new FileReader(file);
BufferedReader br=new BufferedReader(fw);

System.out.print(br.readLine());
br.close();



}
catch(IOException e){System.out.println("there was an error");}


}
    
}
