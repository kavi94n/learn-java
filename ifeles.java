import java.util.Scanner;

public class ifeles {
  public static void main(String[] args) {
    Scanner mug = new Scanner(System.in);

    System.out.println("enter your age");
    String tic = mug.next();
    System.out.println("enterd name :"+tic);
    
  

    System.out.println("enter the value a");
    int a = mug.nextInt();
    

    System.out.println("enter the value b");
    int b = mug.nextInt();

    if (a<b) {
      System.out.println("b is big");
      
    } else {
      System.out.println("a is big");
    }
    

  }
}
