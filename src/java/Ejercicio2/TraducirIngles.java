package java.Ejercicio2;

public class TraducirIngles implements Traducir {
    public String introducirDistancia() {
        return "Enter distance: ";
    }
    public String introducirTiempo() {
        return "Enter time: ";
    }
    public String inicioRespuesta() {
        return "Speed is ";
    }
    public void finRespuesta(String respuesta) {
        System.out.println(respuesta + " km/h");
    }

}
