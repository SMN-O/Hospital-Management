/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Simon Yates
 */
public class FileWriting {
    BufferedWriter out;
    String read;

    int linenum = 3;//the specific line i want to read
    
    public FileWriting(){
        try {
            //replace helloworld.txt with the name of the file
            out = new BufferedWriter(new FileWriter("Patients.txt"));

            //Write out the specified string to the file
            out.write("Hello 83743");

            //flushes and closes the stream
            out.close();
        }catch(IOException e){
            System.out.println("There was a problem:" + e);

        }
    }

    public static void main(String[] args){

    }
}
