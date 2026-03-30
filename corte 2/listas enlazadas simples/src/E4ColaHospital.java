/**
 * Ejercicio 4 - Ejemplo de la Vida Real: Gestión de Turnos (Cola Hospital)
 * Semana 6: Listas Enlazadas Simples
 *
 * Se simula una cola de atención médica donde se pueden registrar pacientes.
 * Las emergencias se insertan al inicio de la lista, mientras que los pacientes
 * regulares se agregan al final.
 */

class NodoTurno {
    String nombrePaciente;
    boolean esEmergencia;
    NodoTurno siguiente;

    public NodoTurno(String nombrePaciente, boolean esEmergencia) {
        this.nombrePaciente = nombrePaciente;
        this.esEmergencia = esEmergencia;
        this.siguiente = null;
    }
}

class ColaHospital {
    NodoTurno primero;
    NodoTurno ultimo; // Referencia extra al último para insertar rápido al final

    public ColaHospital() {
        this.primero = null;
        this.ultimo = null;
    }

    // Registro de Emergencia (Insertar al Inicio)
    public void registrarEmergencia(String nombre) {
        NodoTurno nuevo = new NodoTurno(nombre, true);
        System.out.println("  🚨 EMERGENCIA VITAL: " + nombre);
        
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            nuevo.siguiente = primero;
            primero = nuevo; // Nueva cabeza de la cola
        }
    }

    // Registro Normal (Insertar al Final)
    public void registrarPaciente(String nombre) {
        NodoTurno nuevo = new NodoTurno(nombre, false);
        System.out.println("  🏥 Paciente regular: " + nombre);

        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo; // Enganchamos el nuevo al final
            ultimo = nuevo;           // Actualizamos quién es el último
        }
    }

    // Atender al siguiente (Eliminar al Inicio)
    public void atenderSiguiente() {
        if (primero == null) {
            System.out.println("  ❌ No hay pacientes en espera.");
            return;
        }
        
        String tipo = primero.esEmergencia ? "🚨 Emergencia" : "🏥 Regular";
        System.out.println("  👨‍⚕️ Atendiendo a (" + tipo + "): " + primero.nombrePaciente);
        
        primero = primero.siguiente; // Lo sacamos de la fila
        
        if (primero == null) {
            ultimo = null; // Si la fila quedó vacía, limpiamos el último
        }
    }

    public void mostrarCola() {
        if (primero == null) {
            System.out.println("Cola vacía.");
            return;
        }

        System.out.print("  Estado de la cola: ");
        NodoTurno temp = primero;
        while (temp != null) {
            String tag = temp.esEmergencia ? "[!]" : "";
            System.out.print(tag + temp.nombrePaciente + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}

public class E4ColaHospital {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   Simulación: Gestión de Turnos Hospital");
        System.out.println("==============================================");

        ColaHospital cola = new ColaHospital();

        // 1. Llegan algunos pacientes normales
        cola.registrarPaciente("Juan Pérez");
        cola.registrarPaciente("María López");

        // 2. Ocurre una emergencia
        cola.registrarEmergencia("Pedro Picapiedra");

        // 3. Llega otro paciente normal
        cola.registrarPaciente("Ana García");

        // 4. Mostramos la cola
        System.out.println("\nResumen de la fila:");
        cola.mostrarCola();

        // 5. Atendemos a los pacientes
        System.out.println("\nComenzando atención médica:");
        cola.atenderSiguiente(); // Atenderá a Pedro (Emergencia)
        cola.atenderSiguiente(); // Atenderá a Juan (Normal)
        
        System.out.println("\nEstado final:");
        cola.mostrarCola();
    }
}
