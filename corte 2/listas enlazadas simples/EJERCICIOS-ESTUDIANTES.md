# Ejercicios de Aplicación — Listas Enlazadas Simples (Nivel Avanzado)

> **Instrucciones:** Resuelve los siguientes problemas del mundo real. Para cada ejercicio, debes definir una clase específica para el **Nodo** que contenga múltiples atributos y una clase **ListaEnlazada** que administre la estructura.

---

### 1. El Tren de Carga (Logística Ferroviaria)
Diseña un sistema para gestionar los vagones de un tren de carga internacional.
- **La Clase Vagon (Nodo):** Debe contener `contenido` (String), `pesoToneladas` (double), `origen` (String) y `destino` (String).
- **El Problema:** El tren sale de una estación y se le van enganchando vagones al final. 
- **Reto:** Implementa un método que recorra el tren y calcule el **peso total** de toda la carga transportada.

### 2. Inventario de Alimentos (Control de Caducidad)
Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben colocarse al principio para ser vendidos primero.
- **La Clase Producto (Nodo):** Debe contener `nombre` (String), `cantidad` (int) y `diasParaVencer` (int).
- **El Problema:** Si llega un producto que vence en menos de 3 días, debe insertarse al **inicio** de la lista (prioridad de venta). Si vence en más tiempo, se pone al final.
- **Reto:** Crea un método que imprima solo los productos que tienen menos de 5 días para vencer.

### 3. Torre de Control (Aterrizajes de Emergencia)
Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.
- **La Clase Vuelo (Nodo):** Debe contener `numeroVuelo` (String), `aerolinea` (String), `combustibleRestante` (int) y `pasajeros` (int).
- **El Problema:** Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta menos de 10 unidades de combustible, debe ser movido inmediatamente al **inicio** de la lista (Cabeza).
- **Reto:** Implementar el método `reportarEmergencia(String numeroVuelo)` que busque un vuelo en la cola y lo mueva al principio.

### 4. Monitoreo Industrial (Sensores en Tiempo Real)
Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.
- **La Clase Lectura (Nodo):** Debe contener `idSensor` (int), `temperatura` (double), `presion` (double) y `hora` (String).
- **El Problema:** Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
- **Reto:** Implementa un método que busque y muestre la lectura con la **temperatura más alta** registrada en el historial.

### 5. Spotify Lite (Lista de Reproducción)
Crea un reproductor de música simplificado que gestione una lista de canciones.
- **La Clase Cancion (Nodo):** Debe contener `titulo` (String), `artista` (String), `duracionSegundos` (int) y `genero` (String).
- **El Problema:** El usuario puede agregar canciones "A continuación" (insertar después de la actual) o "Al final de la cola".
- **Reto:** Implementa un método que sume la duración de todas las canciones y muestre el tiempo total de la lista en formato `MM:SS`.

---

## Tips para el Desarrollo:

1.  **Constructores Completos:** Asegúrate de que el constructor de tu Nodo reciba todos los datos (peso, origen, etc.) al momento de crearlo.
2.  **Visualización:** Al imprimir la lista, no muestres solo un dato. Haz un formato limpio, por ejemplo: `[Trigo | 50t | Bogotá -> Medellín] -> ...`
3.  **Variables Auxiliares:** Para el ejercicio del Tren o de Spotify, necesitarás variables `acumuladoras` (como `totalPeso` o `totalTiempo`) mientras recorres la lista con el `while`.
