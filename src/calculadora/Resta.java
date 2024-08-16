package calculadora;
public class Resta
{
    private final int n1;
    private final int n2;
    private final int n3;
    private final int n4;
    private int resultadoResta;

    //Constructor
    public Resta(int n1, int n2, int n3, int n4)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;

    }

    public void realizaResta() {
        resultadoResta = n1 - n2 - n3 - n4;
        System.out.println("La resta es: " +resultadoResta);
    }

}