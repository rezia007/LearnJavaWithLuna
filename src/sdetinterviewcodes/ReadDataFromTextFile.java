package sdetinterviewcodes;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        //Approach 1: Using FileReader
        FileReader fr=new FileReader("C:\\Users\\Rezia Parvin\\Documents\\QA Course\\TestRezia.txt");
        BufferedReader br=new BufferedReader((fr));
 String str;
 while ((str=br.readLine())!=null)
 {
     System.out.println(str);
 }
 br.close();

 //Approach 2: Using Scanner and File
        File file=new File("C:\\Users\\Rezia Parvin\\Documents\\QA Course\\TestRezia.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
    }
}
