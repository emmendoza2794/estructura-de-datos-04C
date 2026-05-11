# Examen Parcial — Corte #2 (Variante B)
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Listas Enlazadas Simples, Listas Dobles y Listas Circulares.</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Historial Web (2.0 Puntos)
**Objetivo:** Gestionar un historial de navegación con Listas Simples.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Pagina.java` (Nodo), `Historial.java` (Lógica) y `App.java` (Menu).
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Visitar Página:** Agregar al final con `url`, `titulo` y `visitas` (int).
   - **b. Buscar por URL:** Buscar una página y aumentar su contador de visitas.
   - **c. Ver Historial:** Listar todas las páginas y mostrar el **total de visitas** del usuario.
   - **d. Página Top:** Mostrar la página con el mayor número de visitas.
3. **Validación:** No permitir URLs vacías y el contador de visitas debe iniciar en 1.

**Ejemplo de Consola:**
```text
1. Visitar | 2. Buscar | 3. Ver Todo | 4. Salir
Opción: 3
--- HISTORIAL COMPLETO ---
[google.com | Buscador | 5 visitas] -> [youtube.com | Video | 12 visitas]
VISITAS TOTALES: 17 | Página más vista: YouTube.
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px; word-wrap: break-word;">

### Ejercicio 2: Gestor de Capas (3.0 Puntos)
**Objetivo:** Diseñar un sistema de capas (Photoshop style) con Listas Circulares Dobles.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Capa.java`, `Editor.java` y `App.java`.
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Nueva Capa:** Insertar al final (manteniendo circularidad doble).
   - **b. Subir Foco:** Mover el cursor a la capa `siguiente`.
   - **c. Bajar Foco:** Mover el cursor a la capa `anterior`.
   - **d. Ocultar/Mostrar:** Cambiar el estado `visible` (boolean) de la capa actual.
   - **e. Eliminar Capa:** Borrar la capa donde está el foco y mover el foco a la siguiente.
3. **Validación Circular:** Al imprimir todas las capas, indica cuál es la **Activa** con un `[X]` y muestra el ciclo de forma clara: `Fondo <-> Capa 1 <-> Texto <-> Fondo`.

**Ejemplo de Consola:**
```text
Capa Activa: 'Capa 1' [Visible: SI]
--- ORDEN DE CAPAS ---
[ ] Fondo <-> [X] Capa 1 <-> [ ] Texto <-> Fondo
```
**Nota Ejercicio 2: ______ / 3.0**
</td>
</tr>
</table>

---
<small>
<b>Instrucciones:</b> 
1. **Obligatorio:** Cada ejercicio debe estar dividido en **mínimo 3 archivos** (.java).
2. **Menú de Consola:** Ambos ejercicios deben funcionar mediante un menú de opciones interactivo.
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
