package lifo;

public class Main {
    public static <T> void main(String[] args) {

        Lifo<T> lifo = new Lifo<T>();

        lifo.push(new Node(1));
        lifo.push(new Node(2));
        lifo.push(new Node(3));
        lifo.push(new Node(4));
        lifo.push(new Node(5));
        lifo.push(new Node("ABC"));

        System.out.println(lifo);

//        System.out.println(lifo.pop());
//
//        System.out.println(lifo);

    }
}
