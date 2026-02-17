/**
 * Ejercicio 1 - Variables y tipos de datos
 * Semana 1 y 2: Elementos del lenguaje, generalidades y conceptos básicos
 *
 * Se declaran variables de los tipos primitivos más comunes en Java
 * y se muestran sus valores por pantalla.
 */
public class E1Variables {
    public static void main(String[] args) {

        // Tipo entero
        int edad = 20;

        // Tipo decimal
        double promedio = 4.5;

        // Tipo caracter
        char inicial = 'E';

        // Tipo booleano
        boolean estaActivo = true;

        // Tipo cadena de texto (no es primitivo, es un objeto)
        String nombre = "Estructura de Datos";

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Inicial: " + inicial);
        System.out.println("Está activo: " + estaActivo);
    }
}
