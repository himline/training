package com.himline.write;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "temp.txt";
		String line  = null;
		
		try
		{
			FileReader filereader = new FileReader(fileName);
			
			BufferedReader BufferedReader = new BufferedReader(filereader);
		
		
			while((line = BufferedReader.readLine()) != null) 
			{
				System.out.println(line);
			}
// always close files 			bufferedReader.close();
		}
				
			
		catch(FileNotFoundException ex){
			
			System.out.println("unable to open file " + fileName + " " );
		}
		catch(IOException ex){
			
		
	System.out.println("error reading file " + fileName + " ");

		}

}
	}


