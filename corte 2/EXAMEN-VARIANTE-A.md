# Examen Parcial — Corte #2 (Variante A)
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Listas Enlazadas Simples, Listas Dobles y Listas Circulares.</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Gestión de Carga (2.0 Puntos)
**Objetivo:** Implementar una Lista Enlazada Simple para logística.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Vagon.java` (Nodo), `ListaTren.java` (Lógica) y `App.java` (Menu).
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Enganchar Vagon:** Insertar al final con `id`, `contenido` y `peso`.
   - **b. Buscar por ID:** Buscar un vagon y mostrar su contenido y peso.
   - **c. Estado del Tren:** Listar todos los vagones y mostrar el **peso total** acumulado.
   - **d. Vagon Pesado:** Método que identifique y muestre el vagon con mayor peso.
3. **Validación:** No permitir pesos negativos o IDs duplicados.

**Ejemplo de Consola:**
```text
1. Enganchar | 2. Buscar | 3. Estado | 4. Salir
Opción: 3
--- ESTADO DEL TREN ---
[ID: 101 | Maíz | 20.5t] -> [ID: 102 | Trigo | 15.0t]
PESO TOTAL: 35.5 Toneladas | Vagon más pesado: ID 101.
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px; word-wrap: break-word;">

### Ejercicio 2: Metro Circular (3.0 Puntos)
**Objetivo:** Administrar una ruta con Listas Circulares Dobles.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Estacion.java`, `Metro.java` y `App.java`.
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Nueva Estación:** Insertar al final (manteniendo circularidad doble).
   - **b. Ver Ruta (IDA):** Recorrido `siguiente` desde cabeza a cola.
   - **c. Ver Ruta (REGRESO):** Recorrido `anterior` desde cola a cabeza.
   - **d. Consultar Estación:** Pedir nombre y mostrar sus estaciones **vecinas** (anterior y siguiente).
   - **e. Eliminar Parada:** Eliminar por nombre y reconectar punteros (O(1)).
3. **Validación Circular:** Al imprimir la ruta, debe demostrarse que es un ciclo. Por ejemplo: `A <-> B <-> C <-> (Vuelve a A)`. El último nodo debe apuntar físicamente al primero.

**Ejemplo de Consola:**
```text
Estación Actual: 'Sur'
Vecina Anterior: 'Occidente' | Vecina Siguiente: 'Norte'
--- RUTA REGRESO (Anterior) ---
Sur <-> Occidente <-> Centro <-> ...
```
**Nota Ejercicio 2: ______ / 3.0**
</td>
</tr>
</table>

---
<small>
<b>Instrucciones:</b> 
1. **Obligatorio:** Cada ejercicio debe estar dividido en **mínimo 3 archivos** (.java).
2. **Menú de Consola:** Ambos ejercicios deben funcionar mediante un menú de opciones interactivo que se repita hasta que el usuario decida salir.
3. **Regla:** Use <code>Scanner</code>. No use colecciones de Java (ArrayList, LinkedList, etc.).
<br><b>ADVERTENCIA:</b> Estudiante detectado usando IA o códigos externos tendrá una nota de <b>0.0</b> automática.
</small>

```java
while(cabeza != null) { 
  estudiar(); 
  practicar(); 
  if(error) depurar(); 
} // "El éxito en programación no es un evento, es una iteración"
```
 una iteración"
```
