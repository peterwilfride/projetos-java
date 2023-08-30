package project.gradle;

public class ClasseThread implements Runnable {
    private int id;
    private int data;

    public ClasseThread(int id, int data) {
        this.id = id;
        this.data = data;
    }

    public void run() {
        if (id == 1) {
            System.out.println("Thread 1: " + data);
            /*for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
            }*/
        } else if(id == 2) {
            System.out.println("Thread 2: " + data);
            /*for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 2: " + i);
            }*/
        }
    }
}