package horno;
// palabras reservadas estan en naranja
// nombre clase en color blanco
// constructor y metodos en color azul
// cadenas en color verde
// atributos en color morado
import java.util.*;
public class MoldeGalleta {
    private final String color;
    private final String sabor;
    private final Double medida;
    private final String nombre;

    //Constructor , permite inicializar los atributos con valores que vengan de fuera
    public MoldeGalleta(String color, String sabor,Double medida, String nombre)
    {
        this.color = color;
        this.sabor = sabor;
        this.medida = medida;
        this.nombre = nombre;
    }


    //methods
    public void obtenerColor() {

        System.out.println("El color es: " + color);
    }

    public void obtenerSabor() {

        System.out.println("El sabor es: " + sabor);
    }

    public void obtenerMedida() {

        System.out.println("La medida es: "+medida+ "cm");
    }

    public void obtenerNombre() {

        System.out.println("El nombre es: "+nombre);
    }

    public void obtenerDatos()
    {

        System.out.println("DATOS DEL METODO obtenerDatos()");
        System.out.println("El color es " + color);
        System.out.println("El sabor es: " + sabor);
        System.out.println("La medida es: " +medida+ " cm");
        System.out.println("El nombre es: "+nombre);


    }

}