/* 1. Sistema de Control de Versiones (Undo/Redo)
Diseña un editor de texto muy simple que guarde el historial de cambios.

La Clase Cambio (Nodo): Debe contener texto (String) y tipoOperacion (String - ej: "Escribir", "Borrar").
El Problema: Cada vez que el usuario escribe algo, se agrega un nodo al final. El usuario puede deshacer 
(retroceder al nodo anterior) y rehacer (avanzar al nodo siguiente).
Reto: Implementa métodos deshacer() y rehacer() que muevan un puntero actual a través de la lista doble. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Historial historial = new Historial();
        Cambio cambioActual = null;

        do {
            System.out.println("\n==============================================");
            System.out.println("   Historial de Cambios — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar Cambio");
            System.out.println("  [2] Deshacer Cambio");
            System.out.println("  [3] Rehacer Cambio");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el texto del cambio: ");
                    sc.nextLine(); // Consumir el salto de línea
                    String texto = sc.nextLine();
                    System.out.print("Ingrese el tipo de operación (Escribir/Borrar): ");
                    String tipoOperacion = sc.nextLine();
                    Cambio nuevoCambio = new Cambio(texto, tipoOperacion);
                    historial.agregarCambio(nuevoCambio);
                    cambioActual = nuevoCambio; // Mover el puntero al nuevo cambio
                    break;

                case 2:
                    if (cambioActual != null) {
                        System.out.println("Cambio actual: " + cambioActual.texto);
                        cambioActual = historial.deshacer(cambioActual);
                        System.out.println("Cambio deshecho: " + cambioActual.texto);
                    } else {
                        System.out.println("No hay cambios para deshacer.");
                    }
                    break;

                case 3:
                    if (cambioActual != null) {
                        System.out.println("Cambio actual: " + cambioActual.texto);
                        cambioActual = historial.rehacer(cambioActual);
                        System.out.println("Cambio rehecho: " + cambioActual.texto);
                    } else {
                        System.out.println("No hay cambios para rehacer.");
                    }
                    break;

                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
