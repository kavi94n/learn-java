import java.util.Scanner;

public class scaner {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("enter the name");
    String str1 = s.next();
    

    System.out.println("enter the dept");
    String str2 = s.next();
    

    System.out.println("enter the numer");
    int x = s.nextInt();

    System.out.println("enterd name :" + str1);
    System.out.println("enterd dept is :" + str2);
    System.out.println("enterd number is :"+x);
  }
}
