package fifo;

public class Main {
    public static void main(String[] args) {
        Fifo fifo = new Fifo();

        fifo.enqueue(new Node(1));
        fifo.enqueue(new Node(2));
        fifo.enqueue(new Node(3));
        fifo.enqueue(new Node(4));
        fifo.enqueue(new Node(5));

        System.out.println(fifo);
    }
}
