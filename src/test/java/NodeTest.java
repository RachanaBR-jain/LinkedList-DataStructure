import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeTest {
    Node<Integer> node;
    @Test
    public void given3Number_WhenLinkedShould_PaasLinkedListTest() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        node.printKeys(myFirstNode.getKey());
        node.printKeys(mySecondNode.getKey());
        node.printKeys(myThirdNode.getKey());
        Assertions.assertTrue(result);
    }


}
