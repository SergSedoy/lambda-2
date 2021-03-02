package javaCore.homework1_2;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) callback.onDone("Task " + i + " is done");
        }
    }

    public void start2() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) errorCallback.onError("Task " + i + " is not done!!!");
        }
    }
}
