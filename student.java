import java.util.Scanner;

public class student {
  public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);

    System.out.println("enter your name");
    String a = obj.next();

    System.out.println("enter your roll no");
    int b = obj.nextInt();

    System.out.println("enter your marks m1,m2,m3");
    int m1 = obj.nextInt();
    int m2 = obj.nextInt();
    int m3 = obj.nextInt();

    int total = m1+m2+m3;
    int avg = total/3;

    System.out.println("your name is :"+a);
    System.out.println("your roll no is :"+b);
    System.out.println("your total is :"+total);
    System.out.println("your average is :"+avg);
    

    
    
    if (avg>=90) {
      System.out.println("your grade is A");

    }
    else if (avg>=80) {
      System.out.println("your grade is B");
    }

    else if(avg>=60){
      System.out.println("your grade is C");
    }

    }
  }

