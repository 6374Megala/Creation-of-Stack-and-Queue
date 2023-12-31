import org.example.INode;
import org.example.MyStack;
import org.example.MyNode;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void createStackLinkedListUC1() {
        MyNode<Integer> node1 = new MyNode(70);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(50);
        MyStack myList = new MyStack();
        myList.push(node1);
        myList.push(node2);
        myList.push(node3);
        myList.printNode();
        System.out.println(myList.size());
        System.out.println(myList.isEmpty(node1));
    }
    @Test
    public void peeKpopOperationUC2() {
        MyNode<Integer> node1 = new MyNode(70);
        MyNode<Integer> node2 = new MyNode(30);
        MyNode<Integer> node3 = new MyNode(50);
        MyStack myList = new MyStack();
        myList.push(node1);
        myList.push(node2);
        myList.push(node3);
        myList.printNode();
        while(true){
            if(myList.head==null || myList.tail==null){
                break;
            }
            INode peekNode=myList.peek();
            System.out.println("The peek element is : "+peekNode.getKey());
            INode popNode=myList.pop();
            System.out.println("The peek element is : "+popNode.getKey());

        }

    }
}
