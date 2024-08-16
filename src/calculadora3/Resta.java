package calculadora3;
public class Resta
{
    private final Double n1;
    private final Double n2;
    private double resultadoResta;

    //Constructor
    public Resta(Double n1, Double n2)
    {
        this.n1 = n1;
        this.n2 = n2;

    }

    public void realizaResta() {
        resultadoResta = n1 - n2;
        System.out.println("La resta es: " +resultadoResta);
    }

}