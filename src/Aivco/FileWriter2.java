/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aivco;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author mac
 */
public class FileWriter2 {
    
public static void main(String [] args){
    char [] in=new char [50];
int size;

try{File file=new File("Mysecfile.txt");
FileWriter writeFile=new FileWriter(file);//this method is used to write data into the file
writeFile.write("i am here for real for ever for life");
writeFile.flush();//when datas are passed into files they need to be flushed before closing so all the datas
//are stotred into the files before it closes
writeFile.close();
FileReader readFile=new FileReader(file);//this is used to read the datas in the file
size=readFile.read(in);//it reads the datas as char and stores them in a char array
System.out.println(size);
for(char c:in){System.out.print(c);
readFile.close();

}

}
catch(IOException e){
    e.printStackTrace();
}





}
    
}
