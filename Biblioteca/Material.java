public class Material{

    private int codigo;
    private String titulo;

    public Material () {}
    public Material (int codigo, String titulo){
       this.titulo = titulo;
       this.codigo = codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }



    @Override
    public String toString() {
        return super.toString() + String.format(":\n Codigo = %d\n Titulo = %s", this.codigo,this.titulo);
    }
    
}