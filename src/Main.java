import comensales.Comensal;
import mesa.Mesa;

public class Main {
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa();

        Comensal gabriel = new Comensal("Gabriel", mesa1, 10);
        Comensal paco = new Comensal("Paco", mesa1, 5);
        Comensal pepe = new Comensal("Pepe", mesa1, 1);
    }
}