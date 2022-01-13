import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    String token="";
    File fileName=new File("Hail.txt");
    Scanner inputFile=new Scanner(fileName);

    //use while loop to read tokens from the Hail.txt file
    int count=0;
    while(inputFile.hasNext())
    {
      token=inputFile.next();
      System.out.println(token);
      count++;
    }
    inputFile.close();
    System.out.println("The number of tokens in Hail.txt is "+count+"\n");

    //read Hail.txt and store in array
    Scanner inputFile2=new Scanner(fileName);
    String[] hail=new String[count];

    int index=0;
    while(inputFile2.hasNext())
    {
      hail[index]=inputFile2.next();
      index++;
    }
    inputFile2.close();
    System.out.println("Hail.txt in an array:");
    for(String i:hail)
    {
      System.out.println(i);
    }

    //read HailCommas.txt file with comma delimiter
    File fileName3=new File("HailCommas.txt");
    Scanner inputFile3=new Scanner(fileName3).useDelimiter(",");

    while(inputFile3.hasNext())
    {
      token=inputFile3.next();
      System.out.println(token);
    }
    inputFile3.close();





  }
}