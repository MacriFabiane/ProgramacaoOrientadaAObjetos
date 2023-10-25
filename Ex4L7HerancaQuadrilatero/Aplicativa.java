package Ex4L7HerancaQuadrilatero;

public class Aplicativa {
    public static void main (String[]args){
       Quadrado quadrado= new Quadrado(1, 2, 3, 2, 1, 4, 2, 4);
       Retangulo retangulo =new Retangulo(1, 2, 4, 2, 1, 4, 3, 4);
       Trapezio trapezio = new Trapezio(1, 1, 4, 1, 2, 3, 3, 3);
       Paralelogramo paralelogramo = new Paralelogramo(1, 1, 3, 1, 2, 2, 4, 2);

       System.out.println(quadrado.area());
       System.out.println(retangulo.area());
       System.out.println(trapezio.area());
       System.out.println(paralelogramo.area());

    }
    
}
