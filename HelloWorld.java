import java.util.Scanner;

public class HelloWorld {
  
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      String YesNo = input.next();
      
      System.out.println("Hello, World!");    // Yay, it does a thing!
      System.out.print("Would you like to see some more text? Y / N");
      
      if(YesNo = "Y")
      {
        System.out.println("More text, because why not?"); 
      }

      if(YesNo = "N")
      {
        System.out.println("Closing application now. Bye!");
        System.exit(); 
      }

    }
  
}
