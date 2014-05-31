package diego.proyecto1;

public class Perro {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String obtenerRegistro(){
        return "El perro que registraste es: " +nombre;
    }
}
