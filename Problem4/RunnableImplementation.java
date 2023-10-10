public class RunnableImplementation implements Runnable {
    String toPrint;

    public void run() {
        for (int i = 0; i < 5; i++) {
            if (this.toPrint == "") {
                System.out.println(i);

            } else {
                System.out.println(this.toPrint);

            }
        }
    }

    public RunnableImplementation(String _toPrint) {
        this.toPrint = _toPrint;
    }

    public static void main(String[] args) {
        RunnableImplementation printNums = new RunnableImplementation("");
        RunnableImplementation printName = new RunnableImplementation("Sumaiya");

        Thread thread1 = new Thread(printNums);
        Thread thread2 = new Thread(printName);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread1.start();
    }
}
