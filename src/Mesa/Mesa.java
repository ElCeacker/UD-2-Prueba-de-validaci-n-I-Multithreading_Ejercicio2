package Mesa;

public class Mesa {

    private int TOTAL_MAGDALENAS = 15;
    private int magdalenaDefault = 1;

    public synchronized void consumirMagdalena() {
        TOTAL_MAGDALENAS -= magdalenaDefault;
    }

    public int getMagdalenas() {
        return TOTAL_MAGDALENAS;
    }
}
