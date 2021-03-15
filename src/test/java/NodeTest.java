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

        myLinkedList.insertAtFirst(myFirstNode);
        myLinkedList.insertAtFirst(mySecondNode);
        myLinkedList.insertAtFirst(myThirdNode);
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
        myLinkedList.insertAtLast(myFirstNode);
        myLinkedList.insertAtLast(mySecondNode);
        myLinkedList.insertAtLast(myThirdNode);
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
        myLinkedList.insertAtLast(myFirstNode);
        myLinkedList.insertAtLast(myThirdNode);
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
        myLinkedList.insertAtLast(myFirstNode);
        myLinkedList.insertAtLast(mySecondNode);
        myLinkedList.insertAtLast(myThirdNode);
        myLinkedList.printMyNodes();

        myLinkedList.deleteFirst();
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void returnTrue_When_deleteLastElement_ByUsing_pop() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insertAtLast(myFirstNode);
        myLinkedList.insertAtLast(mySecondNode);
        myLinkedList.insertAtLast(myThirdNode);
        myLinkedList.printMyNodes();

        myLinkedList.popLast();
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }


    @Test
    public void given3Number_WhenSearched_ShouldPassTheLinkedListTest() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insertAtFirst(myThirdNode);
        myLinkedList.insertAtFirst(mySecondNode);
        myLinkedList.insertAtFirst(myFirstNode);

        myLinkedList.search(mySecondNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void returnTrueWhen_Inserting40After30__ShouldPassTheLinkedListTest() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(40);
        Node<Integer> myFourthNode = new Node<>(70);

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insertAtFirst(mySecondNode);
        myLinkedList.insertAtFirst(myFirstNode);
        myLinkedList.insertAtLast(myFourthNode);
        myLinkedList.search(mySecondNode);
        myLinkedList.printMyNodes();
        myLinkedList.insert(mySecondNode, myThirdNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.head.getNext().getNext().equals(myThirdNode) &&
                myLinkedList.tail.equals(myFourthNode);
        Assertions.assertTrue(result);
    }

}



