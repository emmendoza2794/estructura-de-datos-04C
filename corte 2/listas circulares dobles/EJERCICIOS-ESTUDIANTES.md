# Ejercicios de Aplicación — Listas Circulares Dobles (Nivel Avanzado)

> **Instrucciones:** Resuelve los siguientes problemas del mundo real. Para cada ejercicio, debes definir una clase específica para el **Nodo** con los atributos indicados y una clase que gestione la **Lista Circular Doble**. La clase gestora debe mantener `cabeza` y `cola` como campos explícitos. Recuerda que la invariante ahora es doble: `cola.siguiente == cabeza` **y** `cabeza.anterior == cola`.

---

### 1. Línea de Metro Circular

Una ciudad tiene una línea de metro que forma un anillo cerrado: después de la última estación el tren vuelve automáticamente a la primera. Los pasajeros pueden viajar en cualquier dirección y el sistema debe mostrar cuántas paradas hay en cada sentido entre dos estaciones.

- **La Clase Estacion (Nodo):** Debe contener `nombre` (String), `zona` (int — del 1 al 3) y `pasajerosDiarios` (int).
- **El Problema:** Dado el nombre de una estación de origen y una de destino, el sistema cuenta las paradas yendo hacia adelante (`siguiente`) y las paradas yendo hacia atrás (`anterior`), e imprime cuál ruta es más corta.
- **Reto:** Implementa el método `rutaMasCorta(String origen, String destino)` que imprima las dos rutas con sus estaciones y número de paradas, y anuncie cuál es la más corta. Si ambas son iguales, indícalo. Usa al menos 6 estaciones para la simulación.

---

### 2. Historial de Comandos de Terminal

Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando anterior; flecha abajo avanza al más reciente. El historial es circular: después del más antiguo vuelve al más nuevo.

- **La Clase Comando (Nodo):** Debe contener `texto` (String), `exitoso` (boolean — si ejecutó sin errores) y `directorio` (String — el path desde donde se ejecutó).
- **El Problema:** El historial mantiene un puntero `cursor` al comando que se está consultando. Navegar con "arriba" mueve el cursor al anterior (`anterior`); "abajo" lo mueve al siguiente (`siguiente`). El usuario puede eliminar el comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
- **Reto:** Implementa los métodos `arriba()`, `abajo()`, `mostrarCursor()` y `eliminarActual()`. Simula: agrega 5 comandos, navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo con el cursor marcado.

---

### 3. Editor de Capas (Diseño Gráfico)

Los editores gráficos organizan el diseño en capas. El usuario navega a la capa superior (`siguiente`) o inferior (`anterior`) y puede ocultar o mostrar cada capa. La estructura es circular: después de la capa más alta vuelve a la más baja.

- **La Clase Capa (Nodo):** Debe contener `nombre` (String), `visible` (boolean) y `tipo` (String — "fondo", "objeto", "texto").
- **El Problema:** El editor mantiene un puntero `capaActiva` a la capa seleccionada. El usuario puede moverse entre capas, alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
- **Reto:** Implementa los métodos `subirCapa()`, `bajarCapa()`, `toggleVisibilidad()`, `eliminarActiva()` y `mostrarCapas()`. `mostrarCapas()` imprime todas las capas marcando la activa con `[✓]` e indicando si cada una es visible. Simula: crea 4 capas, activa la del medio, sube una vez, oculta la activa, elimínala y muestra el estado final.

---

### 4. Galería de Fotos

Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto siguiente, volver a la anterior, y marcar cualquier foto como favorita. Al eliminar una foto, la galería continúa desde la siguiente sin interrupciones.

- **La Clase Foto (Nodo):** Debe contener `titulo` (String), `fecha` (String) y `esFavorita` (boolean).
- **El Problema:** La galería mantiene un puntero `actual` a la foto que se está viendo. Navegar con "siguiente" o "anterior" mueve ese puntero. Marcar como favorita simplemente alterna el campo `esFavorita` de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y mueve `actual` a la siguiente.
- **Reto:** Implementa los métodos `siguiente()`, `anterior()`, `toggleFavorita()`, `eliminarActual()` y `mostrarGaleria()`. `mostrarGaleria()` recorre todas las fotos marcando con `[★]` las favoritas y con `[▶]` la foto actual. Simula: carga 5 fotos, avanza dos veces, marca la actual como favorita, retrocede una, elimina esa foto y muestra el estado final de la galería.

---

## Tips para el Desarrollo de Listas Circulares Dobles:

1. **Eliminar en O(1):** No necesitas recorrer para encontrar el nodo anterior — lo tienes en `nodo.anterior`. Úsalo directamente: `nodo.anterior.siguiente = nodo.siguiente` y `nodo.siguiente.anterior = nodo.anterior`.
2. **Actualizar `cabeza` y `cola`:** Al eliminar, verifica si el nodo era `cabeza` (actualiza `cabeza = nodo.siguiente`) o `cola` (actualiza `cola = nodo.anterior`). Olvidar cualquiera rompe la invariante.
3. **Puntero auxiliar (`cursor`, `capaActiva`):** Si vas a eliminar el nodo al que apunta tu puntero auxiliar, muévelo primero (`cursor = cursor.siguiente`) **antes** de desconectar el nodo.
4. **Contar en ambas direcciones (ejercicio 1):** Recorre hacia adelante con un contador hasta encontrar el destino, luego repite hacia atrás. El menor es la ruta más corta. Usa `do-while` con una variable `encontrado` para no dar vueltas infinitas.
5. **Lista de un solo nodo:** Cuando quede un único nodo y se elimine, tanto `cabeza`, `cola` como el puntero auxiliar deben quedar en `null`.
