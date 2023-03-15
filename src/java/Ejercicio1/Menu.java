package java.Ejercicio1;

import java.util.Scanner;

public class Menu implements Gestion{
    Scanner teclado = new Scanner(System.in);

    public void menuPrincipal(){
        int opcion;

        System.out.println("BIENVENIDO A LA EMPRESA DE ALQUILER DE CICLOS Y GIROSCOPIOS");
        System.out.println("1.- Alquilar un ciclo");
        System.out.println("2.- Revisar alquileres activos");
        System.out.println("3.- Salir");

        boolean salir = false;
        opcion = teclado.nextInt();

        do{
            try{
                switch (opcion) {
                    case 1:
                        menuCiclos();
                        break;
                    case 2:
                        Gestion.mostrarAlquileres();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        
                        break;
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }while(salir == false);
    }

    public void menuCiclos() {
        int opcion;
        
        System.out.println("-----Tarifas alquiler de ciclos-----");
        System.out.println("1.- Bicis Lapierre speed 400 (1 año) 27 velocidades 4,90€/hora");
        System.out.println("2.- Bicis Btwin riverside 900 (0 años) 10 velocidades 4,90€/hora");
        System.out.println("3.- Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min] 9,90€/hora");
        System.out.println("4.- Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min] 9,90€/hora");
        System.out.println("5.- Segways Immotion v8 (0 años) 40 km de autonomía 18,90€/hora");
        System.out.println("6.- Segways Segway Ninebot One E+ (0 años) 30 km de autonomía 18,90€/hora");
        System.out.println("7.- Salir");
        
        boolean salir = false;
        opcion = teclado.nextInt();
    
        do{
            try{
                switch (opcion) {
                    case 1:
                        Gestion.alquilarLapierre();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        
                        break;
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }while(salir == false);

    }

   

}
