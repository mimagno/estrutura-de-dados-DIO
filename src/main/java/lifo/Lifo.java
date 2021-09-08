package lifo;

public class Lifo<T> {

    private Node<T> refInputNode;

    public Lifo(){
        this.refInputNode = null;
    }

    public T top(){
        return this.refInputNode.getData();
    }

    public void push(T obj){
        Node<T> newNode = new Node<>(obj);
        Node<T> refAux = this.refInputNode;
        this.refInputNode = newNode;
        this.refInputNode.setRefNode(refAux);
    }

    public T pop(){
        if(!this.isEmpty()){
            Node<T> nodePoped = this.refInputNode;
            this.refInputNode = this.refInputNode.getRefNode();
            return nodePoped.getData();
        }
        return null;
    }

    public Boolean isEmpty(){
        return this.refInputNode == null ? true : false;
    }

    @Override
    public String toString(){
        String stringReturn = "---------------\n";
        stringReturn += "     Stack\n";
        stringReturn += "---------------\n";

        Node<T> nodeAux = this.refInputNode;

        while (true){
            if (nodeAux != null){
                stringReturn += "[Node{data=" + nodeAux.getData() + "}]\n";
                nodeAux = nodeAux.getRefNode();
            }else {
                break;
            }
        }
        stringReturn += "===============\n";
        return stringReturn;
    }
}
