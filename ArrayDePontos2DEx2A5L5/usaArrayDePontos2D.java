public class usaArrayDePontos2D {
    public static void main(String[] args) {
        ArrayDePontos2D cP1 = new ArrayDePontos2D(5);

        cP1.modifica(0, new Ponto2D(-1, -3));
        cP1.modifica(3, new Ponto2D(0.0, 0.0));
        cP1.modifica(4, new Ponto2D(1.0,25.0));

        System.out.println(cP1);


    }
    
}
