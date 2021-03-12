import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeTest {
    Node<Integer> node;

    @Test
    public void returnTrue_when_append3NewNodeToFront() {
        Node<Integer> myFirstNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(56);
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        System.out.println("Before");
        node.printKeys(myFirstNode.getKey());
        node.printKeys(mySecondNode.getKey());
        node.printKeys(myThirdNode.getKey());
        System.out.println("After");
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void returnTrue_When_append3NewNode_ToLast() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        System.out.println("Before");
        node.printKeys(myFirstNode.getKey());
        node.printKeys(mySecondNode.getKey());
        node.printKeys(myThirdNode.getKey());
        System.out.println("After");
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
    @Test
    public void returnTrue_When_insertNewNode() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        System.out.println("Before ");
        myLinkedList.printMyNodes();



        myLinkedList.insert(mySecondNode, myThirdNode);
        System.out.println("After");
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void returnTrue_When_deleteFirstElement_ByUsing_pop() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();

        myLinkedList.pop();
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}



