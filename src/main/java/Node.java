public class Node <K> implements INode <K> {
    private K key;
    private INode<K> next ;

    public Node(K key) {
        this.key = key ;
        this.next = null ;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }
    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = (Node<K>) next;
    }

    public static <K> K printKeys(K key) {
        System.out.println(" key is:" + key);
        return key;
    }
}
