# Ejercicios con Entrada de Datos — Conceptos Básicos

> **Módulo:** Semanas 1 y 2 — Elementos del lenguaje, generalidades y conceptos básicos
> **Requisito:** Todos los ejercicios deben usar `Scanner` para leer datos del usuario por consola.

```java
// Siempre importa Scanner al inicio del archivo
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

---

## Tema 1 — Variables y tipos de datos

### Ejercicio 1 — Recibo de compra
Pide al usuario el nombre de un producto, la cantidad comprada y el precio unitario.
Calcula el subtotal, aplica un IVA del 19% y muestra el recibo con el total a pagar.

**Datos de entrada:**
- `String` nombre del producto
- `int` cantidad
- `double` precio unitario

**Salida esperada:**
```
===== Recibo =====
Producto  : Arroz
Cantidad  : 3
Precio c/u: $2500.00
Subtotal  : $7500.00
IVA (19%) : $1425.00
Total     : $8925.00
```

---

### Ejercicio 2 — Conversor de temperatura
Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

**Fórmulas:**
- `F = (C × 9/5) + 32`
- `K = C + 273.15`

**Dato de entrada:** `double` temperatura en Celsius

**Salida esperada:**
```
25.0 °C = 77.0 °F = 298.15 K
```

---

### Ejercicio 3 — Promedio de notas
Pide al usuario su nombre y 4 notas de un curso. Calcula el promedio y determina si aprobó (promedio >= 3.0).

**Datos de entrada:**
- `String` nombre
- `double` nota1, nota2, nota3, nota4

**Salida esperada:**
```
Estudiante: Carlos
Promedio  : 3.45
Estado    : APROBADO
```

> **Pista:** usa una variable `boolean aprobado = promedio >= 3.0;` para el estado.

---

### Ejercicio 4 — Perfil de usuario
Pide al usuario los datos de su perfil: nombre, edad, ciudad, correo y si acepta términos y condiciones.
Muestra un resumen indicando el tipo de dato que se usó para cada campo.

**Datos de entrada:** `String`, `int`, `String`, `String`, `boolean`

**Salida esperada:**
```
========= Perfil creado =========
Nombre  (String)  : Ana Pérez
Edad    (int)     : 22
Ciudad  (String)  : Bogotá
Correo  (String)  : ana@mail.com
T&C     (boolean) : true
```

---

### Ejercicio 5 — Calculadora de IMC
Pide nombre, peso en kg y altura en metros. Calcula el IMC y clasifícalo.

**Fórmula:** `IMC = peso / (altura × altura)`

**Clasificación:**
- IMC < 18.5 → Bajo peso
- 18.5 ≤ IMC < 25 → Normal
- 25 ≤ IMC < 30 → Sobrepeso
- IMC ≥ 30 → Obesidad

**Datos de entrada:** `String` nombre, `double` peso, `double` altura

---

## Tema 2 — Variables por referencia

### Ejercicio 6 — Demostración por valor
Pide al usuario dos números enteros `a` y `b`. Asigna `b = a`, luego pide un nuevo valor para `b`.
Imprime `a` y `b` después del cambio y explica con un mensaje en consola por qué `a` no cambió.

**Datos de entrada:** `int` a, `int` b (dos veces)

**Salida esperada:**
```
a = 10  ← no cambió, se pasó por VALOR
b = 99  ← esta sí cambió
```

---

### Ejercicio 7 — Arreglo compartido (inventario)
Pide al usuario 4 precios para llenar un arreglo `precios[]`.
Crea `preciosAuditoria = precios` (misma referencia).
Pide al usuario el índice y el nuevo precio para hacer una corrección desde `preciosAuditoria`.
Muestra ambos arreglos y verifica que el cambio se refleja en los dos.

**Datos de entrada:** `double` × 4 precios, `int` índice, `double` nuevo precio

---

### Ejercicio 8 — Copia real vs referencia
Pide al usuario 3 calificaciones para llenar `notas[]`.
Crea una **copia real** en `notasRespaldo[]` copiando elemento por elemento.
Modifica `notas[0]` con un valor que el usuario ingrese.
Muestra ambos arreglos y verifica que `notasRespaldo` **no cambió**.

**Datos de entrada:** `double` × 3 notas, `double` nuevo valor para notas[0]

**Salida esperada:**
```
notas[0]         = 4.5  ← cambió
notasRespaldo[0] = 3.2  ← no cambió, es una copia independiente
```

---

### Ejercicio 9 — String inmutable
Pide al usuario su nombre. Asigna `alias = nombre`. Pide un nuevo alias.
Muestra que `nombre` no cambió y explica la inmutabilidad de `String` con un mensaje en consola.

**Datos de entrada:** `String` nombre, `String` nuevo alias

---

### Ejercicio 10 — Intercambio de valores
Pide dos números enteros `x` e `y`. Intercambia sus valores usando una variable auxiliar `temp`.
Muestra los valores antes y después del intercambio.

**Datos de entrada:** `int` x, `int` y

**Salida esperada:**
```
Antes  → x=5, y=8
Después→ x=8, y=5
```

> **Pista:** Si asignas `x = y` directamente sin `temp`, pierdes el valor original de `x`.

---

## Tema 3 — Estructuras lineales y no lineales

### Ejercicio 11 — Lista de pasajeros (lineal)
Pide al usuario cuántos pasajeros tiene un vuelo (máximo 8). Luego pide el nombre de cada uno.
Muestra la lista numerada con número de asiento y nombre.
Al final, indica cuántos asientos quedan disponibles sobre el total de 8.

**Datos de entrada:** `int` cantidad, `String` nombres

---

### Ejercicio 12 — Registro de temperaturas (lineal)
Pide al usuario las temperaturas máximas de los 7 días de la semana.
Calcula e imprime:
- El promedio semanal
- El día más caluroso (índice 0 = lunes)
- El día más frío
- Qué días estuvieron por encima del promedio

**Datos de entrada:** `double` × 7 temperaturas

---

### Ejercicio 13 — Buscar en lista (lineal)
Pide al usuario 5 nombres de empleados para llenar un arreglo.
Luego pide el nombre que desea buscar.
Recorre el arreglo y muestra si el empleado fue encontrado y en qué posición.

**Datos de entrada:** `String` × 5 nombres, `String` nombre a buscar

**Salida esperada:**
```
"María" encontrada en la posición 2.
```

---

### Ejercicio 14 — Ventas por sucursal (lineal)
Pide las ventas mensuales de 5 sucursales de una cadena de tiendas.
Muestra:
- La sucursal con mayor venta
- La sucursal con menor venta
- El total de ventas de la cadena
- El porcentaje que representa cada sucursal del total

**Datos de entrada:** `String` nombre de sucursal + `double` venta × 5

---

### Ejercicio 15 — Árbol de decisiones (no lineal)
Construye el siguiente árbol de decisiones para clasificar un número ingresado:

```
          ¿Número > 0?
          /           \
        Sí             No
    ¿Par o Impar?    ¿Es cero?
    /         \       /     \
  Par        Impar  Sí      No
                  (Cero) (Negativo)
