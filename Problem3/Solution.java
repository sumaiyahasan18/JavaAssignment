public class Solution implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (this.toPrint == "") {
                System.out.println(  i);

            } else {
                System.out.println(  this.toPrint);

            }
        }
    }

    String toPrint = "";

    public Solution(String _toPrint) {
        this.toPrint = _toPrint;
    }

    public static void main(String[] args) {
        Solution printNums = new Solution("");
        Solution printName = new Solution("Sumaiya");

        Thread thread1 = new Thread(printNums);
        Thread thread2 = new Thread(printName);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread1.start();

    }
}
