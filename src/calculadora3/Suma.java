package calculadora3;
public class Suma
{
    private final Double n1;
    private final Double n2;
    private double resultadoSuma;

    //Constructor
    public Suma(Double n1, Double n2)
    {
        this.n1 = n1;
        this.n2 = n2;


    }

    public void realizaSuma()
    {
        resultadoSuma = n1 + n2;
        System.out.println("La suma es: " + resultadoSuma);

    }

}