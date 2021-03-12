package ex2;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int opcio;
    public int menuPrincipal(){
        System.out.println("---- Menu Principal ----");
        System.out.println("1. Carregar bateria");
        System.out.println("2. Jugar");
        System.out.println("3. Estat de la bateria");
        System.out.println("0. Sortir");

        opcio = scanner.nextInt();
        return opcio;
    }
}
