# Configuración de Java en Visual Studio Code

Esta guía explica paso a paso cómo instalar y configurar Java en Visual Studio Code para trabajar con los proyectos de este repositorio.

---

## Requisitos previos

- [Visual Studio Code](https://code.visualstudio.com/) instalado
- Conexión a internet

---

## 1. Descargar e instalar el JDK

1. Ingresa a la página oficial de Oracle:
   [https://www.oracle.com/java/technologies/downloads/#jdk25-windows](https://www.oracle.com/java/technologies/downloads/#jdk25-windows)

2. Descarga el instalador correspondiente a tu sistema operativo (Windows x64 Installer recomendado).

3. Verifica la instalación abriendo una terminal y ejecutando:
   ```bash
   java -version
   ```
   Debes ver algo similar a:
   ```
   java version "25" ...
   ```

---

## 2. Instalar extensiones en VS Code

Abre VS Code y dirígete a la pestaña de **Extensiones** (`Ctrl+Shift+X`). Busca e instala:

- **Extension Pack for Java** (Microsoft)

> Esta extensión instala automáticamente todo lo necesario: soporte de lenguaje, depurador, ejecutor de pruebas y más.

---

## 3. Crear y ejecutar un programa Java

1. Crea un archivo con extensión `.java`, por ejemplo `Hola.java`:
   ```java
   public class Hola {
       public static void main(String[] args) {
           System.out.println("Hola, mundo!");
       }
   }
   ```
2. Haz clic en el botón **Run** que aparece sobre el método `main`, o usa `Ctrl+F5` para ejecutar sin depuración.

---

## Recursos adicionales

- [Documentación oficial de Java en VS Code](https://code.visualstudio.com/docs/languages/java)
- [Descarga del JDK 25](https://www.oracle.com/java/technologies/downloads/#jdk25-windows)
