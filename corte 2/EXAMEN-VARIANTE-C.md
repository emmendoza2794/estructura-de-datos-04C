# Examen Parcial — Corte #2 (Variante C)
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Listas Enlazadas Simples, Listas Dobles y Listas Circulares.</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Inventario de Almacén (2.0 Puntos)
**Objetivo:** Gestionar stock de productos con Listas Simples.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Producto.java` (Nodo), `Almacen.java` (Lógica) y `App.java` (Menu).
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Registrar Producto:** Agregar al final con `codigo`, `nombre`, `cantidad` y `precio`.
   - **b. Buscar y Editar:** Buscar por código y permitir **actualizar la cantidad** (sumar o restar stock).
   - **c. Valor del Inventario:** Mostrar lista completa y el **valor total** (suma de cantidad * precio de todos).
   - **d. Eliminar Producto:** Pedir el código de un producto y **eliminarlo** de la lista (manejar correctamente si es la cabeza, el medio o el final).
3. **Validación:** No permitir cantidades negativas ni códigos duplicados.

**Ejemplo de Consola:**
```text
1. Registrar | 2. Editar Stock | 3. Valor Total | 4. Eliminar | 5. Salir
Opción: 4
Ingrese código a eliminar: 001
Producto 'Mouse' eliminado del inventario.
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px; word-wrap: break-word;">

### Ejercicio 2: Historial de Comandos (3.0 Puntos)
**Objetivo:** Simular un historial de Terminal (flecha arriba/abajo) con Listas Circulares Dobles.

**¿Qué debes hacer?**
1. **Estructura (3 Archivos):** `Comando.java`, `Consola.java` y `App.java`.
2. **Menu Interactivo:** Implementa un `switch` con:
   - **a. Nuevo Comando:** Agregar un comando (`texto`, `hora`) al final de la lista circular.
   - **b. Comando Anterior:** Mover el cursor hacia atrás (simula flecha arriba).
   - **c. Comando Siguiente:** Mover el cursor hacia adelante (simula flecha abajo).
   - **d. Borrar Actual:** Eliminar el comando donde está el cursor y reconectar la lista en $O(1)$.
   - **e. Buscar Comando:** Buscar por texto y mover el cursor directamente a esa posición.
3. **Validación Circular:** Al navegar o listar el historial, debe demostrarse visualmente que la lista se cierra sobre sí misma. Por ejemplo: `ls <-> cd .. <-> git status <-> ls`.

**Ejemplo de Consola:**
```text
Cursor en: 'git status' (10:15 AM)
[Flecha Arriba] -> Cursor en: 'cd Documents'
--- HISTORIAL COMPLETO ---
ls <-> cd Documents <-> git status <-> ls
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
} // "El éxito en programación no es un evento, es una iteration"
```
