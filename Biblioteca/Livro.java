public class Livro extends Leitura{
    private String autor;
    private int ano;
    private int numpag;
    private String isbn;

   public Livro(){}

   public Livro(int codigo,String titulo, String editora, String edicao,String autor,int ano,int numpag,String isbn){
       super(codigo, titulo, editora, edicao);
       this.autor = autor;
       this.ano = ano;
       this.numpag = numpag;
       this.isbn = isbn;
   }
   public void setAutor(String autor) {
       this.autor = autor;
   }

   public void setAno(int ano) {
       this.ano = ano;
   }

   public void setNumpag(int numpag) {
       this.numpag = numpag;
   }

   public void setIsbn(String isbn) {
       this.isbn = isbn;
   }

   public String getAutor() {
       return autor;
   }
   public int getAno() {
       return ano;
   }
   public int getNumpag() {
       return numpag;
   }
   public String getIsbn() {
       return isbn;
   }

   @Override
   public String toString() {
       return super.toString() + String.format("\nAutor:%s \nAnoPublicacao = %d\n NumPaginas = %d \n ISBN = %s", this.autor,this.ano,this.numpag,this.isbn);
   }
}
