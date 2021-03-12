import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeTest {
    Node<Integer> node;
    @Test
    public void given3Number_WhenLinkedShould_PaasLinkedListTest() {
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
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);

        Assertions.assertTrue(result);
    }

}