```

Pide al usuario un número entero. Navega el árbol para clasificarlo como:
**Par positivo**, **Impar positivo**, **Cero** o **Negativo**.

> Implementa el árbol con nodos que tengan `String descripcion` e hijos izquierdo/derecho.

---

## Tema 4 — POO (Encapsulamiento, Herencia, Polimorfismo, Abstracción)

### Ejercicio 16 — Registro de vehículos
Crea la clase base `Vehiculo` con atributos privados `marca` y `velocidadMax`.
Clases hijas: `Moto` (agrega `cilindrada`) y `Camion` (agrega `toneladas`).
Cada hija usa `super(marca, velocidadMax)`.

El usuario registra 3 vehículos eligiendo el tipo e ingresando los datos.
Al final muestra la ficha de cada uno usando un arreglo `Vehiculo[]` (polimorfismo).

**Datos de entrada por vehículo:** tipo (1=Moto / 2=Camión), marca, velocidad, atributo extra

---

### Ejercicio 17 — Cuentas bancarias
Clase base `Cuenta` con atributo privado `saldo`.
Clases hijas:
- `CuentaAhorros`: agrega `calcularIntereses(double tasa)` → retorna `saldo * tasa`
- `CuentaCorriente`: agrega `girar(double monto)` → descuenta si hay fondos

El usuario crea una cuenta de cada tipo ingresando el saldo inicial.
Realiza operaciones (depósito, retiro, cálculo de intereses) con los datos que el usuario ingrese.
Muestra el saldo final de cada cuenta.

---

### Ejercicio 18 — Figuras 3D
Clase base `Solido` con atributo privado `nombre`.
Clases hijas: `Cubo` (lado), `Cilindro` (radio, altura), `Esfera` (radio).
Cada una sobreescribe `calcularVolumen()`.

**Fórmulas:**
- Cubo: `lado³`
- Cilindro: `π × radio² × altura`
- Esfera: `(4/3) × π × radio³`

El usuario crea 3 sólidos eligiendo el tipo e ingresando las medidas.
Muestra el nombre y volumen de cada uno usando polimorfismo.

---

### Ejercicio 19 — Sistema de nómina
Clase base `Empleado` con `nombre` y `salarioBase` (privados).
Clases hijas:
- `EmpleadoFijo`: agrega `bonificacion`, salario total = `salarioBase + bonificacion`
- `EmpleadoHoras`: agrega `horas` y `valorHora`, salario total = `horas × valorHora`

El usuario registra 4 empleados eligiendo el tipo.
Al final imprime la nómina completa con nombre, tipo y salario total de cada uno.
Muestra también el total a pagar de la nómina.

---

### Ejercicio 20 — Inventario de dispositivos
Clase base `Dispositivo` con `marca` y `precio` (privados).
Clases hijas: `Laptop` (ramGB), `Smartphone` (almacenamientoGB), `Tablet` (tamanioPulgadas).

El usuario llena un inventario con hasta 5 dispositivos eligiendo el tipo y los datos.
Al finalizar:
- Muestra la ficha completa de cada dispositivo
- Calcula el valor total del inventario
- Muestra cuántos dispositivos hay de cada tipo

---

## Criterios de evaluación

| Criterio | Descripción |
|---|---|
| Uso de `Scanner` | Se leen los datos correctamente con `nextLine()`, `nextInt()`, `nextDouble()`, etc. |
| Tipos de datos | Se usa el tipo más apropiado para cada variable |
| Salida clara | La información se imprime de forma ordenada y legible |
| Comentarios | Se explican las decisiones importantes en el código |
| Compilación | El programa compila y corre sin errores con cualquier valor válido |
| POO (temas 4) | Se aplica correctamente `super`, herencia y polimorfismo |

---

## Referencia rápida de Scanner

```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

String texto  = sc.nextLine();   // lee una línea completa (con espacios)
String palabra = sc.next();      // lee una sola palabra
int entero    = sc.nextInt();    // lee un número entero
double decimal = sc.nextDouble();// lee un número decimal
boolean bool  = sc.nextBoolean();// lee true o false
char letra    = sc.next().charAt(0); // lee un char (primer carácter)

sc.nextLine(); // ← úsalo para limpiar el buffer después de nextInt() o nextDouble()
               //   antes de leer un nextLine()

sc.close(); // cierra el Scanner al final del programa
```

> **Tip:** Si el programa salta una pregunta sin esperar tu respuesta, agrega `sc.nextLine()` para limpiar el salto de línea que queda en el buffer después de `nextInt()` o `nextDouble()`.
