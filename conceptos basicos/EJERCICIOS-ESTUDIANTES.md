# Ejercicios para Estudiantes — Conceptos Básicos

> **Módulo:** Semanas 1 y 2 — Elementos del lenguaje, generalidades y conceptos básicos
> **Temas:** Variables y tipos de datos · Variables por referencia · Estructuras lineales/no lineales · POO

Cada ejercicio está basado en situaciones reales. Aplica los conceptos vistos en clase para resolverlos en Java.

---

## Tema 1 — Variables y tipos de datos

### Ejercicio 1 — Ficha de un estudiante
Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código (número entero), semestre actual, promedio acumulado y si está matriculado o no.

- Declara las variables con los tipos de datos apropiados.
- Asigna valores de ejemplo.
- Imprime un reporte por consola con el siguiente formato:
  ```
  === Ficha del Estudiante ===
  Nombre: Ana Torres
  Código: 20241001
  Semestre: 3
  Promedio: 3.85
  Matriculado: true
  ```

---

### Ejercicio 2 — Calculadora de una tienda
Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

- Precio unitario de un producto (`double`)
- Cantidad comprada (`int`)
- Descuento aplicado en porcentaje (`double`)
- Total a pagar después del descuento

Declara las variables, realiza el cálculo y muestra el resultado por consola.

---

### Ejercicio 3 — Sensor de temperatura
Un sensor industrial registra temperaturas. El sistema recibe:

- Temperatura actual en Celsius (`double`)
- Nombre del sensor (`String`)
- Número de lectura (`int`)
- Si la temperatura supera el límite de 80°C, una variable `boolean` llamada `enAlarma` debe ser `true`.

Imprime el estado del sensor con todos sus datos.

---

### Ejercicio 4 — Placa de un vehículo
El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

- Placa (`String`)
- Año de fabricación (`int`)
- Cilindraje en cc (`int`)
- Precio de compra (`double`)
- Inicial del color (`char`)
- Si tiene SOAT vigente (`boolean`)

Muestra todos los datos en consola.

---

### Ejercicio 5 — Conversor de unidades
Una aplicación de cocina necesita convertir unidades:

- Declara una variable `tazas` (`double`) con la cantidad de tazas de un ingrediente.
- Convierte a mililitros (1 taza = 236.588 ml) y guarda el resultado en otra variable.
- Convierte también a litros.
- Muestra las tres medidas por consola.

---

## Tema 2 — Variables por referencia

### Ejercicio 6 — Turno en un banco
Un cajero de banco trabaja con el número del turno actual. Se crea una variable `turnoActual` y se asigna a `turnoEnPantalla`.

- Demuestra con código que cambiar `turnoEnPantalla` **no** afecta a `turnoActual` (comportamiento por valor).
- Explica en un comentario por qué ocurre esto.

---

### Ejercicio 7 — Inventario compartido
Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de reportes **apuntan al mismo arreglo**.

- Crea el arreglo `stockAlmacen` con valores iniciales.
- Asigna `stockReportes = stockAlmacen`.
- Simula una venta reduciendo el stock de un producto desde `stockReportes`.
- Muestra que `stockAlmacen` **también cambió** y explica en comentarios por qué.

---

### Ejercicio 8 — Historial de mensajes
Un chat guarda el último mensaje enviado. Se usan dos variables `String`:

- `ultimoMensaje = "Hola"`
- `copiaTexto = ultimoMensaje`
- Luego `copiaTexto` se cambia a `"¿Cómo estás?"`

Muestra ambas variables y explica en un comentario por qué `ultimoMensaje` **no cambió** (inmutabilidad de `String`).

---

### Ejercicio 9 — Notas de un curso
Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador recibe una referencia al mismo arreglo para revisarlas.

- El coordinador corrige la nota del estudiante 2 (índice 1) de `2.5` a `3.0`.
- Muestra que el arreglo del profesor **también refleja el cambio**.
- Añade comentarios explicando el concepto de referencia en memoria.

---

### Ejercicio 10 — Copiando configuración
Una app tiene un objeto `int[] configuracion = {1920, 1080, 60}` (resolución y FPS).

- Crea una **copia real** del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
- Modifica la copia y demuestra que el original **no cambia**.
- Comenta la diferencia con la asignación directa.

---

## Tema 3 — Estructuras lineales y no lineales

### Ejercicio 11 — Lista de pasajeros (lineal)
Una aerolínea registra los nombres de los pasajeros de un vuelo en un arreglo de `String` con capacidad para 6 personas.

- Llena el arreglo con nombres.
- Recórrelo con un `for` e imprime el número de asiento y el nombre.
- Muestra cuántos asientos están ocupados.

---

### Ejercicio 12 — Historial de ventas (lineal)
Una tienda online guarda las ventas del día en un arreglo de `double`:

- Almacena 7 ventas de ejemplo.
- Calcula e imprime: la venta más alta, la venta más baja y el total del día.

---

