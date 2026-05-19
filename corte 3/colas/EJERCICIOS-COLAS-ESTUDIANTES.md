# Ejercicios de Aplicación — Colas (Queue)

> **Instrucciones:** Resuelve los siguientes problemas del mundo real utilizando el concepto de Colas (FIFO). Para cada ejercicio, debes definir una clase específica para el **Nodo** y una clase **Cola** que gestione la estructura mediante punteros (referencias), asegurando que la inserción ocurra por la **entrada** y la extracción por la **salida**.

---

### 1. Centro de Llamadas (Atención al Cliente)

Una empresa de telecomunicaciones recibe cientos de llamadas al día. Cuando todos los agentes están ocupados, las llamadas entrantes se ponen en espera formando una fila virtual. La primera llamada en esperar es la primera en ser atendida por el próximo agente disponible. Cada llamada se clasifica según su motivo: `"Facturación"`, `"Soporte Técnico"`, `"Cancelación"` o `"Información"`.

- **La Clase Llamada (Nodo):** Debe contener `idLlamada` (String), `nombreCliente` (String), `motivoConsulta` (String) y `duracionEstimadaMinutos` (int).
- **El Problema:** El supervisor necesita saber cuántas llamadas en espera corresponden a un motivo específico, para decidir si activa agentes especializados.
- **Reto:** Implementa un método `contarPorMotivo(String motivo)` que recorra la cola y devuelva la cantidad de llamadas cuyo `motivoConsulta` coincida con el parámetro recibido, sin modificar la cola.

---

### 2. Urgencias Hospitalarias (Triaje)

En la sala de urgencias de un hospital, los pacientes que llegan son registrados y colocados en una fila de atención. Dado el volumen de pacientes, el médico de guardia atiende en estricto orden de llegada. Al momento de llamar a un paciente, el sistema debe mostrar su información completa.

- **La Clase Paciente (Nodo):** Debe contener `cedula` (String), `nombreCompleto` (String), `edad` (int) y `sintomaPrincipal` (String).
- **El Problema:** Al finalizar el turno, el hospital necesita un reporte del total de pacientes atendidos y la lista completa en orden de atención.
- **Reto:** Implementa un método `atenderTodos()` que extraiga (`dequeue`) a cada paciente uno a uno, imprima su información al momento de ser atendido e imprima al final el total de pacientes procesados.

---

### 3. Impresora Compartida (Red de Oficina)

En una oficina de arquitectura, varias computadoras comparten una única impresora de gran formato. Cada vez que alguien envía un documento, este se agrega al final de la cola de impresión. La impresora procesa los trabajos en el orden exacto en que fueron recibidos.

- **La Clase Documento (Nodo):** Debe contener `nombreArchivo` (String), `usuario` (String), `numeroPaginas` (int) y `esColor` (boolean).
- **El Problema:** Antes de imprimir, el jefe de oficina quiere saber cuántas páginas en total tiene la cola de impresión pendiente.
- **Reto:** Implementa un método `calcularPaginasTotales()` que recorra la cola y retorne la suma de `numeroPaginas` de todos los documentos en espera, sin alterar la cola.

---

### 4. Peaje Inteligente (Control de Tráfico)

En una autopista de peaje, los vehículos ingresan a un carril y avanzan en fila hasta la cabina de cobro. El sistema registra automáticamente cada vehículo al entrar al carril. El cajero cobra en el orden estricto de llegada.

- **La Clase Vehiculo (Nodo):** Debe contener `placa` (String), `tipoVehiculo` (String), `tarifa` (double) y `esExento` (boolean).
- **El Problema:** Al cerrar el turno, el sistema debe calcular el total recaudado, ignorando los vehículos exentos de pago.
- **Reto:** Implementa un método `cerrarTurno()` que extraiga (`dequeue`) todos los vehículos de la cola, acumule la tarifa solo de los que tengan `esExento = false` e imprima el total recaudado al finalizar.

---

### 5. Fábrica de Pedidos (E-commerce)

Una tienda en línea recibe pedidos de manera continua. Cada pedido ingresa a una cola central de procesamiento. El sistema de bodega toma los pedidos en orden de llegada para preparar el envío. Si un pedido ya fue cancelado por el cliente, debe ser descartado automáticamente al momento de ser procesado.

- **La Clase Pedido (Nodo):** Debe contener `numeroPedido` (String), `cliente` (String), `totalPagar` (double) y `cancelado` (boolean).
- **El Problema:** La bodega necesita procesar solo los pedidos vigentes. Los cancelados deben ser eliminados sin ser despachados, pero registrados en un conteo.
- **Reto:** Implementa un método `procesarPedidos()` que recorra y vacíe la cola. Para cada pedido: si `cancelado = true`, lo descarta e incrementa un contador de cancelados; si `cancelado = false`, lo "despacha" imprimiendo sus datos. Al finalizar, muestra el total despachado y el total cancelado.

---

## Tips para el Desarrollo:

1. **Dos punteros:** Recuerda que una cola mantiene siempre dos referencias: `entrada` (para agregar) y `salida` (para retirar). Perder alguna de estas referencias destruye la estructura.
2. **Recorrido sin destruir:** Para consultar la cola sin vaciarla, usa una **referencia auxiliar** que empiece en `salida` y avance nodo a nodo hasta llegar a `null`. Nunca muevas los punteros reales `entrada` o `salida` durante un recorrido.
3. **Cola vacía:** Siempre verifica `isEmpty()` antes de hacer `dequeue()` o `peek()` para evitar un `NullPointerException`.
4. **Visualización sugerida:** Al imprimir la cola, usa el siguiente formato para que quede claro el flujo:
   `SALIDA -> [Pedido A] -> [Pedido B] -> [Pedido C] -> ENTRADA`
