import java.util.Scanner;

/**
 * Ejercicio 4 (Interactivo) - Programación Orientada a Objetos (POO)
 * Semana 1 y 2: Elementos del lenguaje, generalidades y conceptos básicos
 *
 * El usuario crea sus propias figuras ingresando el tipo y las medidas.
 * Cada figura es un objeto distinto pero comparte el mismo método calcularArea(),
 * demostrando los 4 pilares de la POO en acción:
 *
 *   1. Encapsulamiento : los atributos son private, se accede por métodos.
 *   2. Herencia        : Rectangulo y Circulo extienden Figura con super().
 *   3. Polimorfismo    : calcularArea() se comporta distinto en cada clase.
 *   4. Abstracción     : Figura modela el concepto general de una figura geométrica.
 */
public class E4POOInput {

    // ---------------------------------------------------------------
    // Clase base — Abstracción + Encapsulamiento
    // ---------------------------------------------------------------
    static class Figura {

        // private: solo accesible desde esta clase (encapsulamiento)
        private String nombre;

        // Constructor base: inicializa el atributo privado
        Figura(String nombre) {
            this.nombre = nombre;
        }

        // Getter: única forma que tienen las clases externas de leer 'nombre'
        public String getNombre() {
            return nombre;
        }

        // Método que las subclases sobreescribirán (polimorfismo)
        public double calcularArea() {
            return 0;
        }

        public void mostrarInfo() {
            System.out.printf("  %-15s | Área: %.4f%n", nombre, calcularArea());
        }
    }

    // ---------------------------------------------------------------
    // Clase hija — Herencia: Rectangulo extiende Figura
    // ---------------------------------------------------------------
    static class Rectangulo extends Figura {

        private double base;
        private double altura;

        Rectangulo(double base, double altura) {
            // super() llama al constructor de Figura para inicializar 'nombre',
            // ya que es private y la clase hija no puede acceder directamente.
            // Debe ser siempre la primera línea del constructor.
            super("Rectángulo");
            this.base   = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura; // base × altura
        }
    }

    // ---------------------------------------------------------------
    // Clase hija — Herencia: Circulo extiende Figura
    // ---------------------------------------------------------------
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
            return Math.PI * radio * radio; // π × r²
        }
    }

    // ---------------------------------------------------------------
    // Clase hija — Herencia: Triangulo extiende Figura (nueva figura)
    // ---------------------------------------------------------------
    static class Triangulo extends Figura {

        private double base;
        private double altura;

        Triangulo(double base, double altura) {
            super("Triángulo");
            this.base   = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2; // (base × altura) / 2
        }
    }

    // ---------------------------------------------------------------
    // Main — el usuario crea sus figuras
    // ---------------------------------------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Calculadora de Figuras — POO Interactiva");
        System.out.println("==============================================");

        // Arreglo de Figura: puede guardar cualquier objeto hijo (polimorfismo)
        Figura[] figuras = new Figura[3];

        System.out.println("\nVas a registrar 3 figuras geométricas.");
        System.out.println("Opciones: 1=Rectángulo  2=Círculo  3=Triángulo\n");

        for (int i = 0; i < figuras.length; i++) {

            System.out.println("--- Figura " + (i + 1) + " ---");
            System.out.print("Elige el tipo (1/2/3): ");
            int tipo = sc.nextInt();

            // Según el tipo ingresado, creamos el objeto correspondiente
            // Todos son de tipo Figura (polimorfismo): un mismo arreglo, varios comportamientos
            if (tipo == 1) {
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                figuras[i] = new Rectangulo(base, altura);

            } else if (tipo == 2) {
                System.out.print("Radio: ");
                double radio = sc.nextDouble();
                figuras[i] = new Circulo(radio);

            } else {
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                figuras[i] = new Triangulo(base, altura);
            }
        }

        // --- Recorrido polimórfico ---
        // Llamamos al MISMO método mostrarInfo() en cada objeto,
        // pero calcularArea() se ejecuta diferente en cada clase hija
        System.out.println("\n============ Reporte de Figuras ============");
        System.out.printf("  %-15s | %s%n", "Figura", "Área");
        System.out.println("  --------------------------------");

        double areaTotal = 0;
        for (Figura f : figuras) {
            f.mostrarInfo();        // polimorfismo: cada figura calcula su área distinto
            areaTotal += f.calcularArea();
        }

        System.out.println("  --------------------------------");
        System.out.printf("  %-15s | %.4f%n", "ÁREA TOTAL", areaTotal);

        System.out.println("\n--- ¿Qué demostró este ejercicio? ---");
        System.out.println("  Encapsulamiento : 'nombre' es private, solo accesible por getNombre()");
        System.out.println("  Herencia        : Rectangulo, Circulo y Triangulo extienden Figura");
        System.out.println("  super()         : cada hija le delega a Figura inicializar 'nombre'");
        System.out.println("  Polimorfismo    : calcularArea() hace cosas distintas según el objeto");
        System.out.println("  Abstracción     : Figura modela el concepto general de figura geométrica");

        sc.close();
    }
}
