import java.util.Scanner;

/**
 * Ejemplo 2 Interactivo: Lista Doble Dinámica
 * Permite llenar una lista doble con valores del usuario.
 */
public class E2ListaDobleBasicaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();
        
        System.out.print("¿Cuántos números desea agregar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i+1) + ": ");
            lista.insertarAlFinal(sc.nextInt());
        }

        System.out.println("\nLista creada:");
        lista.imprimirAdelante();
        lista.imprimirAtras();
    }
}
