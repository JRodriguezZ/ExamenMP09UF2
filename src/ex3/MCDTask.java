package ex3;

import java.util.concurrent.RecursiveTask;

public class MCDTask extends RecursiveTask<Integer> {

    private int limite = 20;
    private int A;
    private int B;
    public MCDTask(int i, int j){
        A = i;
        B = j;
    }

    public int mcdIterative(int i, int j){
        int temp;
        while (j != 0) {
            temp = j;
            j = i % j;
            i = temp;
        }
        return i;
    }

    public int mcdRecursive(int i, int j) {
        if (j == 0) {
            return i;
        } else return mcdRecursive(j,i % j);

    }

    @Override
    protected Integer compute() {
        if(A < limite){
            return mcdIterative(A,B);
        } else {
            return mcdRecursive(A,B);
        }
    }
}
