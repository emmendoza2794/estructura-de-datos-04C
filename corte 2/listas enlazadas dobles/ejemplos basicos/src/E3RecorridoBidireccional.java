import java.util.Scanner;

/**
 * Ejemplo 3: Recorrido Bidireccional Interactivo
 * Permite al usuario interactuar con la lista y ver la ventaja de la lista doble.
 */
public class E3RecorridoBidireccional {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ LISTA DOBLE ---");
            System.out.println("1. Insertar al Inicio");
            System.out.println("2. Insertar al Final");
            System.out.println("3. Ver de Principio a Fin (Adelante)");
            System.out.println("4. Ver de Fin a Principio (Atrás)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor: ");
                    lista.insertarAlInicio(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Ingrese el valor: ");
                    lista.insertarAlFinal(sc.nextInt());
                    break;
                case 3:
                    lista.imprimirAdelante();
                    break;
                case 4:
                    lista.imprimirAtras();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
