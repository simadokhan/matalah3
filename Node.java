public class Node {
    private int value;
    private  Node next ;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public String toString(){
        return String.valueOf(value); // Convert the integer value to a String
    }
}
