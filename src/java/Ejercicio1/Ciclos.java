package java.Ejercicio1;

import java.sql.Array;

public abstract class Ciclos{
    //Datos basicos para los ciclos 
     //Marca, modelo y fecha de compra

    String marca;
    String modelo;
    int fechaCompra;
    double precioHora;
    Array[] ciclos = new Array[6];

    public Ciclos(String marca, String modelo, int fechaCompra, double precioHora) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.precioHora = precioHora;
    }


    public void anadirCiclos(){
    
        Bicicleta Lapierre = new Bicicleta("Lapierre", "speed 400", 4.90, 1,27 );
        Bicicleta Btwin = new Bicicleta("Btwin", "riverside 900", 4.90, 0, 10);
        Giroscopio Giro1 = new Giroscopio("Segway", "Nine", 9.90, 0, 40);
        Giroscopio Weebot = new Giroscopio("Weebot", "Echo",9.90, 1, 35);
        Segway Immotion = new Segway("Immotion", "v8", 0, 18.90, 1.5, 40);
        Segway Segway = new Segway("Segway", "Ninebot One E+", 0, 18.90, 1.70, 30);
    
        ciclos[0]= (Array) Lapierre;
        ciclos[1]= (Array) Btwin;
        ciclos[2]= (Array) Giro1;
        ciclos[3]= (Array) Weebot;
        ciclos[4]= (Array) Immotion;
        ciclos[5]= (Array) Segway;
    
    }

    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFechaCompra() {
        return this.fechaCompra;
    }

    public void setFechaCompra(int fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

}
