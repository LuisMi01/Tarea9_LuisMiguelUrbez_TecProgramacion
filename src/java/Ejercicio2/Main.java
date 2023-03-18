package java.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose language (1 for English, 2 for Spanish): ");
        int languageChoice = scanner.nextInt();

        Traducir traduccion;

        if (languageChoice == 1) {
            traduccion = new TraducirIngles();
        } else {
            traduccion = (Traducir) new TraducirEspanol();
        }

        String distanciaMsg = traduccion.introducirDistancia();
        System.out.print(distanciaMsg);
        double distancia = scanner.nextDouble();

        String tiempoMsg = traduccion.introducirTiempo();
        System.out.print(tiempoMsg);
        double tiempo = scanner.nextDouble();

        double velocidad = distancia / tiempo;

        String respuestaMsg = traduccion.inicioRespuesta();
        traduccion.finRespuesta(respuestaMsg + velocidad);
    }
}
