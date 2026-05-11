# Examen Parcial — Corte #2 (Variante F)
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Listas Enlazadas Simples, Listas Dobles y Listas Circulares.</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Lista de Tareas (2.0 Puntos)
**Objetivo:** Administrar pendientes personales con Listas Enlazadas Simples.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Tarea.java` (Nodo), `Agenda.java` (Lógica) y `App.java` (Menu).
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Agregar Tarea:** Insertar al final con `descripcion` y `prioridad` (número del 1 al 5).
   - **b. Buscar Tarea:** Buscar por descripción y mostrar su prioridad.
   - **c. Ver Todas:** Listar todas las tareas pendientes en orden de inserción.
3. **Validación:** No permitir descripciones vacías ni prioridades fuera del rango 1-5.

**Ejemplo de Consola:**
```text
1. Agregar | 2. Buscar | 3. Ver Todas | 4. Salir
Opción: 3
--- TAREAS PENDIENTES ---
[Estudiar para el examen | Prioridad: 5] -> [Comprar mercado | Prioridad: 3]
TOTAL: 2 tareas pendientes.
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px; word-wrap: break-word;">

### Ejercicio 2: Turnos de Guardia (3.0 Puntos)
**Objetivo:** Gestionar turnos rotativos de guardias con Listas Circulares Dobles.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Guardia.java`, `Ronda.java` y `App.java`.
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Registrar Guardia:** Agregar al final con `nombre` y `sector` asignado (manteniendo circularidad doble).
   - **b. Siguiente Turno:** Avanzar al nodo `siguiente` y mostrar quién entra de turno.
   - **c. Turno Anterior:** Retroceder al nodo `anterior` y mostrar quién estaba de turno.
   - **d. Ver Ronda Completa:** Listar todos los guardias evidenciando el ciclo de la ronda.
3. **Validación Circular:** Al mostrar la ronda, debe evidenciarse que es circular. Por ejemplo: `García (Norte) <-> López (Sur) <-> Torres (Este) <-> (Vuelve a García)`.

**Ejemplo de Consola:**
```text
Opción: 2
[>> Siguiente] En turno: López — Sector Sur
--- RONDA COMPLETA ---
García (Norte) <-> López (Sur) <-> Torres (Este) <-> (Vuelve a García)
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
