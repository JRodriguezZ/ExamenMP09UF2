package ex2;

public class Carrega extends Thread {
    Bateria bateria;

    public Carrega(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public void run() {
        if (bateria.buida) {
            System.out.println("Carregant bateria...");
            while (!bateria.carregada()) {
                bateria.carregar();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (bateria.plena) System.out.println("La bateria s'ha omplert");
        } else System.out.println("La bateria ja esta plena o s'esta buidant");
    }
}
