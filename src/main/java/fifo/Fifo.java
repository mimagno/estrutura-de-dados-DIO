package fifo;

public class Fifo {

    private Node refInputFifo;

    public Fifo(){
        this.refInputFifo = null;
    }

    public void enqueue(Node newNode){
        newNode.setRefNo(refInputFifo);
        refInputFifo = newNode;
    }

    public Node dequeue(){
        if(!this.isEmpty()){
            Node firstNode = refInputFifo;
            Node nodeAux = refInputFifo;
            while (true){
                if (firstNode.getRefNo() != null){
                    nodeAux = firstNode;
                    firstNode = firstNode.getRefNo();
                }else {
                    nodeAux.setRefNo(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public Node first(){
        if(!this.isEmpty()){
            Node firstNode = refInputFifo;
            while (true){
                if (firstNode.getRefNo() != null){
                    firstNode = firstNode.getRefNo();
                }else {
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public Boolean isEmpty(){
        return this.refInputFifo == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "";

        Node nodeAux = refInputFifo;

        if (refInputFifo != null){
            while (true){
                stringReturn += "[Node{objeto=" + nodeAux.getObject() + "}]--->";
                if (nodeAux.getRefNo() != null){
                    nodeAux = nodeAux.getRefNo();
                }else {
                    stringReturn += "null";
                    break;
                }
            }
        }else {
            stringReturn = "null";
        }

        return stringReturn;
    }
}
