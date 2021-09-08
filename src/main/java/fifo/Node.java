package fifo;

public class Node<T> {
    private T data;
    private Node<T> refNo;

    public Node(T object){
        this.refNo = null;
        this.data = object;
    }

    public Node(){

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(Node<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
