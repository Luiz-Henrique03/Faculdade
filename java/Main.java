public class Main {
    public static void main(String[]args){
        Ponto pt1 = new Ponto();
        Ponto pt2 = new Ponto(5,10);
        Ponto pt3 = new Ponto(7,10);

        System.out.println(pt1);
        System.out.println(pt2);
        System.out.println(pt3);

        System.out.printf("pt1 -> origem = %f\n",pt1.distancia());
        System.out.printf("pt1 -> pt2 = %f\n",pt1.distancia(pt2));
        System.out.printf("pt2 -> pt3 = %f\n",pt2.distancia(pt3));   
    }
}
