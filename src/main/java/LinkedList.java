public class LinkedList {

    public INode head;
    public INode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtFirst(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void insertAtLast(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            INode tempNode = this.tail;
            this.tail = newNode;
            tempNode.setNext(newNode);
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void insert(INode myNode, INode newNode) {
        this.head.setNext(myNode);
        myNode.setNext(newNode);
    }

    public INode deleteFirst() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = this.head;

        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        tail = tempNode;
        tempNode = null;
        return tempNode;
    }

    public void search(INode myNode) {
        INode tempNode = head;
        while (tempNode.getNext() != myNode) {
            tempNode = tempNode.getNext();
        }
        tempNode = tempNode.getNext();
        System.out.println("Searched Element is: " + tempNode.getKey());
    }
}
