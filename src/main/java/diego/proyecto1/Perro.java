package diego.proyecto1;

public class Perro implements Mascota {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String obtenerRegistro(){
        return "El perro que registraste es: " +nombre;
    }
}
