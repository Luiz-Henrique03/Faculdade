import java.util.Date;

public class Programa {

    public static void main(String [] args) {
        Livro l = new Livro(1,"Livro Teste", "Teste","3a","Teste",2022, 457,"200819610191");
        Revista r = new Revista(1,"Revista Teste","Teste","2a", new Date(2022,3,15),"ditoaial TEste", "Reportagem Testee");

        System.out.println(l.toString());
        System.out.println(r.toString());
    }
}
