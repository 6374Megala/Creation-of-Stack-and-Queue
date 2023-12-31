package org.example;

public class MyStack {


    public INode head;
    public INode tail;
    public MyStack() {
        this.head = null;
        this.tail = null;
    }


    public void push(INode newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }
        else{
            INode temp=this.head;
            this.head=newNode;
            this.head.setNext(temp);
        }
    }
    public INode peek(){
        return head;
    }
    public INode pop(){
        INode temp=this.head;
        if(this.head==null || this.tail==null|| temp.equals(null)){
            return null;
        }

        this.head=head.getNext();
        return temp;
    }

    public Integer size(){
        if(head==null){
            return 0;
        }
        Integer length=1;
        INode temp=head;
        while(temp.getNext()!=null){
            length+=1;
            temp=temp.getNext();
        }
        return length;

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


    public boolean isEmpty(INode head){
        if(head==null){
            return true;
        }
        return false;
    }
}
