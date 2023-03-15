package java.Ejercicio1;
import java.util.Scanner;
import java.util.Date;


public class LocalDate implements Gestion{
    //Metodos para las fechas de alquiler de los ciclos
   public void fechaAlquiler(){
    Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el dia");
        int dia = teclado.nextInt();
        System.out.println("Introduzca el mes");
        int mes = teclado.nextInt();
        System.out.println("Introduzca el año");
        int año = teclado.nextInt();

        System.out.println("La fecha de alquiler es hasta el " );

        
        teclado.close();
   }
}
