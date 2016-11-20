/**
 * Node for singely Linkedlist.
 * Wrapper that stores object and is able to be connected to other Nodes via pointers.
 */
public class LinkedListNode {

    private ReturnObject item;
    private LinkedListNode nextNode;


    public LinkedListNode(Object item) {
        // constructs a new ReturnObject
        this.item = new ReturnObjectImpl(item);
    }

    public ReturnObject getItem() {
        // retrieves item from node.
        return item;
    }

    public LinkedListNode getNextNode() {
        // getter for nextNode.
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        // setter for nextNode.
        this.nextNode = nextNode;
    }

}
