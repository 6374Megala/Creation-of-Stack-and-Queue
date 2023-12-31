package org.example;

public class MyQueue {
    public INode head;
    public INode tail;
    public MyQueue() {
        this.head = null;
        this.tail = null;
    }
    public void addFirst(INode newFirstNode){
        if(this.head==null){
            this.head=newFirstNode;
        }
        if(this.tail==null){
            this.tail=newFirstNode;
        }
        else{
            this.tail.setNext(newFirstNode);
            this.tail=newFirstNode;
        }

    }
    public void printNode(){
        StringBuffer myNode=new StringBuffer("My Node is :");
        INode temp=head;
        while(temp.getNext()!=null){
            myNode.append(temp.getKey());
            if(!temp.equals(tail)){
                myNode.append("->");
            }
            temp=temp.getNext();
        }
        myNode.append(temp.getKey());
        System.out.println(myNode);
    }
    public INode poll(){
        if(this.head==null){
            return null;
        }
        INode temp=this.head;
        this.head=head.getNext();
        return temp;
    }
}
