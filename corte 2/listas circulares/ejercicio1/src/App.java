/* 1. Ruleta de Sorteos (Sistema de Rifa Digital)
Una empresa organiza una rifa y quiere un sistema que “gire” la rueda de participantes hasta detenerse en un ganador.

La Clase Participante (Nodo): Debe contener nombre (String), numeroBoleta (int) y ciudad (String).
El Problema: Los participantes se registran en orden de llegada formando un ciclo. Para realizar el sorteo, 
el sistema avanza un número aleatorio de posiciones desde la cabeza y el participante en el que se detiene es el ganador.
Reto: Implementa el método realizarSorteo(int pasos) que avance pasos posiciones desde la cabeza y muestre 
el nombre y número de boleta del participante seleccionado. Luego, elimina al ganador de la lista para que no 
pueda ganar de nuevo, y muestra la lista actualizada. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Sorteo Sorteo = new Sorteo();

        do {
            System.out.println("\n==============================================");
            System.out.println("   Sorteo — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. agregarParticipante");
            System.out.println("2. mostrarParticipantes");
            System.out.println("3. realizarSorteo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                        System.out.print("Ingrese el nombre del participante: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese el número de boleta: ");
                        int numeroBoleta = sc.nextInt();
                        System.out.print("Ingrese la ciudad del participante: ");
                        String ciudad = sc.next();
                        Participante nuevoParticipante = new Participante(nombre, numeroBoleta, ciudad);
                        Sorteo.agregarParticipante(nuevoParticipante);                    
                    break;

                case 2:
                    System.out.println("Lista de Participantes:");
                    Sorteo.mostrarParticipantes();
                    break;

                case 3:
                    System.out.print("Ingrese el número de pasos para el sorteo: ");
                    int pasos = sc.nextInt();
                    Sorteo.realizarSorteo(pasos);
                    break;
                
                case 0:
                    System.out.println("¡Saliendo del sorteo!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
