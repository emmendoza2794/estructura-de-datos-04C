# Ejercicios para Estudiantes: Algoritmos de Ordenamiento (Semana 4)

A continuación, se presentan 5 ejercicios prácticos detallados. 

**REQUISITO GENERAL:** Todos los ejercicios deben capturar los datos de entrada por teclado utilizando la clase `Scanner`. No se permite el uso de arreglos con valores estáticos (hardcoded).

---

### 1. El Podio de la Competencia
**Algoritmo obligatorio:** `Ordenamiento por Selección (Selection Sort)`

*   **Contexto:** Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes ganaron las medallas.
*   **Detalle del ejercicio:** El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor. 
*   **Lógica de Selección:** El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio.
*   **Resultado esperado:** El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).

### 2. Organización de Biblioteca Dinámica
**Algoritmo obligatorio:** `Ordenamiento por Inserción (Insertion Sort)`

*   **Contexto:** Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el estante en su posición correcta.
*   **Detalle del ejercicio:** El usuario debe ingresar la cantidad de libros y luego el código ISBN (número entero) de cada uno. 
*   **Lógica de Inserción:** A medida que el usuario ingresa un número, o una vez llenado el arreglo, el algoritmo debe simular el proceso de "insertar" el elemento comparándolo con los que ya están a su izquierda.
*   **Visualización Paso a Paso:** En cada ciclo del ordenamiento, el programa debe imprimir cómo va quedando el arreglo (ej: `[10, 25, 5, 30] -> [5, 10, 25, 30]`). Esto permite al estudiante ver cómo los elementos se desplazan para abrir espacio al nuevo valor.

### 3. El Salto de Shell (Optimización de Datos)
**Algoritmo obligatorio:** `Ordenamiento Shell (Shell Sort)`

*   **Contexto:** Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma más eficiente que el método de burbuja o inserción simple.
*   **Detalle del ejercicio:** Solicita al usuario el peso de `N` paquetes (se recomienda probar con al menos 10 para notar el efecto).
*   **Lógica de Shell:** Implementa el algoritmo usando el salto (gap) inicial de $N/2$. El estudiante debe explicar en comentarios por qué este método es generalmente más rápido que la inserción simple al trabajar con elementos que están muy lejos de su posición final.
*   **Resultado esperado:** Mostrar el arreglo original y el arreglo final ordenado después de aplicar todas las fases de reducción de saltos.

### 4. Registro Alfabético de Estudiantes
**Algoritmo obligatorio:** `Ordenamiento por Inserción (Insertion Sort)`

*   **Contexto:** El profesor necesita pasar asistencia y requiere que la lista de nombres ingresada en el sistema se ordene alfabéticamente de la A a la Z.
*   **Detalle del ejercicio:** El programa debe preguntar cuántos alumnos hay en clase y solicitar sus nombres (cadenas de texto).
*   **Lógica de Texto:** Se debe usar el método de **Inserción** adaptado para `String`. 
*   **Requisito técnico:** El estudiante debe investigar y aplicar el método `nombre1.compareToIgnoreCase(nombre2)`. Es vital explicar que si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
*   **Resultado esperado:** La lista de asistencia impresa en orden alfabético perfecto.

### 5. El Inspector de Eficiencia (Duelo de Métodos)
**Algoritmos obligatorios:** `Selección` vs `Inserción`

*   **Contexto:** Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para un caso específico.
*   **Detalle del ejercicio:** El usuario debe ingresar 6 números enteros desordenados. El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
*   **Lógica de Conteo:** 
    1.  En **Selección**: Cuenta cada vez que ocurre un `swap` (intercambio físico de posiciones).
    2.  En **Inserción**: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
*   **Resultado esperado:** El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.

---
**Instrucciones de entrega:**
- Cada ejercicio debe estar en su propio archivo `.java` dentro de la carpeta `src`.
- Los nombres de las clases deben ser descriptivos (ej: `Ejercicio1Podio.java`).
- Incluir un encabezado con el nombre del estudiante y la explicación del algoritmo usado.
