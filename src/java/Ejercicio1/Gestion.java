package java.Ejercicio1;

import java.util.Scanner;

public interface Gestion{
    Scanner teclado = new Scanner(System.in);
    public static void alquilarLapierre(){
        System.out.println("Ha elegido la bicicleta Lapierre" );
        System.out.println("Datos principales de la bicicleta: \n" +
        "Marca: Lapierre \n" +
        "Modelo: Speed 400 \n" +
        "Precio por hora: 4,90€ \n" +
        "Numero de marchas: 27 \n");

        System.out.println("¿Desea alquilar esta bicicleta? (S/N)");
        String respuesta = teclado.nextLine();

        if (respuesta.equals("Si") || respuesta.equals("si")){
            System.out.println("Introduzca su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Introduzca su DNI");
            String dni = teclado.nextLine();
            System.out.println("Introduzca su numero de telefono");
            String telefono = teclado.nextLine();
            System.out.println("Introduzca la fecha de alquiler");
            //Fecha de alquiler de la clase LocalDate

            System.out.println("Su reserva se ha confirmado a nombre de " + nombre + " con DNI " + dni + " y telefono " + telefono);
        }else if(respuesta.equals("No") || respuesta.equals("no")){

        }

        

    }
    public static void mostrarAlquileres(){

    }


}
