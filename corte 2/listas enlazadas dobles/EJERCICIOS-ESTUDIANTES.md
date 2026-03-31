# Ejercicios de Aplicación — Listas Doblemente Enlazadas (Nivel Avanzado)

> **Instrucciones:** Resuelve los siguientes problemas del mundo real. Para cada ejercicio, debes definir una clase específica para el **NodoDoble** y una clase **ListaDoble** que gestione la estructura en ambas direcciones.

---

### 1. Sistema de Control de Versiones (Undo/Redo)
Diseña un editor de texto muy simple que guarde el historial de cambios.
- **La Clase Cambio (Nodo):** Debe contener `texto` (String) y `tipoOperacion` (String - ej: "Escribir", "Borrar").
- **El Problema:** Cada vez que el usuario escribe algo, se agrega un nodo al final. El usuario puede deshacer (retroceder al nodo anterior) y rehacer (avanzar al nodo siguiente).
- **Reto:** Implementa métodos `deshacer()` y `rehacer()` que muevan un puntero `actual` a través de la lista doble.

### 2. Carrusel de Imágenes (Galería Interactiva)
Simula el comportamiento de una galería de fotos en una aplicación móvil.
- **La Clase Fotografia (Nodo):** Debe contener `nombreArchivo` (String), `tamanoMB` (double) y `resolucion` (String).
- **El Problema:** El usuario puede avanzar a la "Siguiente Foto" o retroceder a la "Foto Anterior". Si llega al final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo lineal).
- **Reto:** Crea un método `reproducirGaleria()` que recorra toda la lista hacia adelante y luego toda la lista hacia atrás para mostrar todas las fotos.

### 3. Navegación de Pestañas de Navegador
Imagina un navegador donde puedes moverte entre pestañas abiertas.
- **La Clase Pestana (Nodo):** Debe contener `tituloPagina` (String), `url` (String) y `horaApertura` (String).
- **El Problema:** Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña actual y el foco debe pasar a la pestaña **anterior**.
- **Reto:** Implementar el método `cerrarPestanaActual(String url)` que busque la pestaña por URL, la elimine de la lista y reconecte el nodo anterior con el siguiente correctamente (¡Cuidado con la Cabeza y la Cola!).

### 4. Turnos de Consultorio Médico (Prioridad de Emergencia)
Gestiona una fila de pacientes donde algunos pueden tener emergencias.
- **La Clase Paciente (Nodo):** Debe contener `nombre` (String), `edad` (int) y `nivelUrgencia` (1 al 5).
- **El Problema:** Los pacientes normalmente se agregan al final. Pero si un paciente tiene `nivelUrgencia == 5`, debe ser movido justo después de la Cabeza.
- **Reto:** Implementa un método que recorra la lista desde la **Cola** hacia la **Cabeza** para encontrar al paciente de mayor edad y mostrar sus datos.

### 5. Reproductor de Música Premium
Mejora el ejercicio de Spotify de la semana pasada usando listas dobles.
- **La Clase Cancion (Nodo):** Debe contener `titulo` (String), `artista` (String) y `duracion` (int).
- **El Problema:** El reproductor ahora permite la función "Canción Anterior" de manera eficiente sin tener que recorrer toda la lista desde el principio.
- **Reto:** Implementa un método `saltarAtras()` que retroceda una posición y `saltarAdelante()` que avance una. Si se intenta saltar atrás desde la primera canción, debe mostrar un mensaje de error.

---

## Tips para el Desarrollo de Listas Dobles:

1.  **Doble Enlace:** Cada vez que insertes un nodo, ¡No olvides conectar **dos** flechas! (`siguiente` y `anterior`).
2.  **Caso Base:** Siempre verifica qué pasa si la lista está vacía o si solo tiene un elemento al momento de eliminar o insertar.
3.  **Uso de la Cola:** Mantener una referencia `cola` (tail) te permite insertar al final en tiempo constante (O(1)) y empezar recorridos desde atrás inmediatamente.
4.  **Dibujar:** Antes de programar un método complejo (como eliminar un nodo intermedio), dibuja los nodos y sus flechas en un papel para visualizar cómo deben quedar las nuevas conexiones.
