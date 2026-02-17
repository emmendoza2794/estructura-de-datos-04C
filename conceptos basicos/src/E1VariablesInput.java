import java.util.Scanner;

/**
 * Ejercicio 1 (Interactivo) - Variables y tipos de datos
 * Semana 1 y 2: Elementos del lenguaje, generalidades y conceptos básicos
 *
 * El usuario ingresa sus propios datos para ver en acción
 * cada tipo primitivo y String, y entender para qué sirve cada uno.
 *
 * Tipos demostrados:
 *   int    → números enteros (edad, semestre, código)
 *   double → números con decimales (promedio, precio)
 *   char   → un solo carácter (inicial)
 *   boolean→ verdadero o falso (estado activo/inactivo)
 *   String → cadena de texto (nombre, descripción)
 */
public class E1VariablesInput {

    public static void main(String[] args) {

        // Scanner permite leer datos ingresados por el usuario desde el teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Registro de Estudiante — Tipos de Datos");
        System.out.println("==============================================");

        // String: para texto libre (nombres, descripciones)
        System.out.print("Ingresa tu nombre completo: ");
        String nombre = sc.nextLine();

        // int: entero, sin decimales — para cantidades exactas
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tu semestre actual: ");
        int semestre = sc.nextInt();

        // double: con decimales — para valores que requieren precisión
        System.out.print("Ingresa tu promedio acumulado (ej: 3.75): ");
        double promedio = sc.nextDouble();

        // char: un solo carácter — .charAt(0) toma el primero del texto ingresado
        System.out.print("Ingresa la inicial de tu carrera (ej: S): ");
        char inicialCarrera = sc.next().charAt(0);

        // boolean: solo true o false — para estados de sí/no
        System.out.print("¿Estás matriculado este semestre? (true/false): ");
        boolean matriculado = sc.nextBoolean();

        // --- Reporte con el tipo de cada variable ---
        System.out.println("\n============ Ficha del Estudiante ============");
        System.out.println("Nombre     (String)  : " + nombre);
        System.out.println("Edad       (int)     : " + edad);
        System.out.println("Semestre   (int)     : " + semestre);
        System.out.println("Promedio   (double)  : " + promedio);
        System.out.println("Carrera    (char)    : " + inicialCarrera);
        System.out.println("Matriculado (boolean): " + matriculado);

        // --- Operaciones con los datos ingresados ---
        System.out.println("\n============ Cálculos adicionales ============");

        // int / double → Java promueve automáticamente a double
        double notaNecesaria = (4.5 - promedio);
        System.out.println("Diferencia con promedio 4.5: " + String.format("%.2f", notaNecesaria));

        // Concatenación: el operador + une String con otros tipos
        System.out.println("Mensaje: Hola " + nombre + ", llevas " + semestre + " semestre(s).");

        // Conversión de tipos: cast explícito de double a int (pierde decimales)
        int promedioEntero = (int) promedio;
        System.out.println("Promedio truncado (int): " + promedioEntero
                + "  ← cast de double a int, se pierde la parte decimal");

        sc.close();
    }
}
