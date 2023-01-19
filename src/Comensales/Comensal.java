package Comensales;

import Mesa.Mesa;

public class Comensal implements Runnable{

    private String name;
    private Mesa mesa;
    private int prioridad;
    private boolean magdalenas = true;

    public Comensal(String name, Mesa mesa, int prioridad) {
        this.name = name;
        this.mesa = mesa;
        this.prioridad = prioridad;
        Thread hilo = new Thread(this);
        hilo.setPriority(prioridad);
        hilo.start();
    }

    @Override
    public void run() {
        try {
            while (mesa.getMagdalenas() > 0) {
                System.out.println(this.name + " ha cogido una magdalena");
                mesa.consumirMagdalena();
                Thread.sleep(10000);
                System.out.println(this.name + " se ha terminado de comer una magdalena");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
