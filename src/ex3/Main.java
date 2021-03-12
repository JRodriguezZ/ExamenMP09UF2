package ex3;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int i = 20;
        int j = 6;

        ForkJoinPool pool = new ForkJoinPool();
        MCDTask tasca = new MCDTask(i,j);

        long result1 = pool.invoke(tasca);
        int resultat = tasca.join();

        System.out.println("Maxim Comu Divisor de " + i + " i " + j + ": " + resultat);
    }
}
