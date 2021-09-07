package lifo;

public class Node<T> {

    private T data;
    private Node<T> refNode;

    public Node(T data) {
        this.refNode = null;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getRefNode() {
        return this.refNode;
    }

    public void setRefNode(Node<T> refNode) {
        this.refNode = refNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "dado=" + this.data +
                '}';
    }
}
