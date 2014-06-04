package diego.proyecto1;

public class Gato {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerRegistro(){
        return "El gatito que registraste es: " +nombre;
    }
}
