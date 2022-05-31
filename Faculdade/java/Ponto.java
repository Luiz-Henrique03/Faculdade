public class Ponto{
    
    // Propriedades, atributos
    private double x;
    private double y;

    //Construtor
    public Ponto(){}
    public Ponto (double x, double y){
        this.x = x;
        this.y = y;
    }

    // Getters and Setters

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }

    public double distancia(){
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y, 2));
    }

    public double distancia(Ponto p){
        return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
    }


    @Override
    public String toString(){
       return String.format("x = %f \ny = %f", this.x,this.y);
    }

    


}