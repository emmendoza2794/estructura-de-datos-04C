# Semana 6 — Introducción a Listas Enlazadas Simples
**Asignatura:** Estructura de Datos (IS0018SA) · UPC
**Docente:** Edinson Mauricio Mendoza Espinel
**Unidad 3:** Listas Enlazadas

---

## Tabla de Contenidos
1. [¿Qué es una Lista Enlazada?](#1-qué-es-una-lista-enlazada)
2. [Estructura Básica: El Nodo](#2-estructura-básica-el-nodo)
3. [¿Qué es la "Cabeza" y cómo se llena la lista?](#3-qué-es-la-cabeza-y-cómo-se-llena-la-lista)
4. [Arreglos vs Listas Enlazadas](#4-arreglos-vs-listas-enlazadas)
5. [¿Es lo mismo un "List" común que una "LinkedList"?](#5-es-lo-mismo-un-list-común-que-una-linkedlist)
6. [Ventajas y Desventajas (Pros y Contras)](#6-ventajas-y-desventajas-pros-y-contras)
7. [Casos de Uso de las Listas Enlazadas](#7-casos-de-uso-de-las-listas-enlazadas)
8. [Operaciones Básicas en Listas Enlazadas Simples](#8-operaciones-básicas-en-listas-enlazadas-simples)
9. [Implementación Inicial en Java](#9-implementación-inicial-en-java)
10. [Ejemplos de la Vida Real (Con Código en Java)](#10-ejemplos-de-la-vida-real-con-código-en-java)

---

## 1. ¿Qué es una Lista Enlazada?
Una lista enlazada (Linked List) es una estructura de datos lineal y dinámica, en la que los elementos no están pegados unos junto a otros en la memoria. En su lugar, cada elemento se guarda en un espacio diferente y apunta al siguiente mediante un "hilo" o puntero, formando una cadena.

### Características:
- **Tamaño dinámico:** Crece y se reduce sin problemas mientras el programa se está ejecutando.
- **Inserción y eliminación rápida:** No tienes que empujar o mover los demás elementos para hacer espacio (como ocurre en los arreglos).
- **Acceso secuencial (paso a paso):** Si quieres ver al elemento en la posición 5, tienes que empezar desde el principio y saltar nodo por nodo hasta llegar al quinto. No puedes ir directamente a él.

---

## 2. Estructura Básica: El Nodo
La pieza fundamental de una lista enlazada es el **Nodo**. Imagina un nodo como un pequeño vagón de tren que tiene dos partes:
1. **El Dato:** La información útil que quieres guardar (un número, un nombre, etc.).
2. **El Puntero al siguiente:** Un enlace o dirección que indica dónde está el próximo vagón (nodo).

El último nodo de la lista tiene un enlace que apunta a "nada" (`null`), indicando que ahí termina la cadena.

![Estructura de una Lista Enlazada](./svg/lista_enlazada_estructura.svg)

---

## 3. ¿Qué es la "Cabeza" y cómo se llena la lista?

### La "Cabeza" (El principio del tren)
La **Cabeza (Head)** está siempre al **PRINCIPIO** de la lista. Podríamos decir que es la "locomotora" de nuestro tren. 
En una lista enlazada, la única forma de no perder nuestro tren completo es sujetando firmemente la "cabeza". 
- Tú solo tienes agarrada la Cabeza.
- La Cabeza sabe dónde está el 2º nodo.
- El 2º nodo sabe dónde está el 3º.
- Y así sucesivamente hasta que el último apunta a `null` (el final del tren).

Si sueltas (pierdes) la cabeza, ¡pierdes todo el tren porque no tienes forma de encontrar los demás vagones!

### ¿Cómo se le meten datos a la lista?
A diferencia de los arreglos donde pones algo en la "posición 3", en la lista enlazada principalmente tienes dos formas de llenarla:

**Opción A: Llenarla "empujando" al principio (Insertar al inicio)**
Esta es la forma más rápida y fácil. Imagina que ya tienes una lista: `[20] -> [30]`. El `20` es tu Cabeza. Llega un nuevo dato, el `10`:
1. Creamos el nuevo vagón con el `10`.
2. Le decimos al `10`: *"Oye, engánchate a la Cabeza actual (el 20)"*.
3. Oficialmente nombramos al `10` como nuestra **NUEVA Cabeza**.
*Resultado visual:* `[10] -> [20] -> [30] -> null`. (El dato más nuevo queda de primero).

**Opción B: Llenarla formándose en la fila (Insertar al final)**
Tienes la misma lista `[10] -> [20] -> [30]`. El `10` es la Cabeza. Llega el número `40` y quiere ir al final:
1. Creamos el nuevo vagón con el `40`.
2. Le preguntamos a la Cabeza (el 10): *"¿Eres el último?"* (No, mi siguiente es el 20).
3. Caminamos al 20: *"¿Eres el último?"* (No, mi siguiente es el 30).
4. Caminamos al 30: *"¿Eres el último?"* (Sí, porque mi siguiente es `null`).
5. Le decimos al 30: *"Engánchate al nuevo vagón 40"*.
*Resultado visual:* `[10] -> [20] -> [30] -> [40] -> null`.

---

## 4. Arreglos vs Listas Enlazadas

![Arreglo vs Lista Enlazada](./svg/array_vs_lista.svg)

| Característica | Arreglos (Arrays) | Listas Enlazadas |
|---|---|---|
| **Memoria** | Todo está pegado y seguido (bloque contiguo). El tamaño suele ser fijo. | Cada elemento está disperso, unido solo por punteros. |
| **Cómo accedes a un dato** | Inmediato (Ejemplo: `arr[5]`). Vas directo a la posición. | Lento. Tienes que recorrer los nodos uno por uno desde el principio. |
| **Insertar / Borrar en el medio** | Lento. Tienes que mover y empujar a todos los elementos que están después para hacer espacio. | Muy rápido. Solo tienes que desconectar el puntero y conectarlo al nuevo nodo, como desenganchar un vagón. |
| **Uso de memoria** | Menor. Solo guarda el dato. | Mayor. Guarda el dato y, además, guarda la flecha/puntero. |

---

## 5. ¿Es lo mismo un "List" común que una "LinkedList"?
**No, no son lo mismo y es un error muy común confundirlos.**

En lenguajes como Java (con `List<T>` o `ArrayList`), C# o las listas normales de Python (ej: `mi_lista = [1, 2, 3]`), el lenguaje internamente **no está usando nodos**. Está usando un **Arreglo Dinámico**. 

- **¿Qué es un Arreglo Dinámico (ArrayList)?** Es un arreglo normal con el superpoder de hacerse más grande. Si se llena, la computadora crea un arreglo nuevo del doble de tamaño en secreto, copia todos los datos viejos, y borra el viejo.
- **¿Qué es una Lista Enlazada (LinkedList)?** Es la estructura de nodos que estamos estudiando, que se enganchan unos con otros. Nunca se "llena" ni tiene que copiar todos sus datos a otro lado.

![Arreglo Dinámico vs Lista Enlazada](./svg/list_vs_linkedlist.svg)

Si quieres usar la estructura de nodos que estamos aprendiendo en Java, debes usar explícitamente `new LinkedList<>()`, no el tradicional `ArrayList`.

---

## 6. Ventajas y Desventajas (Pros y Contras)

### Pros (Ventajas) ✅
- **Tamaño Flexible:** Puedes agregar elementos indefinidamente sin preocuparte por llenarla.
- **Inserción y Eliminación Rápida:** Especialmente útil si necesitas meter y sacar datos constantemente al principio o en el medio de la información.
- **No desperdicia memoria en espacios vacíos:** Solo usas la memoria exacta para la cantidad de nodos que crees. Un arreglo a veces reserva 100 espacios aunque solo uses 2.

### Contras (Desventajas) ❌
- **Buscar es lento:** No puedes saltar directamente al elemento número 100. Tienes que caminar por los primeros 99 nodos para encontrarlo.
- **Ocupa un poco más de espacio por dato:** Cada dato requiere espacio extra para guardar la flechita (`puntero`) al siguiente compañero.
- **Solo vas hacia adelante:** En una lista enlazada *simple*, solo puedes ir de la cabeza hacia la cola, no hay manera de retroceder.

---

## 7. Casos de Uso de las Listas Enlazadas
¿Cuándo deberías elegir una Lista Enlazada en lugar de un Arreglo común?
- Cuando no tienes ni idea de cuántos elementos vas a necesitar guardar y el número cambia todo el tiempo.
- Cuando tu programa necesita hacer muchísimas inserciones o eliminaciones.
- Sirven como los bloques de construcción para estructuras de datos más avanzadas, como **Pilas (Stacks)** o **Colas (Queues)**.
- El sistema operativo de tu computadora usa listas enlazadas internamente para saber qué partes de tu memoria RAM están libres.

---

## 8. Operaciones Básicas en Listas Enlazadas Simples

### 1. Inserción (Agregar datos)
- **Al principio (Cabeza):** Muy rápido. Solo creas el nodo y lo enlazas.
- **Al final (Cola):** Lento si solo tienes la Cabeza (tienes que recorrer todo). Rápido si guardas un puntero extra que siempre apunte al último nodo.
- **En el medio:** Rápido una vez que encuentras la posición. Solo desconectas y vuelves a conectar los punteros.

### 2. Eliminación (Borrar datos)
- **Al principio:** Súper rápido. Solo dices "la nueva cabeza es el segundo nodo" y listo.
- **Al final o en el medio:** Tienes que caminar por la lista hasta encontrar el nodo anterior al que quieres borrar, para poder "puentearlo" (hacer que el anterior apunte al siguiente del que vas a borrar).

### 3. Búsqueda (¿Cómo se busca algo?)
- **Búsqueda Lineal:** La única forma de buscar en una lista enlazada simple es empezar por la Cabeza e ir preguntando vagón por vagón: *"¿Tienes el número que busco?"*. 
- **⚠️ Advertencia (No se puede Búsqueda Binaria):** A diferencia de los arreglos, **NO** puedes hacer una Búsqueda Binaria (partir a la mitad) porque no puedes saltar al medio de la lista mágicamente. Tienes que recorrerla paso a paso.

### 4. Recorrido (Traversal)
- Consiste en visitar todos los nodos desde el primero hasta el último (`null`). Generalmente se usa para imprimir toda la lista en pantalla o sumar todos los valores.

### 🤔 ¿Las Listas Enlazadas están diseñadas para ordenarse?
**La respuesta corta es: NO.** 
Las listas enlazadas no son buenas amigas de los algoritmos de ordenamiento convencionales. 
- Algoritmos rápidos como *QuickSort* dependen de poder saltar de un lado a otro del arreglo instantáneamente (acceso por índice).
- Si necesitas mantener datos ordenados constantemente o hacer muchas búsquedas rápidas, un **Arreglo (Array)** o un **Árbol (Tree)** es una opción mucho mejor. 
- *Excepción:* El algoritmo *Merge Sort* (Ordenamiento por mezcla) es el único que se lleva decentemente bien con las listas enlazadas, ya que no requiere saltar por índices.

---

## 9. Implementación Inicial en Java

### Creación de la clase Nodo
Primero, necesitamos definir la clase que representará a cada "vagón" (elemento) de nuestra lista.

```java
public class Nodo {
    int dato;       // El valor guardado en el nodo
    Nodo siguiente; // La flecha/referencia al siguiente nodo

    // Constructor para preparar el nodo cuando lo creamos
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null; // Al nacer, no apunta a nada
    }
}
```

### Creación de la clase ListaEnlazada
Ahora creamos la estructura que administrará y unirá los nodos. Solo necesitamos recordar siempre quién es el primer elemento (la cabeza).

```java
public class ListaEnlazada {
    Nodo cabeza; // Referencia al primer nodo de la lista

    public ListaEnlazada() {
        this.cabeza = null; // Al principio la lista está vacía
    }

    // Método para insertar un nodo al principio de manera inmediata
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza; // El nuevo nodo abraza a la antigua cabeza
        cabeza = nuevoNodo;           // Ahora el nuevo nodo es el primero
    }

    // Método para imprimir la lista (requiere recorrer uno por uno)
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente; // Avanzamos al siguiente nodo
        }
        System.out.println("null"); // Llegamos al final
    }
}
```

---

## 10. Ejemplos de la Vida Real (Con Código en Java)

### Ejemplo 1: Historial de Navegador Web
Cuando visitas páginas en internet, las más nuevas se colocan arriba de todo. Al presionar "Atrás", vas a la página anterior. Una lista enlazada es ideal para esto.

```java
class NodoPagina {
    String url;
    NodoPagina siguiente;

    public NodoPagina(String url) {
        this.url = url;
        this.siguiente = null;
    }
}

public class HistorialNavegador {
    NodoPagina paginaActual; // Funciona como la "cabeza" de la lista

    public HistorialNavegador() {
        this.paginaActual = null;
    }

    // Visitar una nueva página es insertarla al inicio de la lista
    public void visitarPagina(String url) {
        NodoPagina nuevaPagina = new NodoPagina(url);
        nuevaPagina.siguiente = paginaActual;
        paginaActual = nuevaPagina;
        System.out.println("Visitando: " + url);
    }

    // Presionar "Atrás" es eliminar el primer nodo y regresar al siguiente
    public void irAtras() {
        if (paginaActual != null && paginaActual.siguiente != null) {
            System.out.println("Regresando de " + paginaActual.url + " a " + paginaActual.siguiente.url);
            paginaActual = paginaActual.siguiente; // Desconectamos la actual
        } else {
            System.out.println("No hay más páginas en el historial.");
        }
    }
    
    public void mostrarActual() {
        if(paginaActual != null) {
            System.out.println("Actualmente en: " + paginaActual.url);
        }
    }
}
```

### Ejemplo 2: Gestión de Turnos (Como Urgencias Médicas)
Los pacientes llegan y hacen fila. De pronto, puede llegar un paciente en "Emergencia Vital" que debe ser atendido de inmediato. Usando listas enlazadas, podemos insertarlo de primero en la fila al instante, sin tener que empujar a las otras 50 personas hacia atrás.

```java
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

public class ColaHospital {
    NodoTurno primero;
    NodoTurno ultimo; // Recordamos también al último para que agregar a la fila sea rápido

    // Si llega una emergencia, lo ponemos de primero en la fila inmediatamente
    public void registrarEmergenciaVital(String paciente) {
        NodoTurno nuevo = new NodoTurno(paciente, true);
        System.out.println("🚨 EMERGENCIA VITAL: Ingresando a " + paciente + " de inmediato.");
        
        if (primero == null) {
            primero = ultimo = nuevo; // Si no había nadie
        } else {
            nuevo.siguiente = primero;
            primero = nuevo; // Cambiamos la cabeza de la fila
        }
    }

    // Paciente normal (lo agregamos al final de la fila rápidamente)
    public void registrarPacienteNormal(String paciente) {
        NodoTurno nuevo = new NodoTurno(paciente, false);
        System.out.println("🏥 Paciente regular ingresado a la cola: " + paciente);
        
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo; // Actualizamos quién es el último
        }
    }

    // Atendemos al que esté de primero
    public void atenderSiguiente() {
        if (primero == null) {
            System.out.println("No hay pacientes por atender.");
            return;
        }
        System.out.println("👨‍⚕️ Atendiendo a: " + primero.nombrePaciente);
        primero = primero.siguiente; // Lo sacamos de la fila
        if (primero == null) {
            ultimo = null; // Si ya se vació la fila
        }
    }
}
```