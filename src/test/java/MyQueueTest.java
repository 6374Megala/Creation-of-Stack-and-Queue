import org.example.INode;
import org.example.MyNode;
import org.example.MyQueue;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void createStackLinkedListUC1() {
        MyNode<Integer> node1 = new MyNode(50);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(70);
        MyQueue queue = new MyQueue();
        queue.addFirst(node1);
        queue.addFirst(node2);
        queue.addFirst(node3);
        queue.printNode();
    }
    @Test
    public void pollOperationUC2() {
        MyNode<Integer> node1 = new MyNode(50);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(70);
        MyQueue queue = new MyQueue();
        queue.addFirst(node1);
        queue.addFirst(node2);
        queue.addFirst(node3);
        queue.printNode();
        INode deletedNode=queue.poll();
        System.out.println(deletedNode.getKey());
        queue.printNode();
    }

}
