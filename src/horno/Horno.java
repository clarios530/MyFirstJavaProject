package horno;

import java.util.Scanner;

public class Horno {

    public static String color, sabor, nombre;
    public static Double medida;

    public static void main(String[] args) {

        MoldeGalleta galleta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("******Datos de la Galleta******");
        System.out.println("Dame el color de la galleta: ");
        color = teclado.nextLine();
        System.out.println("Dame el sabor de la galleta: ");
        sabor = teclado.nextLine();
        System.out.println("Dame el nombre de la galleta: ");
        nombre = teclado.nextLine();
        System.out.println("Dame la medida de la galleta: ");
        medida = teclado.nextDouble();


        galleta = new MoldeGalleta(color,sabor, medida, nombre);
        galleta.obtenerColor();
        galleta.obtenerSabor();
        galleta.obtenerMedida();
        galleta.obtenerNombre();
        galleta.obtenerDatos();



    }
}
