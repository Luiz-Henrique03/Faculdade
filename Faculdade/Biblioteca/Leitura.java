public class Leitura extends Material{
    
    private String editora;
    private String edicao;

    public Leitura() {}

    public Leitura(int codigo, String titulo, String editora, String edicao){
        super(codigo,titulo);
        this.editora =editora;
        this.edicao = edicao;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("\nEditor: %s \n Edicao = %s", this.editora, this.edicao);
    }
}
