import java.util.Scanner;

/**
 * Ejemplo 2 Interactivo: Operaciones en lista circular doble con menú.
 */
public class E2OperacionesDobleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircularDoble lista = new ListaCircularDoble();
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   Lista Circular Doble — Operaciones");
            System.out.println("==============================================");
            System.out.println("1. Insertar al final");
            System.out.println("2. Insertar al inicio");
            System.out.println("3. Eliminar por valor");
            System.out.println("4. Mostrar adelante");
            System.out.println("5. Mostrar atrás");
            System.out.println("6. Buscar valor");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Valor a insertar al final: ");
                    lista.insertarAlFinal(sc.nextInt());
                    lista.mostrarAdelante();
                    break;
                case 2:
                    System.out.print("Valor a insertar al inicio: ");
                    lista.insertarAlInicio(sc.nextInt());
                    lista.mostrarAdelante();
                    break;
                case 3:
                    System.out.print("Valor a eliminar: ");
                    int valorEliminar = sc.nextInt();
                    lista.eliminar(valorEliminar);
                    System.out.println("Eliminado (si existía): " + valorEliminar);
                    lista.mostrarAdelante();
                    break;
                case 4:
                    lista.mostrarAdelante();
                    break;
                case 5:
                    lista.mostrarAtras();
                    break;
                case 6:
                    System.out.print("Valor a buscar: ");
                    int valorBuscar = sc.nextInt();
                    System.out.println("¿Encontrado? " + lista.buscar(valorBuscar));
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
