public class ProgramaPrincipal {
    public static void main(String[] args) {
        int num = ConsoleUtils.lerInteiro("Digite um numero inteiro: \n");
        System.out.println("Numero lido "+num);

       try {
          long fat = Fatorial.calcular(num); 
          System.out.printf("%d: = %d",num,fat);
       } catch (IllegalArgumentException ex){
           //ex.printStackTrace();
           System.out.println(ex.getMessage());
       } finally{
           System.out.println("Programa terminado volte sempre");
       }
    }
}
