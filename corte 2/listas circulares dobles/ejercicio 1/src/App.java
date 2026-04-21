/* Ejercicio 1 — Línea de Metro Circular
Una ciudad tiene una línea de metro que forma un anillo cerrado.
Los pasajeros pueden viajar en sentido horario o antihorario,
y el sistema calcula cuál ruta es más corta entre dos estaciones. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metro metro = new Metro();
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   Metro Circular — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar estación");
            System.out.println("2. Mostrar línea completa");
            System.out.println("3. Calcular ruta más corta");
            System.out.println("4. Cargar línea de ejemplo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la estación: ");
                    String nombre = sc.nextLine();
                    System.out.print("Zona (1-3): ");
                    int zona = sc.nextInt();
                    System.out.print("Pasajeros diarios: ");
                    int pasajeros = sc.nextInt();
                    sc.nextLine();
                    metro.agregarEstacion(nombre, zona, pasajeros);
                    System.out.println("Estación '" + nombre + "' agregada.");
                    break;

                case 2:
                    metro.mostrarLinea();
                    break;

                case 3:
                    if (metro.estaVacia()) {
                        System.out.println("La línea no tiene estaciones aún.");
                        break;
                    }
                    metro.mostrarLinea();
                    System.out.print("\nEstación de origen: ");
                    String origen = sc.nextLine();
                    System.out.print("Estación de destino: ");
                    String destino = sc.nextLine();
                    metro.rutaMasCorta(origen, destino);
                    break;

                case 4:
                    metro = new Metro();
                    metro.agregarEstacion("Portal Norte",    1, 18500);
                    metro.agregarEstacion("Calle 100",       1, 12300);
                    metro.agregarEstacion("Calle 72",        2,  9800);
                    metro.agregarEstacion("Flores",          2, 15400);
                    metro.agregarEstacion("Av. Jimenez",     3, 22100);
                    metro.agregarEstacion("General Santander",3, 11700);
                    metro.agregarEstacion("Portal Sur",      1, 16900);
                    System.out.println("Línea de ejemplo cargada con 7 estaciones.");
                    metro.mostrarLinea();
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
