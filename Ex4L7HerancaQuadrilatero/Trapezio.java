package Ex4L7HerancaQuadrilatero;

public class Trapezio extends Quadrilatero{

    public Trapezio(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double area() {
        double baseMaior = Math.sqrt(Math.pow(getX2() - getX1(), 2) + Math.pow(getY2() - getY1(), 2));
        double baseMenor = Math.sqrt(Math.pow(getX4() - getX3(), 2) + Math.pow(getY4() - getY3(), 2));
        double altura = Math.abs(getY3() - getY1());

        return 0.5 * (baseMaior + baseMenor) * altura;
    }
}
