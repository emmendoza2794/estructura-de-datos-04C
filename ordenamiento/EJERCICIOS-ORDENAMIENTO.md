# Ejercicios Semanales: Algoritmos de Ordenamiento
> **Temas:** Selección · Inserción · Shell Sort

---

## Tema 1 — Ordenamiento por Selección (Selection Sort)

**Descripción:**
- Implementa el algoritmo de selección que busca el valor mínimo en la lista desordenada y lo intercambia con el primer elemento no ordenado.
- El ejercicio incluye un ejemplo con precios de productos en una tienda.

**Reto Interactivo:**
- El programa solicita al usuario ingresar una cantidad de productos y sus valores correspondientes, para luego mostrarlos ordenados.

---

## Tema 2 — Ordenamiento por Inserción (Insertion Sort)

**Descripción:**
- El algoritmo recorre el arreglo y para cada elemento, lo inserta en su posición adecuada comparándolo con los elementos anteriores (ya ordenados).
- Se utiliza un ejemplo con las edades de un grupo de estudiantes.

**Reto Interactivo:**
- El usuario debe registrar las estaturas de los miembros de un equipo deportivo, y el programa las organizará de menor a mayor.

---

## Tema 3 — Ordenamiento Shell (Shell Sort)

**Descripción:**
- Es una extensión del método de inserción que permite comparar y mover elementos que están a una distancia lejana (gap), reduciendo esta distancia en cada iteración.
- Se aplica para ordenar distancias recorridas en una competencia.

**Reto Interactivo:**
- Los estudiantes pueden ingresar el peso de diferentes cargamentos para observar cómo se ordenan eficientemente mediante Shell Sort.

---

### Resumen de Complejidad

| Algoritmo | Peor Caso | Mejor Caso | Descripción |
| :--- | :--- | :--- | :--- |
| **Selección** | O(n²) | O(n²) | Siempre realiza el mismo número de comparaciones. |
| **Inserción** | O(n²) | O(n) | Muy eficiente si el arreglo ya está casi ordenado. |
| **Shell** | O(n²) | O(n log n) | Mucho más rápido que los anteriores para listas grandes. |
