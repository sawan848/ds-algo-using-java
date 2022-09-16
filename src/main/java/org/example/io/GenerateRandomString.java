package org.example.io;
import java.util.*;
import java.io.*;

public class GenerateRandomString{
	private static final String str="abcdefghijklmnopqrtstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	private static final String fileName ="random_string.txt";

	private static final int string_length=10;

	public static String randomString(){
		StringBuffer buffer=new StringBuffer();
		
		for(int i=0;i<string_length;i++){

			int number=getRandomNumber();

			char ch=str.charAt(number);

			buffer.append(ch);
		}
		return buffer.toString();
	}
	private static int getRandomNumber(){
		int randomInt=0;

		Random random=new Random();

		randomInt=random.nextInt(str.length());

		if(randomInt -1==-1){
			return randomInt;
		}else{
			return randomInt - 1;
		}
	}



	public static void main(String []args) throws IOException{
		StringBuffer buffer=new StringBuffer();	
		GenerateRandomString string=new GenerateRandomString();


		PrintWriter writer=new PrintWriter(new BufferedWriter(
					new FileWriter(fileName)));

 		for (int i=0;i<4;i++){
			buffer.append(i+" : "+string.randomString()+"\n");
		}
		writer.write(buffer.toString());
		writer.close();
	
		System.out.println(buffer);

	}
}
