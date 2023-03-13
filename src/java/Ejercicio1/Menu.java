package java.Ejercicio1;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    public void menu() {
        int opcion;
        
        System.out.println("BIENVENIDO A LA EMPRESA DE ALQUILER DE CICLOS Y GIROSCOPIOS");
        System.out.println("1.- Bicis Lapierre speed 400 (1 año) 27 velocidades 4,90€/hora");
        System.out.println("2.- Bicis Btwin riverside 900 (0 años) 10 velocidades 4,90€/hora");
        System.out.println("3.- Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min] 9,90€/hora");
        System.out.println("4.- Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min] 9,90€/hora");
        System.out.println("5.- Segways Immotion v8 (0 años) 40 km de autonomía 18,90€/hora");
        System.out.println("6.- Segways Segway Ninebot One E+ (0 años) 30 km de autonomía 18,90€/hora");
        System.out.println("7.- Salir");
        

        opcion = teclado.nextInt();
    
        do{
            try{
                switch (opcion) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    default:
                        
                        break;
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }while(opcion != 3);

    }

}
