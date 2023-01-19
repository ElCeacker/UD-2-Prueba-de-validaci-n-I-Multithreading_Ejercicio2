package Mesa;

public class Mesa {

    private int TOTAL_MAGDALENAS = 15;
    private int magdalenaDefault = 1;

    public synchronized void consumirMagdalena() {
        if (TOTAL_MAGDALENAS <= 0) {
            System.out.println("Ya no quedan magdalenas");
        } else {
            TOTAL_MAGDALENAS -= magdalenaDefault;
        }
    }

    public int getMagdalena() {
        return TOTAL_MAGDALENAS;
    }
}
