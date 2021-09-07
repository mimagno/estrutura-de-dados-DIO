package lifo;

public class Lifo<T> {

    private Node<T> refInputNode;

    public Lifo(){
        this.refInputNode = null;
    }

    public Node<T> top(){
        return this.refInputNode;
    }

    public void push(Node newNo){
        Node<T> refAux = this.refInputNode;
        this.refInputNode = newNo;
        this.refInputNode.setRefNode(refAux);
    }

    public Node<T> pop(){
        if(!this.isEmpty()){
            Node<T> nodePoped = this.refInputNode;
            this.refInputNode = this.refInputNode.getRefNode();
            return nodePoped;
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

        Node nodeAux = this.refInputNode;

        while (true){
            if (nodeAux != null){
                stringReturn += "[Node{dado=" + nodeAux.getData() + "}]\n";
                nodeAux = nodeAux.getRefNode();
            }else {
                break;
            }
        }
        stringReturn += "===============\n";
        return stringReturn;
    }
}
