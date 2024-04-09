import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/**
 * script
 */

public class script {

  public static void main(String[] args)
     throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the String--");
    String s = reader.readLine();

    System.out.println("enter the numer--");
    int a = Integer.parseInt(reader.readLine());

    System.out.println("enterd string : " + s);
    System.out.println("enterd integer : " + a);
    
  }



}