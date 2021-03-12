package ex2;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria(0);
        Menu menu = new Menu();

        Descarrega descarrega;
        Carrega carrega;

        int opcio;

        opcio = menu.menuPrincipal();
        while (opcio != 0) {
            switch (opcio) {
                case 1:
                    carrega = new Carrega(bateria);
                    carrega.start();
                    break;
                case 2:
                    descarrega = new Descarrega(bateria);
                    descarrega.start();
                    break;
                case 3:
                    System.out.println("Estat de la bateria: " + bateria.getNivell() + "%");
                    break;
                case 0:
                    System.out.println("ey");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valor introduit incorrecte.");
                    break;

            }
            opcio = menu.menuPrincipal();
        }
    }
}
