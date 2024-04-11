import java.util.Scanner;

public class nscript {
  public static void main(String[] args) {
     Scanner stu = new Scanner(System.in);

    
     System.out.println("enter your marks");

     int a = stu.nextInt();

     if (a>=90) {
      System.out.println("your grade is A");
     } 

     else if(a>=80) {
      System.out.println("your grade is B");
     }
     else if(a>=70) {
      System.out.println("your grade is c");
     }
     else if(a>=60) {
      System.out.println("your grade is D");
     }
     else if(a>=50) {
      System.out.println("your grade is E");
     }
     else if(a>=40) {
      System.out.println("your grade is fail");
     }
     else if(a>=30) {
      System.out.println("your are fail");
     }
  }
}
