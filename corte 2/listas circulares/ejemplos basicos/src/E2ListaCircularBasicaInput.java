import java.util.Scanner;

/**
 * Ejemplo 2 (Interactivo): Generador de Lista Circular
 *
 * Permite al estudiante insertar y eliminar nodos manualmente
 * para explorar las operaciones básicas de la lista circular.
 */
public class E2ListaCircularBasicaInput {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GENERADOR DE LISTA CIRCULAR ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar por valor");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor: ");
                    lista.insertarAlInicio(sc.nextInt());
                    lista.mostrar();
                    break;
                case 2:
                    System.out.print("Ingrese el valor: ");
                    lista.insertarAlFinal(sc.nextInt());
                    lista.mostrar();
                    break;
                case 3:
                    System.out.print("Ingrese el valor a eliminar: ");
                    lista.eliminar(sc.nextInt());
                    lista.mostrar();
                    break;
                case 4:
                    lista.mostrar();
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
