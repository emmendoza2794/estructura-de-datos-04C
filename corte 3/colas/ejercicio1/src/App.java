/* 1. Centro de Llamadas (Atención al Cliente)
Una empresa de telecomunicaciones recibe cientos de llamadas al día. Cuando todos los agentes están ocupados, 
las llamadas entrantes se ponen en espera formando una fila virtual. La primera llamada en esperar 
es la primera en ser atendida por el próximo agente disponible. Cada llamada se clasifica 
según su motivo: "Facturación", "Soporte Técnico", "Cancelación" o "Información".

La Clase Llamada (Nodo): Debe contener idLlamada (String), nombreCliente (String), motivoConsulta (String) 
y duracionEstimadaMinutos (int).
El Problema: El supervisor necesita saber cuántas llamadas en espera corresponden a un motivo específico, 
para decidir si activa agentes especializados.
Reto: Implementa un método contarPorMotivo(String motivo) que recorra la cola y devuelva la cantidad de 
llamadas cuyo motivoConsulta coincida con el parámetro recibido, sin modificar la cola. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       ColaLlamadas llamadas = new ColaLlamadas();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        llamadas.enqueue(new Llamada(1, "Juan Perez", "Facturacion", 5));
        llamadas.enqueue(new Llamada(2, "Maria Gomez", "Soporte Tecnico", 10));
        llamadas.enqueue(new Llamada(3, "Carlos Ruiz", "Cancelacion", 3));
        llamadas.enqueue(new Llamada(4, "Ana Torres", "Informacion", 2));
        llamadas.enqueue(new Llamada(5, "Luis Fernandez", "Facturacion", 4));
        llamadas.enqueue(new Llamada(6, "Sofia Martinez", "Soporte Tecnico", 8));

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE LLAMADAS (COLAS) ---");
            System.out.println("1. Ver llamadas en espera");
            System.out.println("2. Registrar nueva llamada (Enqueue)");
            System.out.println("3. Atender llamada (Dequeue)");
            System.out.println("4. Contar llamadas por motivo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la cola:");
                    llamadas.imprimir();
                    break;
                case 2:
                    System.out.print("ID: "); int id = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Nombre del cliente: "); String nombre = scanner.nextLine();
                    System.out.print("Motivo de la llamada: "); String motivo = scanner.nextLine();
                    System.out.print("Duración estimada (minutos): "); int duracion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    llamadas.enqueue(new Llamada(id, nombre, motivo, duracion));
                    System.out.println("Llamada registrada correctamente.");
                    break;
                case 3:
                    Llamada atendida = llamadas.dequeue();
                    if (atendida != null) {
                        System.out.println("\nLlamada atendida:");
                        System.out.println(atendida.idLlamada + " " + atendida.nombreCliente + " (Motivo: " + atendida.motivoConsulta + ")" + " [" + atendida.duracionEstimadaMinutos + " min]");
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el motivo de la llamada a consultar: ");
                    String motivoBusqueda = scanner.nextLine();
                    int total = llamadas.contarPorMotivo(motivoBusqueda);
                    System.out.println("Resultado: Se encontraron " + total + " llamadas con el motivo " + motivoBusqueda);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
