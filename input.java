import java.io.BufferedReader;
import java.io.InputStreamReader;

public class input {
  public static void main(String[] args) {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

   String name;
   try{System.out.println("enter your name");
   name = reader.readLine();
   System.out.println("name="+name );
  }
  catch (Exception e){
    
  }
  

  }
}
