package calculadora3;

import java.util.Scanner;

public class Calculadora3 {

    private static int n1mod, n2mod;
    private static Double n1, n2;

    public static void main(String[] args)
    {
        //Se declaran los objetos, pero SIN llamar al constructor
        Suma sum;
        Resta res;
        Multiplicacion mult;
        Division div;
        Modulo mod;

        Scanner teclado = new Scanner(System.in);
        //Se piden los datos DOBLES
        System.out.println("*******Datos (Suma, Resta, Multiplicacion y Division)*******");
        System.out.println("Dame n1: ");
        n1 = teclado.nextDouble();
        System.out.println("Dame n2: ");
        n2 = teclado.nextDouble();

        //Se piden los datos enteros
        System.out.println("*******Datos (Modulo)*******");
        System.out.println("Dame n1 del modulo: ");
        n1mod = teclado.nextInt();
        System.out.println("Dame n2 del modulo: ");
        n2mod = teclado.nextInt();

        //Inicializamos constructores
        sum = new Suma(n1, n2);
        res = new Resta(n1, n2);
        mult = new Multiplicacion(n1, n2);
        div = new Division(n1, n2);
        mod = new Modulo(n1mod, n2mod);


        //Mandamos llamar los metodos
        sum.realizaSuma();
        res.realizaResta();
        mult.realizaMultiplicacion();
        div.realizaDivision();
        mod.realizaModulo();


    }
}
