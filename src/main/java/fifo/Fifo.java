package fifo;

public class Fifo<T> {

    private Node<T> refInputFifo;

    public Fifo(){
        this.refInputFifo = null;
    }

    public void enqueue(T obj){
        Node<T> newNode = new Node<>(obj);
        newNode.setRefNo(refInputFifo);
        refInputFifo = newNode;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Node<T> firstNode = refInputFifo;
            Node<T> nodeAux = refInputFifo;
            while (true){
                if (firstNode.getRefNo() != null){
                    nodeAux = firstNode;
                    firstNode = firstNode.getRefNo();
                }else {
                    nodeAux.setRefNo(null);
                    break;
                }
            }
            return firstNode.getData();
        }
        return null;
    }

    public T first(){
        if(!this.isEmpty()){
            Node<T> firstNode = refInputFifo;
            while (true){
                if (firstNode.getRefNo() != null){
                    firstNode = firstNode.getRefNo();
                }else {
                    break;
                }
            }
            return firstNode.getData();
        }
        return null;
    }

    public Boolean isEmpty(){
        return this.refInputFifo == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "";

        Node<T> nodeAux = refInputFifo;

        if (refInputFifo != null){
            while (true){
                stringReturn += "[Node{data=" + nodeAux.getData() + "}]--->";
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
