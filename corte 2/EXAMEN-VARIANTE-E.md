# Examen Parcial — Corte #2 (Variante E)
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Listas Enlazadas Simples, Listas Dobles y Listas Circulares.</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Fila del Banco (2.0 Puntos)
**Objetivo:** Administrar la fila de atención de un banco con Listas Enlazadas Simples.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Cliente.java` (Nodo), `Fila.java` (Lógica) y `App.java` (Menu).
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Tomar Turno:** Agregar al final con `nombre` y `numero de turno` (auto-incremental).
   - **b. Atender Siguiente:** Eliminar el primer cliente de la fila (cabeza) y mostrar su nombre.
   - **c. Ver Fila:** Listar todos los clientes en espera y mostrar cuántos hay en total.
3. **Validación:** No permitir nombres vacíos. Si la fila está vacía al intentar atender, mostrar un mensaje de aviso.

**Ejemplo de Consola:**
```text
1. Tomar Turno | 2. Atender | 3. Ver Fila | 4. Salir
Opción: 2
Atendiendo a: Carlos (Turno #1)
--- FILA ACTUAL ---
[Ana | Turno #2] -> [Pedro | Turno #3]
EN ESPERA: 2 clientes.
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px; word-wrap: break-word;">

### Ejercicio 2: Playlist Musical (3.0 Puntos)
**Objetivo:** Simular una lista de reproducción en modo circular con Listas Circulares Dobles.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Cancion.java`, `Playlist.java` y `App.java`.
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Agregar Canción:** Insertar al final con `titulo` y `artista` (manteniendo circularidad doble).
   - **b. Siguiente Canción:** Avanzar al nodo `siguiente` y mostrar la canción actual.
   - **c. Canción Anterior:** Retroceder al nodo `anterior` y mostrar la canción actual.
   - **d. Ver Playlist:** Listar todas las canciones evidenciando que la lista es un ciclo.
3. **Validación Circular:** Al mostrar la playlist, debe evidenciarse que es circular. Por ejemplo: `Bohemian Rhapsody <-> Thriller <-> Imagine <-> (Vuelve al inicio)`.

**Ejemplo de Consola:**
```text
Opción: 2
[>> Siguiente] Reproduciendo: 'Thriller' — Michael Jackson
--- PLAYLIST COMPLETA ---
Bohemian Rhapsody <-> Thriller <-> Imagine <-> (Vuelve al inicio)
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
