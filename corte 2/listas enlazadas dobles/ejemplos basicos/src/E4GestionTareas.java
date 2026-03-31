/**
 * Ejemplo 4: Gestión de Tareas (Caso de Aplicación)
 * En una lista doble, podemos movernos fácilmente entre tareas.
 */
class Tarea {
    String nombre;
    Tarea siguiente, anterior;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }
}

class ListaTareas {
    Tarea cabeza, cola;

    public void agregarTarea(String nombre) {
        Tarea nueva = new Tarea(nombre);
        if (cabeza == null) {
            cabeza = cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public void mostrarTareas() {
        Tarea actual = cabeza;
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". " + actual.nombre);
            actual = actual.siguiente;
            i++;
        }
    }
}

public class E4GestionTareas {
    public static void main(String[] args) {
        ListaTareas misTareas = new ListaTareas();
        misTareas.agregarTarea("Estudiar Listas Simples");
        misTareas.agregarTarea("Estudiar Listas Dobles");
        misTareas.agregarTarea("Hacer el proyecto de Corte 2");

        System.out.println("Mis Tareas Pendientes:");
        misTareas.mostrarTareas();
    }
}
