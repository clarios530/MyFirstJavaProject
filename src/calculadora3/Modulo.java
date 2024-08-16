package calculadora3;


public class Modulo
{
    private final int n1;
    private final int n2;
    private int resultadoModulo;

   //Constructor
    public Modulo(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    //Method
    public void realizaModulo()
    {
        resultadoModulo = n1%n2;
        System.out.println("El modulo(residuo) es: " +resultadoModulo);

    }

}