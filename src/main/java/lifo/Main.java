package lifo;

public class Main {
    public static <T> void main(String[] args) {

        Lifo lifo = new Lifo();

       lifo.push(1);
       lifo.push(2);
       lifo.push(3);
       lifo.push(4);
       lifo.push(5);
       lifo.push("ABC");

       System.out.println(lifo);
       System.out.println(lifo.top());
       System.out.println(lifo.pop());
       System.out.println(lifo);

//        System.out.println(lifo.pop());
//
//        System.out.println(lifo);

    }
}
