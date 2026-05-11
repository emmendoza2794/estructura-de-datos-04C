# Examen Parcial — Corte #2 (Variante D)
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Listas Enlazadas Simples, Listas Dobles y Listas Circulares.</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Cartelera de Cine (2.0 Puntos)
**Objetivo:** Gestionar una lista de películas con Listas Enlazadas Simples.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Pelicula.java` (Nodo), `Cartelera.java` (Lógica) y `App.java` (Menu).
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Agregar Película:** Insertar al final con `titulo`, `genero` y `duracion` (minutos).
   - **b. Buscar por Título:** Buscar y mostrar la información completa de la película.
   - **c. Ver Cartelera:** Listar todas las películas y mostrar la **duración total** de todas en minutos.
3. **Validación:** No permitir títulos vacíos ni duraciones menores o iguales a 0.

**Ejemplo de Consola:**
```text
1. Agregar | 2. Buscar | 3. Ver Cartelera | 4. Salir
Opción: 3
--- CARTELERA DE HOY ---
[Inception | Ciencia Ficción | 148 min] -> [Coco | Animación | 105 min]
DURACIÓN TOTAL: 253 minutos.
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px; word-wrap: break-word;">

### Ejercicio 2: Ruleta de Rifa (3.0 Puntos)
**Objetivo:** Simular una ruleta de participantes con Listas Circulares Dobles.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Participante.java`, `Ruleta.java` y `App.java`.
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Inscribir Participante:** Insertar al final con `nombre` y `numero` de boleto (manteniendo circularidad doble).
   - **b. Girar (Siguiente):** Avanzar al nodo `siguiente` y mostrar quién está en turno.
   - **c. Retroceder (Anterior):** Moverse al nodo `anterior` y mostrar quién está en turno.
   - **d. Ver Todos:** Listar todos los participantes mostrando que la lista es un ciclo.
3. **Validación Circular:** Al mostrar todos los participantes, debe evidenciarse el ciclo. Por ejemplo: `Ana <-> Luis <-> María <-> (Vuelve a Ana)`.

**Ejemplo de Consola:**
```text
Opción: 2
[Girar >>] Turno actual: Luis (Boleto #47)
--- TODOS LOS PARTICIPANTES ---
Ana <-> Luis <-> María <-> (Vuelve a Ana)
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
