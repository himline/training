package com.himline.java;
//import java.util.ArrayList;

//import java.util.Hashtable;
// import java.util.Scanner;
//import java.util.Vector;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test {

	public static void main(String[] args) throws IOException {

		BufferedReader buff = new BufferedReader(new FileReader("chhavi.txt"));
		String str;
		List<String> list = new ArrayList<String>();
		while ((str = buff.readLine()) != null) {
			list.add(str);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("value :"  +  i + " = " + list.get(i));
			
			
			
			    

		}

	}
}
