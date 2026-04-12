# Semana 8 — Listas Circulares
**Asignatura:** Estructura de Datos (IS0018SA) · UPC
**Docente:** Edinson Mauricio Mendoza Espinel
**Unidad 3:** Listas Enlazadas

---

## Tabla de Contenidos
1. [¿Qué es una Lista Circular?](#1-qué-es-una-lista-circular)
2. [La Anatomía del Nodo Circular](#2-la-anatomía-del-nodo-circular)
3. [Diferencias con la Lista Simple](#3-diferencias-con-la-lista-simple)
4. [Ventajas y Desventajas](#4-ventajas-y-desventajas)
5. [Operaciones Principales](#5-operaciones-principales)
6. [Implementación en Java](#6-implementación-en-java)
7. [Ejemplos de Aplicación Real](#7-ejemplos-de-aplicación-real)

---

## 1. ¿Qué es una Lista Circular?

Una **Lista Circular (Circular Linked List)** es una lista enlazada en la que el **último nodo** no apunta a `null`, sino que apunta de regreso al **primer nodo**, formando un ciclo cerrado.

Imagina una pista de carreras: los autos dan vuelta tras vuelta sin encontrar un "final". Después de la última curva, están de vuelta en la primera. Así funciona una lista circular: puedes seguir recorriéndola indefinidamente.

![Estructura de una Lista Circular](./svg/lista_circular_estructura.svg)

> **Clave:** No existe un `null` al final. El `next` del último nodo apunta a la `cabeza`.

---

## 2. La Anatomía del Nodo Circular

El nodo de una lista circular es **idéntico** al de una lista simple. La diferencia no está en el nodo, sino en cómo se conectan:

1. **Dato:** La información almacenada (número, texto, objeto).
2. **Next (Siguiente):** Apunta al siguiente nodo. En el último nodo, apunta a la `cabeza` en lugar de a `null`.

![Nodo Circular](./svg/nodo_circular.svg)

---

## 3. Diferencias con la Lista Simple

| Característica | Lista Enlazada Simple | Lista Circular |
| :--- | :--- | :--- |
| **Fin de la lista** | El `next` del último nodo es `null` | El `next` del último nodo apunta a la `cabeza` |
| **Recorrido** | Termina al encontrar `null` | Termina al volver al nodo de inicio |
| **Acceso al último nodo** | Requiere recorrer toda la lista | Si se guarda puntero a la `cola`, es inmediato |
| **Riesgo** | Bajo (el `null` detiene el recorrido) | Alto: un bucle mal escrito puede ser infinito |
| **Casos de uso** | Listas finitas, pilas, colas | Turnos, buffers, reproductores en bucle |

---

## 4. Ventajas y Desventajas

### Ventajas
- **Sin extremos:** Desde cualquier nodo puedes alcanzar cualquier otro nodo siguiendo los enlaces.
- **Eficiencia en colas circulares:** Ideal para implementar buffers de tamaño fijo donde el espacio se reutiliza.
- **Rotación natural:** Perfecta para sistemas por turnos, como un juego de mesa donde el turno pasa de jugador en jugador.

### Desventajas
- **Riesgo de bucle infinito:** Si no se controla la condición de parada en el recorrido, el programa nunca termina.
- **Detección del fin:** Se necesita una condición explícita para saber cuándo hemos dado la vuelta completa (volver al nodo inicial).
- **Depuración más compleja:** Es más difícil de visualizar y depurar que una lista con `null` al final.

---

## 5. Operaciones Principales

### A. Inserción al Inicio
1. Crear el nuevo nodo.
2. El `next` del nuevo nodo apunta a la `cabeza` actual.
3. Recorrer la lista hasta el **último nodo** (aquel cuyo `next` es la `cabeza`).
4. El `next` del último nodo apunta al nuevo nodo.
5. Actualizar `cabeza` para que sea el nuevo nodo.

> **Truco:** Si guardas un puntero a la `cola`, el paso 3 es innecesario: `cola.next` siempre es la `cabeza`.

![Inserción al Inicio](./svg/insercion_inicio_circular.svg)

### B. Inserción al Final
1. Crear el nuevo nodo.
2. Si la lista está vacía: el nuevo nodo se apunta a sí mismo y se convierte en `cabeza`.
3. Si no está vacía:
   - El `next` del nuevo nodo apunta a la `cabeza`.
   - El `next` de la `cola` apunta al nuevo nodo.
   - Actualizar `cola` para que sea el nuevo nodo.

![Inserción al Final](./svg/insercion_final_circular.svg)

### C. Eliminación de un Nodo
Para borrar un nodo con un valor dado:
1. Si la lista está vacía, no hay nada que hacer.
2. Si el nodo a borrar es la `cabeza`:
   - El `next` de la `cola` apunta al siguiente de la `cabeza`.
   - Actualizar `cabeza` al siguiente nodo.
3. Si el nodo está en otro lugar:
   - Recorrer la lista hasta encontrar el nodo **anterior** al que se quiere borrar.
   - El `next` del anterior apunta al `next` del nodo a borrar.

![Eliminación de un Nodo](./svg/eliminacion_circular.svg)

### D. Recorrido
La condición de parada **no es `null`**, sino haber vuelto al nodo de inicio:

```java
NodoSimple actual = cabeza;
do {
    System.out.print(actual.dato + " -> ");
    actual = actual.siguiente;
} while (actual != cabeza);
System.out.println("(cabeza)");
```

Se usa un bucle `do-while` para garantizar que el primer nodo también se procesa.

---

## 6. Implementación en Java

### Clase NodoSimple
```java
public class NodoSimple {
    int dato;
    NodoSimple siguiente;

    public NodoSimple(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
```

### Clase ListaCircular
```java
public class ListaCircular {
    NodoSimple cabeza;
    NodoSimple cola;

    public ListaCircular() {
        this.cabeza = null;
        this.cola = null;
    }

    // Insertar al final
    public void insertarAlFinal(int dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        if (cabeza == null) {
            // Lista vacía: el nodo se apunta a sí mismo
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    // Insertar al inicio
    public void insertarAlInicio(int dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            nuevo.siguiente = cabeza;
            cola.siguiente = nuevo; // el ultimo sigue apuntando a la nueva cabeza
            cabeza = nuevo;
        }
    }

    // Eliminar un nodo por valor
    public void eliminar(int valor) {
        if (cabeza == null) return;

        // Caso: el nodo a borrar es la cabeza
        if (cabeza.dato == valor) {
            if (cabeza == cola) {
                // Era el único nodo
                cabeza = null;
                cola = null;
            } else {
                cabeza = cabeza.siguiente;
                cola.siguiente = cabeza;
            }
            return;
        }

        // Caso: el nodo está en el interior o es la cola
        NodoSimple anterior = cabeza;
        NodoSimple actual = cabeza.siguiente;
        while (actual != cabeza) {
            if (actual.dato == valor) {
                anterior.siguiente = actual.siguiente;
                if (actual == cola) {
                    cola = anterior;
                }
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    }

    // Recorrer e imprimir la lista
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        NodoSimple actual = cabeza;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(cabeza)");
    }
}
```

---

## 7. Ejemplos de Aplicación Real

### 1. Turno de Jugadores en un Juego de Mesa
En un juego como el parchís o el ajedrez por turnos, los jugadores se organizan en un ciclo. Cuando llega el turno del último jugador, el siguiente en jugar es el primero. Una lista circular representa esto de forma natural: basta con avanzar `actual = actual.siguiente` para pasar al siguiente jugador, y al llegar al último, el enlace nos devuelve automáticamente al primero.

### 2. Buffer Circular (Ring Buffer)
En sistemas de audio o video en tiempo real, los datos se escriben en un buffer circular. Cuando el escritor llega al final del buffer, vuelve al inicio y sobreescribe los datos más antiguos. Es una técnica fundamental en sistemas embebidos y de streaming.

### 3. Programación por Turnos del Sistema Operativo (Round Robin)
Los sistemas operativos modernos usan el algoritmo **Round Robin** para gestionar los procesos que acceden a la CPU. Cada proceso recibe un pequeño intervalo de tiempo (quantum). Al terminar, cede el paso al siguiente proceso de la lista circular, garantizando que todos los procesos sean atendidos de forma justa.
