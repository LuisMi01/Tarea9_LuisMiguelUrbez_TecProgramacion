package java.Ejercicio1;

public class Giroscopio extends Ciclos{
    //Marca, modelo y fecha de compra y autonomia

    int autonomia; //KM
    

    public Giroscopio(String marca, String modelo, double precioHora, int fechaCompra, int autonomia) {
        super(marca, modelo, fechaCompra, precioHora);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

}
