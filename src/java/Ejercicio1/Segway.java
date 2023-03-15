package java.Ejercicio1;

public class Segway extends Ciclos{
    //Marca, modelo y fecha de compra y autonomia y altura minima manillar

    double alturaManillar;
    int autonomia; //KM


    public Segway(String marca, String modelo, int fechaCompra,double precioHora, double alturaManillar, int autonomia) {
        super(marca, modelo, fechaCompra, precioHora);
        this.alturaManillar = alturaManillar;
        this.autonomia = autonomia;
        
    }

    public double getAlturaManillar() {
        return this.alturaManillar;
    }

    public void setAlturaManillar(double alturaManillar) {
        this.alturaManillar = alturaManillar;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    
}
