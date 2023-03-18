package java.Ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Fecha implements Gestion{
    //Metodos para las fechas de alquiler de los ciclos

    int dia;
    int mes;
    int año;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void fechaAlquiler(){
        ArrayList<Integer> fechas = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el dia");
         dia = teclado.nextInt();
        if (dia > 31 || dia < 1){
            System.out.println("El dia introducido no es valido");
            System.out.println("Introduzca el dia");
            dia = teclado.nextInt();
        }
        System.out.println("Introduzca el mes");
         mes = teclado.nextInt();
        if (mes > 12 || mes < 1){
            System.out.println("El mes introducido no es valido");
            System.out.println("Introduzca el mes");
            mes = teclado.nextInt();
        }
        System.out.println("Introduzca el año");
         año = teclado.nextInt();
        if (año < 2023){
            System.out.println("El año introducido no es valido");
            System.out.println("Introduzca el año");
            año = teclado.nextInt();
        }

        System.out.println("El alquiler comienza el: " + LocalDate.now() +
                "\nLa fecha de alquiler es hasta el " + LocalDate.of(año, mes, dia));


        ((ArrayList<Integer>) fechas).add(getDia());

        teclado.close();
   }
}
