package javaCore.homework1_2;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener2 = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();

        Worker worker2 = new Worker(listener2);
        worker2.start2();

    }
}
