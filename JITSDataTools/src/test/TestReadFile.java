/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Luzec
 */
public class TestReadFile {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("H:\\data\\sevenads\\2017-10\\2017-10-17.txt");
        BufferedReader br = new BufferedReader(fr);
        
        // Get List distinct date
        String line = br.readLine(); // remove header
        System.out.println(line);  
	while ((line = br.readLine()) != null) {
            System.out.println(line);             
	}
        br.close();
        fr.close();    
        
    }
}
