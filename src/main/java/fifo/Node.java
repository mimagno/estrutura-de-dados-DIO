package fifo;

public class Node {
    private Object object;
    private Node refNo;

    public Node(Object object){
        this.refNo = null;
        this.object = object;
    }

    public Node(){

    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getRefNo() {
        return refNo;
    }

    public void setRefNo(Node refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
