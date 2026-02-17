/**
 * Ejercicio 4 - Programación Orientada a Objetos (POO)
 * Semana 1 y 2: Elementos del lenguaje, generalidades y conceptos básicos
 *
 * Los 4 pilares de la POO:
 *   1. Encapsulamiento: ocultar los datos internos de un objeto.
 *   2. Herencia: una clase puede heredar atributos y métodos de otra.
 *   3. Polimorfismo: un mismo método puede comportarse distinto según el objeto.
 *   4. Abstracción: modelar entidades del mundo real como clases.
 */
public class E4POO {

    // --- Clase base (abstracción + encapsulamiento) ---
    static class Figura {
        private String nombre;

        Figura(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        // Método que será sobreescrito (polimorfismo)
        public double calcularArea() {
            return 0;
        }

        public void mostrarInfo() {
            System.out.println("Figura: " + nombre + " | Área: " + calcularArea());
        }
    }

    // --- Clases hijas (herencia) ---
    static class Rectangulo extends Figura {
        private double base;
        private double altura;

        Rectangulo(double base, double altura) {
            // super() llama al constructor de Figura para inicializar 'nombre',
            // ya que es private y la clase hija no puede acceder directamente.
            // Debe ser siempre la primera línea del constructor.
            super("Rectángulo");
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }
    }

    static class Circulo extends Figura {
        private double radio;

        Circulo(double radio) {
            // Igual que en Rectangulo: delega la inicialización de 'nombre'
            // al constructor de Figura mediante super().
            super("Círculo");
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    // --- Main ---
    public static void main(String[] args) {

        // Polimorfismo: tratamos distintas figuras con la misma referencia
        Figura[] figuras = {
            new Rectangulo(5, 3),
            new Circulo(4)
        };

        System.out.println("=== Cálculo de áreas ===");
        for (Figura f : figuras) {
            f.mostrarInfo();
        }
    }
}
