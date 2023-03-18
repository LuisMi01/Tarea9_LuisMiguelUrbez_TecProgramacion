package java.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public interface Gestion{
    Scanner teclado = new Scanner(System.in);
    Menu menu = new Menu();
    ArrayList<String> alquileres = new ArrayList<String>();
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
            Fecha fecha = new Fecha();
            fecha.fechaAlquiler();

            System.out.println("Su reserva se ha confirmado a nombre de "
                    + nombre + " con DNI " + dni + " y telefono " + telefono);
            alquileres.add(nombre);
        }else if(respuesta.equals("No") || respuesta.equals("no")) {
            System.out.println("Redirigiendo al menu de bicicletas");
            menu.menuCiclos();
        }
    }

    public static void alquilarBtwin(){
        System.out.println("Ha elegido la bicicleta Btwin" );
        System.out.println("Datos principales de la bicicleta: \n" +
        "Marca: Btwin \n" +
        "Modelo: Riverside 900 \n" +
        "Precio por hora: 4,90€ \n" +
        "Numero de marchas: 10 \n");

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
            Fecha fecha = new Fecha();
            fecha.fechaAlquiler();

            System.out.println("Su reserva se ha confirmado a nombre de "
                    + nombre + " con DNI " + dni + " y telefono " + telefono);
            alquileres.add(nombre);
        }else if(respuesta.equals("No") || respuesta.equals("no")) {
            System.out.println("Redirigiendo al menu de bicicletas");
            menu.menuCiclos();
        }
    }

    public static void alquilarSegway(){
        System.out.println("Ha elegido el giroscopio Segway" );
        System.out.println("Datos principales del giroscopio: \n" +
        "Marca: Segway \n" +
        "Modelo: Nine \n" +
        "Precio por hora: 9,90€ \n" +
        "Autonomia: 40 km \n");

        System.out.println("¿Desea alquilar este giroscopio? (S/N)");
        String respuesta = teclado.nextLine();

        if (respuesta.equals("Si") || respuesta.equals("si")){
            System.out.println("Introduzca su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Introduzca su DNI");
            String dni = teclado.nextLine();
            System.out.println("Introduzca su numero de telefono");
            String telefono = teclado.nextLine();
            System.out.println("Introduzca la fecha de alquiler");
            Fecha fecha = new Fecha();
            fecha.fechaAlquiler();

            System.out.println("Su reserva se ha confirmado a nombre de "
                    + nombre + " con DNI " + dni + " y telefono " + telefono);
            alquileres.add(nombre);
        }else if(respuesta.equals("No") || respuesta.equals("no")) {
            System.out.println("Redirigiendo al menu de giroscopios");
            menu.menuCiclos();
        }
    }
    public static void alquilarWeebot(){
        System.out.println("Ha elegido el giroscopio Weebot" );
        System.out.println("Datos principales del giroscopio: \n" +
        "Marca: Weebot \n" +
        "Modelo: Echo 1 \n" +
        "Precio por hora: 9,90€ \n" +
        "Autonomia: 35 km \n");

        System.out.println("¿Desea alquilar este giroscopio? (S/N)");
        String respuesta = teclado.nextLine();

        if (respuesta.equals("Si") || respuesta.equals("si")){
            System.out.println("Introduzca su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Introduzca su DNI");
            String dni = teclado.nextLine();
            System.out.println("Introduzca su numero de telefono");
            String telefono = teclado.nextLine();
            System.out.println("Introduzca la fecha de alquiler");
            Fecha fecha = new Fecha();
            fecha.fechaAlquiler();

            System.out.println("Su reserva se ha confirmado a nombre de "
                    + nombre + " con DNI " + dni + " y telefono " + telefono);
            alquileres.add(nombre);
        }else if(respuesta.equals("No") || respuesta.equals("no")) {
            System.out.println("Redirigiendo al menu de giroscopios");
            menu.menuCiclos();
        }
    }

    public static void alquilarImmotion(){
        System.out.println("Ha elegido el Segway Immotion" );
        System.out.println("Datos principales del Segway: \n" +
        "Marca: Immotion \n" +
        "Modelo: V8 \n" +
        "Precio por hora: 18,90€ \n" +
        "Autonomia: 40 km \n");

        System.out.println("¿Desea alquilar este giroscopio? (S/N)");
        String respuesta = teclado.nextLine();

        if (respuesta.equals("Si") || respuesta.equals("si")){
            System.out.println("Introduzca su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Introduzca su DNI");
            String dni = teclado.nextLine();
            System.out.println("Introduzca su numero de telefono");
            String telefono = teclado.nextLine();
            System.out.println("Introduzca la fecha de alquiler");
            Fecha fecha = new Fecha();
            fecha.fechaAlquiler();

            System.out.println("Su reserva se ha confirmado a nombre de "
                    + nombre + " con DNI " + dni + " y telefono " + telefono);
            alquileres.add(nombre);
        }else if(respuesta.equals("No") || respuesta.equals("no")) {
            System.out.println("Redirigiendo al menu de giroscopios");
            menu.menuCiclos();
        }
    }

    public static void alquilarNinebot(){
        System.out.println("Ha elegido el Segway Ninebot" );
        System.out.println("Datos principales del Segway: \n" +
        "Marca: Ninebot \n" +
        "Modelo: One E+ \n" +
        "Precio por hora: 14,90€ \n" +
        "Autonomia: 30 km \n");

        System.out.println("¿Desea alquilar este giroscopio? (S/N)");
        String respuesta = teclado.nextLine();

        if (respuesta.equals("Si") || respuesta.equals("si")){
            System.out.println("Introduzca su nombre");
            String nombre = teclado.nextLine();
            System.out.println("Introduzca su DNI");
            String dni = teclado.nextLine();
            System.out.println("Introduzca su numero de telefono");
            String telefono = teclado.nextLine();
            System.out.println("Introduzca la fecha de alquiler");
            Fecha fecha = new Fecha();
            fecha.fechaAlquiler();

            System.out.println("Su reserva se ha confirmado a nombre de "
                    + nombre + " con DNI " + dni + " y telefono " + telefono);
            alquileres.add(nombre);
        }else if(respuesta.equals("No") || respuesta.equals("no")) {
            System.out.println("Redirigiendo al menu de giroscopios");
            menu.menuCiclos();
        }
    }

    public static void mostrarAlquileres(){
        System.out.println("Se van a mostrar los alquileres actuales de los ciclos:");
        for (int i = 0; i < alquileres.size(); i++) {
            System.out.println(alquileres.get(i));
        }
    }


}
