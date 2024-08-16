package calculadora;

public class Calculadora {

    public static void main(String[] args)
    {
        Suma sum = new Suma(1, 2, 3, 4);
        Resta res = new Resta(10, 5, 8, 3);
        Multiplicacion mult = new Multiplicacion(2.5, 3.5);
        Division div = new Division(10.5, 5.2);
        Modulo mod = new Modulo(14, 5);

        sum.realizaSuma();
        res.realizaResta();
        mult.realizaMultiplicacion();
        div.realizaDivision();
        mod.realizaModulo();


    }
}
