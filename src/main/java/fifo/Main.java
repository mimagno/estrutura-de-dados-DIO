package fifo;

public class Main {
    public static <T> void main(String[] args) {
        Fifo fifo = new Fifo();

        fifo.enqueue(1);
        fifo.enqueue(2);
        fifo.enqueue(3);
        fifo.enqueue(4);
        fifo.enqueue("ABC");

        System.out.println(fifo);
        System.out.println(fifo.first());
    }
}
