import java.util.Date;

public class Revista extends Leitura{
    
    private Date data;
    private String editorial;
    private String reportagemcapa;

    public Revista() {}

    public Revista(int codigo,String titulo, String editora, String edicao,Date data,String editorial, String reportagemcapa){
        super(codigo, titulo, editora, edicao);
        this.data = data;
        this.editorial = editorial;
        this.reportagemcapa = reportagemcapa;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setReportagemcapa(String reportagemcapa) {
        this.reportagemcapa = reportagemcapa;
    }

    public Date getData() {
        return data;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getReportagemcapa() {
        return reportagemcapa;
    }

    @Override
   public String toString() {
       return super.toString() + String.format("\n Data:%tD \nEditorial = %s\n Reportagem Capa = %s", this.data,this.editorial,this.reportagemcapa);
   }
}
