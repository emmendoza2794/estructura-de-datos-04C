# Buenas prácticas en Java

Guía de buenas prácticas para escribir código Java limpio, legible y mantenible.

---

## 1. Nomenclatura

| Elemento | Convención | Ejemplo |
|----------|-----------|---------|
| Clases | PascalCase | `ListaEnlazada`, `NodoArbol` |
| Métodos y variables | camelCase | `calcularArea()`, `nombreEstudiante` |
| Constantes | UPPER_SNAKE_CASE | `MAX_TAMANIO`, `PI` |
| Paquetes | minúsculas | `estructuras.listas` |

```java
// Mal
int Edad = 20;
void calcular_area() {}

// Bien
int edad = 20;
void calcularArea() {}
```

---

## 2. Encapsulamiento

Declara los atributos de una clase como `private` y usa métodos `get`/`set` para acceder a ellos.

```java
// Mal
public class Persona {
    public String nombre;
    public int edad;
}

// Bien
public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
```

---

## 3. Un archivo, una clase pública

Cada clase pública debe estar en su propio archivo `.java` y el nombre del archivo debe coincidir exactamente con el nombre de la clase.

```
// Archivo: Estudiante.java
public class Estudiante { ... }
```

---

## 4. Nombres descriptivos

Los nombres deben describir claramente qué representa la variable o qué hace el método. Evita abreviaciones confusas.

```java
// Mal
int x;
void proc(int n) {}

// Bien
int cantidadEstudiantes;
void calcularPromedio(int nota) {}
```

---

## 5. Evitar números mágicos

No uses valores numéricos literales en el código. Declara constantes con nombre.

```java
// Mal
if (nota >= 3.0) { ... }

// Bien
final double NOTA_MINIMA_APROBACION = 3.0;
if (nota >= NOTA_MINIMA_APROBACION) { ... }
```

---

## 6. Indentación y formato

Usa 4 espacios (o 1 tab) por nivel de indentación. Las llaves de apertura `{` van en la misma línea.

```java
// Bien
public void saludar() {
    if (true) {
        System.out.println("Hola");
    }
}
```

---

## 7. Comentarios útiles

Comenta el **por qué**, no el **qué**. El código debe ser lo suficientemente claro para explicarse solo.

```java
// Mal
i++; // incrementa i en 1

// Bien
// Se avanza al siguiente nodo de la lista
nodoActual = nodoActual.siguiente;
```

---

## 8. Manejo de excepciones

No captures excepciones genéricas ni las ignores. Sé específico y maneja el error adecuadamente.

```java
// Mal
try {
    // ...
} catch (Exception e) {}

// Bien
try {
    int resultado = dividir(a, b);
} catch (ArithmeticException e) {
    System.out.println("Error: división por cero.");
}
```

---

## 9. Reutilización con métodos

Si un bloque de código se repite más de una vez, conviértelo en un método.

```java
// Mal
System.out.println("--- Menú ---");
// ... (código repetido en varios lugares)

// Bien
void mostrarMenu() {
    System.out.println("--- Menú ---");
}
```

---

## 10. Principio de responsabilidad única

Cada clase y cada método debe tener **una sola responsabilidad**. Si un método hace demasiadas cosas, divídelo.

```java
// Mal: un método que hace todo
void procesarEstudiante() {
    leerDatos();
    calcularPromedio();
    imprimirReporte();
}

// Bien: cada método hace una cosa
void leerDatos() { ... }
void calcularPromedio() { ... }
void imprimirReporte() { ... }
```
