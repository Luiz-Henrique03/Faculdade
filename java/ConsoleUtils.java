import java.util.Scanner;

public class ConsoleUtils{
  public static int lerInteiro(String msg){

      Scanner input = new Scanner(System.in);
      
      try{
        System.out.println(msg);
        while(true){
          try {
            String str = input.next();
              int n = Integer.parseInt(str);
              return n;
            } catch (NumberFormatException Ex) {
               System.out.println("O valor de digitado não é um número valido tente novamente");
              
            }
        }
      } finally{
          input.close();
      }
  
  }
}