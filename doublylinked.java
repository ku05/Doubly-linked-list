import java.utli.*;
public class doublylinked {
    class Node{
        int data;
        Node next;
        Node prev;
    Node(int data){
        this.data=data;
    }
    }
    Node head,temp,tail,newNode,prevnode,currnode,nextnode;
    public void create(int x){
        Node newNode=new Node(x);
        newNode.prev=null;
        newNode.next=null;
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void display(){
        temp=head;
        System.out.println("The doubly linkedlist is :");
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void addfirst(int x){
        Node newNode=new Node(x);
        newNode.prev=null;
        newNode.next=null;
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
    public void addlast(int x){
        Node newNode=new Node(x);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void addpos(int pos,int x){
        Node newNode=new Node(x);
        int i=1;
        temp=head;
            while(i<pos){
                temp=temp.next;
                i++;
            }
            newNode.prev=temp;
            newNode.next=temp.next;
            temp.next=newNode;
            newNode.next.prev=newNode;
        
    }
    public static void main(String agrs []){
        doublylinked list=new doublylinked();
        list.create(2);
        list.create(3);
        list.create(5);
        list.display();
        list.addfirst(1);
        list.display();
        list.addlast(6);
        list.display();
        list.addpos(3,4);
        list.display();
    }

}