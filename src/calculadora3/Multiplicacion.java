package calculadora3;


public class Multiplicacion
{
    private final Double n1;
    private final Double n2;
    private Double resultadoMultiplicacion;

    // Constructor
    public Multiplicacion(Double n1, Double n2)
    {
        this.n1 = n1;
        this.n2 = n2;

    }

    //Method
    public void realizaMultiplicacion()
    {
        resultadoMultiplicacion = n1 * n2;
        System.out.println("La multiplicacion de dos numeros es: " +resultadoMultiplicacion);
    }

}