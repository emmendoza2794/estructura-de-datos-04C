# Retos de la Vida Real: Listas Doblemente Enlazadas 🛠️

Estos ejercicios simulan situaciones del mundo profesional donde las listas dobles permiten gestionar procesos que cambian de dirección o necesitan reestructurarse rápidamente.

---

### Reto 1: Logística de Trenes (El Desacople de Vagones)
En el mundo ferroviario, un tren de carga puede necesitar dividirse en dos en medio de una estación para tomar rutas distintas.

- **El Escenario:** Tienes una `ListaDoble` que representa un tren. Cada nodo es un `Vagon` con un `id` y un `tipoCarga`.
- **El Reto:** Implementa el método `dividirTren(String vagonID)`:
    1. Debes buscar el vagón con ese ID.
    2. A partir de ese vagón (inclusive), el tren se "parte".
    3. El método debe devolver una **nueva** `ListaDoble` que contenga todos los vagones que estaban desde el punto de ruptura hacia atrás.
    4. La lista original debe quedar recortada correctamente, con su nueva `Cola` y sus punteros finales en `null`.
- **¿Por qué lista doble?** Porque al encontrar el punto de ruptura, necesitas actualizar el `siguiente` del vagón anterior y el `anterior` del vagón actual de forma inmediata.

### Reto 2: Editor de Capas de Diseño (Photoshop/Canva)
En los programas de diseño, los objetos están uno encima de otro. El orden en la lista determina qué objeto tapa a cuál (el "Z-Order").

- **El Escenario:** Cada `Capa` (nodo) tiene un `nombre` y un `color`. La `Cabeza` es la capa que está más al fondo y la `Cola` es la que está al frente (la que el usuario ve primero).
- **El Reto:** Implementa los métodos:
    - `enviarAlFondo(String nombre)`: Busca la capa y muévela para que sea la nueva `Cabeza`.
    - `traerAlFrente(String nombre)`: Busca la capa y muévela para que sea la nueva `Cola`.
- **Restricción:** No puedes simplemente cambiar los nombres de los nodos. Debes **desconectar el nodo físicamente** de donde esté y volverlo a conectar en el extremo correspondiente, asegurando que los vecinos que dejó atrás ahora se conecten entre sí.

### Reto 3: Transferencia de Pedidos (Apps de Delivery)
Imagina una app como Rappi o Uber Eats donde un repartidor sufre un percance y debe transferir sus pedidos pendientes a otro compañero que está cerca.

- **El Escenario:** Tienes dos objetos `ListaDoble`: `repartidorA` y `repartidorB`. Cada nodo es un `Pedido` con una `direccion` y `distanciaKm`.
- **El Reto:** Implementa el método `transferirTodo(ListaDoble origen, ListaDoble destino)`:
    1. El método debe tomar **toda** la lista de pedidos del repartidor accidentado (origen) y pegarla al final de la lista del repartidor disponible (destino).
    2. **Operación O(1):** No debes recorrer los pedidos uno por uno. Debes usar los punteros `Cola` del destino y `Cabeza` del origen para conectarlos instantáneamente.
    3. Al final, la lista del repartidor origen debe quedar vacía (`null`).

---

## 🚀 Guía de Implementación:

1.  **En el Reto 1:** Piensa en cómo el "anterior" del nodo de ruptura se convierte en la nueva `cola` de la primera lista.
2.  **En el Reto 2:** Cuidado con los nodos que ya están en los extremos; si intentas "traer al frente" algo que ya es la `Cola`, el programa no debería romperse.
3.  **En el Reto 3:** Este es el poder real de las listas dobles; unir dos cadenas de miles de elementos solo requiere actualizar **dos punteros**.
