package org.example.io;

import java.io.*;
import java.util.Scanner;

/**
 * 08:08 PM
 * 30-09-2022
 */


public class ReadFileAndWrite {

    private static final String filename="names.txt";

    /**
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static String read(String filename) throws IOException {
        //stored the data and return it.
        StringBuilder builder=new StringBuilder();
        //load the file
        BufferedReader reader=new BufferedReader(new FileReader(filename));
        String str;
        int count=1;
        while ((str=reader.readLine())!=null){
            builder.append(count++ +" : "+str+"\n");
        }
        reader.close();

        return builder.toString();
    }

    /**
     *
     * @param filename
     * @throws IOException
     *
     */
    public static void createAndReadFile(String filename) throws IOException {
        //create the filename
        PrintWriter writer=new PrintWriter(new FileWriter(filename));
        //take input from user
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the names ");
        String names=scanner.nextLine();
        //store in the file
        writer.println(names);
        writer.close();
        System.out.println(read(filename));

    }

    public static void main(String[] args) throws IOException {
        File file=new File(filename);
        //check the file exist or not
        if (file.isFile()){

            //if exist then read the content of the file
            System.out.println(read(filename));

        }else { //if not present then create and read
            createAndReadFile(filename);
        }
    }
}
