package ex2;

public class Descarrega extends Thread {
    Bateria bateria;

    public Descarrega(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public void run() {
        if (bateria.plena) {
            System.out.println("Descarregant bateria...");
            while (!bateria.buida) {
                bateria.descarregar();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (bateria.buida) System.out.println("La bateria s'ha descarregat");
        } else System.out.println("No n'hi ha prou bateria " + bateria.getNivell() + "%");
    }
}
