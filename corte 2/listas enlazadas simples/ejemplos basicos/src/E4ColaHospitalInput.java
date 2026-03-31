import java.util.Scanner;

/**
 * Ejercicio 4 (Interactivo) - Simulación de Gestión de Turnos Hospital
 * Semana 6: Listas Enlazadas Simples
 *
 * El usuario puede registrar pacientes como normales o emergencias, y ver
 * cómo el orden de la cola cambia dinámicamente según la prioridad.
 */
public class E4ColaHospitalInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaHospital cola = new ColaHospital();
        int opcion;

        System.out.println("==============================================");
        System.out.println("   Simulador de Turnos: Urgencias Médicas");
        System.out.println("==============================================");

        do {
            System.out.println("\n--- Menú de Turnos ---");
            System.out.println("1. Registrar paciente REGULAR (Cola final)");
            System.out.println("2. Registrar EMERGENCIA VITAL (Cola inicio)");
            System.out.println("3. Atender siguiente paciente");
            System.out.println("4. Mostrar cola actual");
            System.out.println("0. Cerrar sistema");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del paciente regular: ");
                    String nombreRegular = sc.nextLine();
                    cola.registrarPaciente(nombreRegular);
                    break;
                case 2:
                    System.out.print("Nombre del paciente en emergencia: ");
                    String nombreEmergencia = sc.nextLine();
                    cola.registrarEmergencia(nombreEmergencia);
                    break;
                case 3:
                    cola.atenderSiguiente();
                    break;
                case 4:
                    cola.mostrarCola();
                    break;
                case 0:
                    System.out.println("Apagando sistema de turnos...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
