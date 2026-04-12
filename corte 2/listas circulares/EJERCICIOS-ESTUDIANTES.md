# Ejercicios de Aplicación — Listas Circulares (Nivel Avanzado)

> **Instrucciones:** Resuelve los siguientes problemas del mundo real. Para cada ejercicio, debes definir una clase específica para el **Nodo** con los atributos indicados y una clase que gestione la **Lista Circular**. Recuerda siempre cerrar el ciclo: `cola.siguiente == cabeza`.

---

### 1. Ruleta de Sorteos (Sistema de Rifa Digital)
Una empresa organiza una rifa y quiere un sistema que "gire" la rueda de participantes hasta detenerse en un ganador.
- **La Clase Participante (Nodo):** Debe contener `nombre` (String), `numeroBoleta` (int) y `ciudad` (String).
- **El Problema:** Los participantes se registran en orden de llegada formando un ciclo. Para realizar el sorteo, el sistema avanza un número aleatorio de posiciones desde la cabeza y el participante en el que se detiene es el ganador.
- **Reto:** Implementa el método `realizarSorteo(int pasos)` que avance `pasos` posiciones desde la cabeza y muestre el nombre y número de boleta del participante seleccionado. Luego, **elimina al ganador** de la lista para que no pueda ganar de nuevo, y muestra la lista actualizada.

---

### 2. Carrusel de Anuncios (Pantalla Digital)
Una tienda tiene una pantalla que muestra anuncios en rotación continua. Cuando termina el último anuncio, vuelve automáticamente al primero.
- **La Clase Anuncio (Nodo):** Debe contener `titulo` (String), `duracionSegundos` (int), `vecesRepetido` (int) y `categoria` (String - ej: "Oferta", "Marca", "Evento").
- **El Problema:** La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el anuncio que más veces se ha repetido.
- **Reto:** Implementa el método `reproducir(int ciclos)` que simule `ciclos` pasadas completas por todos los anuncios, incrementando `vecesRepetido` en cada paso e imprimiendo qué anuncio está en pantalla. Al finalizar, muestra el anuncio más repetido y el **tiempo total acumulado** en pantalla.

---

### 3. Planificador de CPU (Algoritmo Round Robin)
Los sistemas operativos usan el algoritmo Round Robin para repartir el tiempo del procesador entre varios procesos de forma justa: cada proceso recibe un pequeño intervalo de tiempo llamado **quantum**. Si no termina, espera su siguiente turno.
- **La Clase Proceso (Nodo):** Debe contener `nombre` (String), `pid` (int), `tiempoRestante` (int) y `prioridad` (int - del 1 al 3).
- **El Problema:** El planificador debe recorrer la lista circular en bucle. En cada turno, descuenta el `quantum` del `tiempoRestante` del proceso actual. Cuando `tiempoRestante <= 0`, el proceso **termina y se elimina** de la lista.
- **Reto:** Implementa el método `ejecutar(int quantum)` que simule el planificador. Imprime en cada turno cuál proceso se está ejecutando, cuánto tiempo le queda y si terminó. El ciclo debe terminar cuando la lista quede vacía. Al final, imprime el **orden en que terminaron** los procesos.

---

### 4. Gestión de Mesas en Restaurante (Lista de Espera Circular)
Un restaurante popular tiene un sistema de lista de espera. Cuando una mesa se libera, el siguiente grupo en espera ocupa el turno y pasa al final del ciclo por si quiere pedir la carta nuevamente (para clientes VIP).
- **La Clase Grupo (Nodo):** Debe contener `nombreReserva` (String), `numeroDPersonas` (int), `esVip` (boolean) y `minutosEsperando` (int).
- **El Problema:** Los grupos normales se atienden y salen de la lista. Los grupos VIP, al ser atendidos, vuelven al final de la lista circular para una segunda ronda de atención. El sistema debe atender un grupo por turno.
- **Reto:** Implementa el método `atenderSiguiente()` que tome el grupo de la cabeza, muestre su información, y si `esVip == true`, lo **reinserté al final**; si no, lo elimine. Muestra el estado de la lista después de cada atención. Llama al método 6 veces para simular la dinámica del restaurante.

---

### 5. Torneo de Fútbol (Fixture Round Robin)
En un torneo de fútbol por todos contra todos, cada equipo debe enfrentarse exactamente una vez contra cada uno de los demás equipos. El algoritmo Round Robin fija los partidos rotando los equipos en un ciclo.
- **La Clase Equipo (Nodo):** Debe contener `nombre` (String), `ciudad` (String), `puntos` (int) y `golesFavor` (int).
- **El Problema:** El fixture se genera rotando la lista: en cada jornada, se enfrentan los equipos opuestos del ciclo (el primero con el último, el segundo con el penúltimo, etc.). Un equipo queda fijo (la cabeza) y el resto rota una posición hacia adelante en cada jornada.
- **Reto:** Implementa el método `generarFixture()` que imprima todos los partidos de una jornada completa para 6 equipos (3 partidos por jornada). Luego, rota los equipos una posición y repite hasta que todos se hayan enfrentado. Al final, imprime la **tabla de posiciones** ordenando los equipos de mayor a menor puntaje (puedes asignar puntos aleatorios o fijos para la simulación).

---

## Tips para el Desarrollo de Listas Circulares:

1. **Condición de parada:** Nunca uses `while (actual != null)`. En una lista circular siempre terminarás en `do { ... } while (actual != cabeza)` o con un contador de nodos recorridos.
2. **Eliminar mientras recorres:** Si necesitas eliminar nodos durante un recorrido (como en Round Robin), guarda siempre la referencia al nodo **anterior** para poder reconectar la lista sin romper el ciclo.
3. **Lista de un solo nodo:** Cuando quede un único nodo, su `siguiente` debe apuntarse a sí mismo. Verifica este caso antes de eliminar para no dejar referencias colgantes.
4. **Puntero a la cola:** Mantener `cola` actualizado te permite insertar al final en O(1). Si al eliminar o insertar olvidas actualizar `cola`, la invariante `cola.siguiente == cabeza` se romperá.
5. **Dibujar antes de codificar:** Para los ejercicios de rotación (Torneo, Round Robin), dibuja los nodos en círculo y traza las flechas antes de escribir código. Un diagrama de 5 minutos evita 2 horas de depuración.
