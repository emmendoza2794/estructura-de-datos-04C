# Ejercicios de Aplicación — Arrays y Búsqueda

> **Instrucciones:** Resuelve los siguientes problemas del mundo real. En cada uno se indica qué algoritmo es el más adecuado para la situación planteada.

---

### 1. El Cajero del Supermercado (Inventario)
Un cajero escanea un producto con el código de barras `770123`. El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.
- **El Problema:** Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
- **Algoritmo a usar:** **Búsqueda Lineal**. Es el ideal porque los productos en la estantería no tienen un orden numérico específico.

### 2. Buscador de Cédulas (Base de Datos Bancaria)
Un banco tiene una lista de 1.000 clientes organizados de forma **estricta y ascendente** por su número de cédula o ID.
- **El Problema:** Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
- **Algoritmo a usar:** **Búsqueda Binaria**. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.

### 3. Sensor de Temperatura (Control de Calidad)
Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.
- **El Problema:** Al final del día, el supervisor quiere saber cuál fue la **temperatura más alta** registrada para asegurarse de que la máquina no se recalentó.
- **Algoritmo a usar:** **Búsqueda Lineal de Máximo**. Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos.

### 4. Control de Acceso (Gimnasio)
Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. La lista está **ordenada de menor a mayor**.
- **El Problema:** Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día". Si no está, se le niega la entrada.
- **Algoritmo a usar:** **Búsqueda Binaria**. Es eficiente para buscar códigos numéricos en una lista que ya está organizada.

### 5. Contador de Estudiantes (Registro Académico)
Un profesor tiene un arreglo con las notas finales de 30 estudiantes (ej: `3.5, 4.0, 2.8, 5.0, ...`).
- **El Problema:** El profesor necesita saber exactamente **cuántos estudiantes** sacaron una nota de `5.0`.
- **Algoritmo a usar:** **Búsqueda Lineal con Contador**. Debes recorrer todo el arreglo y, cada vez que encuentres un `5.0`, aumentar una variable contador.

---

## Tips para los Estudiantes:

1.  **¿Cuándo usar Búsqueda Lineal?** Cuando los datos estén desordenados o cuando necesites revisar **todos** los elementos (como para contar o buscar el máximo).
2.  **¿Cuándo usar Búsqueda Binaria?** Únicamente cuando te aseguren que el arreglo está **ordenado**. Es mucho más veloz para listas grandes.
3.  **Índices:** Recuerda que en Java los arreglos siempre empiezan en la posición `0`.
