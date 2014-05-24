package diego.proyecto1;

public class ContadorVisitas {
    
   private static int cont;
   
   
    public static int getCont() {
        cont ++;
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
   
}
