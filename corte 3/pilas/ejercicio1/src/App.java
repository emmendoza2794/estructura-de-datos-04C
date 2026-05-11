// 1. Puerto Marítimo (Gestión de Contenedores)
// En un puerto de carga, los contenedores se apilan en columnas verticales dentro de los barcos o en el muelle. 
// Debido al espacio restringido, solo se puede acceder al contenedor que está en la cima.

// La Clase Contenedor (Nodo): Debe contener idCodigo (String), empresa (String), peso (double) y 
// tipoCarga (String).
// El Problema: El supervisor necesita un reporte rápido de cuánta carga hay de una empresa en particular 
// sin retirar los contenedores.
// Reto: Implementa un método contarPorEmpresa(String nombreEmpresa) que recorra la pila y devuelva 
// la cantidad total de contenedores que pertenecen a esa empresa.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PilaContenedores muelle = new PilaContenedores();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        muelle.push(new Contenedor("CONT-001", "Maersk", 25.5, "Electrónicos"));
        muelle.push(new Contenedor("CONT-002", "Evergreen", 30.0, "Textiles"));
        muelle.push(new Contenedor("CONT-003", "MSC", 18.2, "Alimentos"));
        muelle.push(new Contenedor("CONT-004", "Hapag-Lloyd", 22.1, "Maquinaria"));

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE PUERTO (PILAS) ---");
            System.out.println("1. Ver contenedores en el muelle");
            System.out.println("2. Registrar nuevo contenedor (Push)");
            System.out.println("3. Retirar contenedor del tope (Pop)");
            System.out.println("4. Contar contenedores por empresa");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la pila:");
                    muelle.imprimir();
                    break;
                case 2:
                    System.out.print("ID: "); String id = scanner.nextLine();
                    System.out.print("Empresa: "); String emp = scanner.nextLine();
                    System.out.print("Peso (t): "); double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Tipo de Carga: "); String tipo = scanner.nextLine();
                    muelle.push(new Contenedor(id, emp, peso, tipo));
                    System.out.println("Contenedor apilado correctamente.");
                    break;
                case 3:
                    Contenedor retirado = muelle.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("El muelle está vacío.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la empresa a consultar: ");
                    String empresaBusqueda = scanner.nextLine();
                    int total = muelle.contarPorEmpresa(empresaBusqueda);
                    System.out.println("Resultado: Se encontraron " + total + " contenedores de la empresa " + empresaBusqueda);
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
