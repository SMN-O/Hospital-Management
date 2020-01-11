/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.ReadData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Simon Yates
 */
public class BuffRead {
public static void main(String[]args) throws IOException{

 

    String filePath = "bye.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            //get 1st line
            String firstLine = br.readLine().trim();
            String[] ObjectName = firstLine.split("/");
            Object[] tableLines = br.lines().toArray();


            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                String[] dataRow = line.split(",");
            }

        } catch (IOException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