### Ejercicio 13 — Clasificación de residuos (no lineal)
Modela una jerarquía de tipos de residuos con una estructura de árbol usando nodos:

```
        Residuos
       /        \
  Orgánicos   Inorgánicos
   /    \       /      \
Comida Jardín Plástico Papel
```

- Crea la clase `NodoResiduo` con un campo `nombre` y referencias `izquierdo` y `derecho`.
- Construye el árbol mostrado.
- Imprime la raíz y todos sus descendientes indicando el nivel.

---

### Ejercicio 14 — Árbol de empleados (no lineal)
Una empresa tiene la siguiente jerarquía:

```
         Gerente
        /       \
   Supervisor1  Supervisor2
    /      \
 Analista1 Analista2
```

- Modela la jerarquía con nodos que tengan el campo `cargo`.
- Imprime el árbol recorriéndolo nivel por nivel.

---

### Ejercicio 15 — Registro de temperaturas semanales (lineal)
Una estación meteorológica registra la temperatura máxima de cada día de la semana en un arreglo.

- Llena el arreglo con 7 valores.
- Calcula el promedio semanal.
- Indica qué días estuvieron por encima del promedio.

---

## Tema 4 — POO (Encapsulamiento, Herencia, Polimorfismo, Abstracción)

### Ejercicio 16 — Sistema de vehículos
Crea una clase base `Vehiculo` con atributos privados `marca` (`String`) y `velocidadMaxima` (`double`), y un método `describir()`.

- Crea las clases hijas `Moto` y `Camion`, cada una con un atributo adicional propio.
- Usa `super(...)` en cada constructor para inicializar `marca` y `velocidadMaxima`.
- Sobreescribe `describir()` en cada hija para mostrar también su atributo extra.
- Instancia un objeto de cada tipo y llama a `describir()`.

---

### Ejercicio 17 — Cuentas bancarias
Modela un sistema básico de cuentas:

- Clase base `Cuenta` con atributo privado `saldo` (`double`) y métodos `depositar(double monto)` y `getSaldo()`.
- Clase hija `CuentaAhorros` que agrega un método `calcularIntereses(double tasa)` que retorna `saldo * tasa`.
- Clase hija `CuentaCorriente` que agrega un método `girar(double monto)` que descuenta del saldo (verifica que haya fondos).
- Usa `super(saldoInicial)` en ambas hijas.
- Realiza operaciones con ambas cuentas y muestra los saldos resultantes.

---

### Ejercicio 18 — Figuras 3D
Extiende el ejemplo del ejercicio E4POO al mundo 3D:

- Crea una clase base `Solido` con atributo privado `nombre` y un método abstracto `calcularVolumen()`.
- Implementa las clases hijas `Cubo` (lado), `Cilindro` (radio, altura) y `Esfera` (radio).
- Cada clase debe usar `super(nombre)` y sobreescribir `calcularVolumen()`.
- Crea un arreglo de `Solido[]` con un objeto de cada tipo y recórrelo imprimiendo nombre y volumen (polimorfismo).

---

### Ejercicio 19 — Sistema de empleados y nómina
Una empresa necesita calcular el salario de sus empleados:

- Clase base `Empleado` con `nombre` (privado) y `salarioBase` (privado).
- Clase hija `EmpleadoTiempoCompleto`: agrega `bonificacion` y calcula `salarioTotal = salarioBase + bonificacion`.
- Clase hija `EmpleadoPorHoras`: agrega `horasTrabajadas` y `valorHora`, calcula `salarioTotal = horasTrabajadas * valorHora`.
- Ambas clases hijas usan `super(nombre, salarioBase)`.
- Crea una lista de empleados e imprime la nómina completa con nombre y salario total de cada uno.

---

### Ejercicio 20 — Inventario de dispositivos
Una tienda de tecnología maneja varios tipos de dispositivos:

- Clase base `Dispositivo` con atributos privados `marca` y `precio`, y método `mostrarFicha()`.
- Clases hijas: `Laptop` (agrega `ramGB`), `Smartphone` (agrega `almacenamientoGB`), `Tablet` (agrega `tamanioPulgadas`).
- Cada hija usa `super(marca, precio)` y sobreescribe `mostrarFicha()` para incluir su atributo extra.
- Crea un arreglo `Dispositivo[]` con al menos 4 objetos (de distintos tipos) y muestra el inventario completo.
- Calcula e imprime el precio total del inventario.

---

## Criterios de evaluación

| Criterio | Descripción |
|---|---|
| Tipos correctos | Usa el tipo de dato más apropiado para cada variable |
| Comentarios | Explica las decisiones importantes en el código |
| Compilación | El programa compila y corre sin errores |
| Salida clara | La información se imprime de forma ordenada y legible |
| POO | Aplica correctamente `super`, herencia y polimorfismo donde corresponde |

> **Tip:** Antes de escribir código, identifica qué conceptos del módulo aplica cada ejercicio.
