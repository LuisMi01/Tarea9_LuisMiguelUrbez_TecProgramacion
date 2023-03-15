package java.Ejercicio1;

public class Bicicleta  extends Ciclos{

    //Marca, modelo y fecha de compra y marchas

    int numMarchas;

    public Bicicleta(String marca, String modelo, double precioHora, int fechaCompra, int numMarchas) {
        super(marca, modelo, fechaCompra, precioHora);
        this.numMarchas = numMarchas;
    }

    public int getNumMarchas() {
        return this.numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }
    
}
