# Semana 7 — Listas Doblemente Enlazadas
**Asignatura:** Estructura de Datos (IS0018SA) · UPC
**Docente:** Edinson Mauricio Mendoza Espinel
**Unidad 3:** Listas Enlazadas

---

## Tabla de Contenidos
1. [¿Qué es una Lista Doblemente Enlazada?](#1-qué-es-una-lista-doblemente-enlazada)
2. [La Anatomía del Nodo Doble](#2-la-anatomía-del-nodo-doble)
3. [Diferencias con la Lista Simple](#3-diferencias-con-la-lista-simple)
4. [Ventajas y Desventajas](#4-ventajas-y-desventajas)
5. [Operaciones Principales](#5-operaciones-principales)
6. [Implementación en Java](#6-implementación-en-java)
7. [Ejemplos de Aplicación Real](#7-ejemplos-de-aplicación-real)

---

## 1. ¿Qué es una Lista Doblemente Enlazada?
Una **Lista Doblemente Enlazada (Doubly Linked List)** es una versión más potente de la lista enlazada simple. La gran diferencia es que cada nodo no solo sabe quién es su **siguiente** compañero, sino que también sabe quién es su **anterior**.

Imagina un tren donde los vagones están enganchados de tal forma que puedes pasar del vagón A al B, pero también puedes regresar del B al A sin tener que dar toda la vuelta o empezar desde la locomotora.

![Estructura de una Lista Doble](./svg/lista_doblemente_enlazada_estructura.svg)

---

## 2. La Anatomía del Nodo Doble
En la semana anterior vimos que un nodo tenía un **dato** y un **siguiente**. Ahora, nuestro nodo tiene tres compartimentos:

1. **Prev (Anterior):** Un puntero/referencia al nodo que está antes.
2. **Dato:** La información que guardamos (número, texto, objeto).
3. **Next (Siguiente):** Un puntero/referencia al nodo que está después.

![Nodo Doble](./svg/nodo_doble.svg)

---

## 3. Diferencias con la Lista Simple

| Característica | Lista Enlazada Simple | Lista Doblemente Enlazada |
| :--- | :--- | :--- |
| **Punteros por nodo** | 1 (Siguiente) | 2 (Siguiente y Anterior) |
| **Dirección de recorrido** | Solo hacia adelante | Hacia adelante y hacia atrás |
| **Memoria** | Menor consumo | Mayor consumo (guarda un enlace extra) |
| **Eliminación de un nodo** | Requiere recorrer desde el inicio para hallar al anterior | Es inmediata si ya estás parado en el nodo a borrar |
| **Complejidad de código** | Más sencilla | Ligeramente más compleja (más enlaces que actualizar) |

---

## 4. Ventajas y Desventajas

### Ventajas ✅
- **Recorrido Bidireccional:** Puedes navegar en ambos sentidos. Útil para aplicaciones como "Atrás/Siguiente".
- **Eliminación más eficiente:** Si tienes una referencia a un nodo, puedes borrarlo sin buscar quién es su padre, porque el nodo ya sabe quién es su `prev`.
- **Flexibilidad:** Permite insertar elementos antes o después de un nodo dado con la misma facilidad.

### Desventajas ❌
- **Consumo de Memoria:** Cada nodo gasta un poco más de RAM para guardar el puntero `prev`.
- **Mantenimiento:** Al insertar o borrar, debes tener cuidado de actualizar **cuatro** enlaces en lugar de dos. Si olvidas uno, la lista se rompe.

---

## 5. Operaciones Principales

### A. Inserción al Inicio
1. Crear el nuevo nodo.
2. El `next` del nuevo nodo apunta a la `cabeza` actual.
3. El `prev` de la `cabeza` actual apunta al nuevo nodo.
4. Actualizar la `cabeza` para que sea el nuevo nodo.

![Inserción al Inicio](./svg/insercion_inicio_doble.svg)

### B. Inserción al Final
Si tenemos un puntero a la `cola (tail)`, es muy rápido:
1. Crear el nuevo nodo.
2. El `prev` del nuevo nodo apunta a la `cola`.
3. El `next` de la `cola` apunta al nuevo nodo.
4. Actualizar la `cola` para que sea el nuevo nodo.

![Inserción al Final](./svg/insercion_final_doble.svg)

### C. Eliminación
Para borrar un nodo `X`:
1. El `next` del nodo anterior a `X` debe apuntar al `next` de `X`.
2. El `prev` del nodo siguiente a `X` debe apuntar al `prev` de `X`.
3. ¡Listo! El recolector de basura de Java se encargará de borrar a `X` de la memoria.

![Eliminación de un Nodo](./svg/eliminacion_doble.svg)

---

## 6. Implementación en Java

### Clase NodoDoble
```java
public class NodoDoble {
    int dato;
    NodoDoble siguiente;
    NodoDoble anterior;

    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
```

### Clase ListaDoble
```java
public class ListaDoble {
    NodoDoble cabeza;
    NodoDoble cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    // Insertar al final (eficiente con puntero cola)
    public void insertarAlFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Recorrer hacia adelante
    public void mostrarAdelante() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Recorrer hacia atrás (¡Lo nuevo!)
    public void mostrarAtras() {
        NodoDoble actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }
}
```

---

## 7. Ejemplos de Aplicación Real

### 1. Reproductor de Música
En una lista de reproducción (Playlist), quieres poder pasar a la **siguiente** canción, pero también quieres poder regresar a la **anterior**. Una lista doblemente enlazada es la estructura perfecta para esto.

### 2. Visor de Fotos
Al abrir la galería de tu celular, deslizas a la derecha para la siguiente foto y a la izquierda para la anterior. Cada foto es un nodo en una lista doble.

### 3. El botón "Deshacer" (Undo/Redo)
Muchos editores de texto guardan los cambios en una lista. `Ctrl + Z` se mueve hacia el nodo `anterior` (estado previo) y `Ctrl + Y` se mueve hacia el nodo `siguiente` (estado recuperado).
