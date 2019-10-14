package edu.QueueByLinkedList;

public class Node {
    private Object object;
    private Node leftNode;
    private Node rightNode;

    Node(Object o) {
        this.object = o;
        this.leftNode = null;
        this.rightNode = null;
    }

    Node(Object o, Node leftNode, Node rightNode) {
        this.object = o;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Object removeNode() {
        if (this.leftNode != null) {
            this.leftNode.setRightNode(this.rightNode);
        }
        if (this.rightNode != null) {
            this.rightNode.setLeftNode(this.leftNode);
        }
        return this.object;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }
}
