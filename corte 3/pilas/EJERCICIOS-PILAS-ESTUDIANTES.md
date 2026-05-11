# Ejercicios de Aplicación — Pilas (Stack)

> **Instrucciones:** Resuelve los siguientes problemas del mundo real utilizando el concepto de Pilas (LIFO). Para cada ejercicio, debes definir una clase específica para el **Nodo** y una clase **Pila** que gestione la estructura mediante punteros (referencias), asegurando que solo se opere a través del **tope**.

---

### 1. Puerto Marítimo (Gestión de Contenedores)
En un puerto de carga, los contenedores se apilan en columnas verticales dentro de los barcos o en el muelle. Debido al espacio restringido, solo se puede acceder al contenedor que está en la cima.
- **La Clase Contenedor (Nodo):** Debe contener `idCodigo` (String), `empresa` (String), `peso` (double) y `tipoCarga` (String).
- **El Problema:** El supervisor necesita un reporte rápido de cuánta carga hay de una empresa en particular sin retirar los contenedores.
- **Reto:** Implementa un método `contarPorEmpresa(String nombreEmpresa)` que recorra la pila y devuelva la cantidad total de contenedores que pertenecen a esa empresa.

### 2. Control de Calidad (Línea de Ensamblaje)
Un brazo robótico en una fábrica de motores apila componentes siguiendo una secuencia precisa. Un sensor de visión artificial inspecciona cada pieza después de ser colocada.
- **La Clase Pieza (Nodo):** Debe contener `nombrePieza` (String), `numeroSerie` (String) y `esDefectuosa` (boolean).
- **El Problema:** Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
- **Reto:** Crea un método `limpiarHastaDefecto()` que extraiga (`pop`) todas las piezas de la pila hasta encontrar la primera que tenga `esDefectuosa = true`. El método debe imprimir el nombre de todas las piezas "buenas" que tuvieron que ser retiradas y descartadas antes de llegar a la pieza fallida.

### 3. Logística de Distribución (Callejón sin Salida)
Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho. Los camiones de reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. El último camión en entrar debe ser obligatoriamente el primero en salir para permitir que los demás se retiren.
- **La Clase Camion (Nodo):** Debe contener `placa` (String), `conductor` (String) y `cargaToneladas` (double).
- **El Problema:** El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones físicamente (solo consultando la estructura).
- **Reto:** Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) y calcule la suma total de `cargaToneladas` de todos los camiones estacionados.

### 4. Farmacia Automatizada (Dispensador Tubo LIFO)
En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores verticales. El personal introduce las cajas por la parte superior y las retira de la misma forma (el último lote en llegar es el primero en ser despachado).
- **La Clase Medicamento (Nodo):** Debe contener `nombre` (String), `lote` (String) y `diasParaVencer` (int).
- **El Problema:** Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
- **Reto:** Implementa un método `validarDespacho()` que revise el medicamento en el **tope**. Si está a punto de vencer, debe ser retirado automáticamente y el sistema debe revisar el siguiente. El proceso se repite hasta que el tope sea un medicamento seguro o la pila quede vacía.

### 5. Ruta de Rescate (Espeleología Geológica)
Un equipo de rescatistas entra en una cueva inexplorada. Para no perderse, van dejando "Estaciones de Seguridad" representadas por una baliza que registra los datos del entorno.
- **La Clase Estacion (Nodo):** Debe contener `nombrePunto` (String), `profundidad` (int) y `nivelOxigeno` (double).
- **El Problema:** Para salir de la cueva, el equipo debe seguir las estaciones en el orden inverso al que fueron colocadas (de la más profunda a la entrada).
- **Reto:** Implementa el método `retrocederASuperficie()`. Este debe mostrar el nombre de cada estación a medida que se desapila. **Importante:** Si en alguna estación el `nivelOxigeno` es inferior al 18%, el sistema debe imprimir una alerta de "Uso de Tanque de Emergencia Requerido" al pasar por ese punto.

---

## Tips para el Desarrollo:

1.  **Uso de Auxiliares:** En Pilas, para buscar o recorrer sin perder los datos, es muy común usar una **segunda Pila temporal**.
2.  **Encapsulamiento:** Recuerda que en una Pila **no existe el método get(index)**. Solo puedes ver lo que retorna `peek()` o lo que sale con `pop()`.
3.  **Estado de la Pila:** Siempre verifica `isEmpty()` antes de realizar un `pop()` o `peek()` para evitar errores de ejecución (NullPointerException).
4.  **Visualización Sugerida:** Al imprimir la pila, usa una flecha que indique claramente dónde está el tope:
    `TOPE -> [Caja A] -> [Caja B] -> [Caja C] -> BASE`
