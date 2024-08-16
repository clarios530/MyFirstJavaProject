package calculadora3;


public class Division
{
    private final Double n1;
    private final Double n2;
    private Double resultadoDivision;


    //Constructor
    public Division(Double n1, Double n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    //Method
    public void realizaDivision()
    {
        resultadoDivision = n1/n2;
        System.out.println("La division es: " +resultadoDivision);
    }

}