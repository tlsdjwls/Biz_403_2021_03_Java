package com.callor.score;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public class Word_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;

		
		try {
			fileReader = new FileReader(fileName);
	        buffer = new BufferedReader(fileReader);
	        String reader = new String();
	        while((reader = buffer.readLine()) != null){
	        String [] str = reader.split(":");	
	        System.out.println("=".repeat(50));
	        System.out.printf("%s/%s\n",str[1],str[2]);
	        	
	        }
	        System.out.println("=".repeat(50));
	        buffer.close();
	        
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
