package diego.proyecto1;


public class ProbarRegistro {

    public static void main(String[] args) {
        Perro p = new Perro();
        p.setNombre("Snoopy");
        Persona nm = new Persona();
        nm.setPerro(p);
        System.out.println(nm.getPerro().getNombre());
        
    }
}
