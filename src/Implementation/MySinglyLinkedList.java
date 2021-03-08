package Implementation;

import myinterfaces.MySinglyLinkedListADT;

public class MySinglyLinkedList implements MySinglyLinkedListADT {
    private  Node head;
    private Node tail;
    // No. of Elements in linked list
    private int size;
    // Constructor
    public MySinglyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    @Override
    public void addFirst(int element) {
        Node node=new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }else{
            node.setNext(head);
            head = node;
            size++;
        }

    }
    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addLast(int element) {
        Node node=new Node(element);
        if(isEmpty()){
            addFirst(element);
        }else {
            tail.setNext(node);
            tail = node;
            size++;
        }

    }

    @Override
    public void addLastWithoutUsingTail(int element) {
        Node node =new Node(element);
       if(isEmpty()){
           head=node;
           tail=node;
       }else{
           // traverse till you find the next node
           Node temp=head;
           while(temp.getNext()!=null){
               //  Update the value of temp

               //this process is known as link hopping or pointer hopping'
               temp=temp.getNext();

           }
           temp.setNext(node);
           tail=node;
       }
    }

    @Override
    public void traverse() {
        System.out.println();
        if(!isEmpty()){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.getData()+"-->");
                temp=temp.getNext();
            }
            System.out.println("null");
        }else{
            System.out.println("empty list");
        }
    }

    @Override
    public int removeFirst() {
        int response = 0;
        if(!isEmpty()){
            // Single node
            response= head.getData();
           // size--;
            if(head ==tail){
                head=null;
                tail=null;
            }
            // multiple node
            else {
                head = head.getNext();
            }
            size--;
        }
      return response;
    }

    @Override
    public int removeLast() {
        // Removing Last node using 2 Pointer method
        int response = 0;
        if(!isEmpty()){
            // Single node
            response= tail.getData();
            if(head==tail){
                head=null;
                tail=null;
            }
            // Multiple Nodes
            else{
                Node temp=head;
                Node previous=null;
                while(temp.getNext()!=null){
                    previous=temp;
                    temp=temp.getNext();
                }
                previous.setNext(null);
                tail=previous;
            }
            size --;
        }


        return response;
    }

    @Override
    public int first() {
        if(isEmpty())
        {
            return 0;// Considering 0 is invalid
        }else {
            return head.getData();
        }

        // Another Way
//        int response = 0;
//        if(!isEmpty()){
//            response= head.getData();
//        }
//        return 0;

    }

    @java.lang.Override
    public int Last() {
        int response=0;
        if(!isEmpty()){
            response= tail.getData();
        }
        return response;
    }

    @java.lang.Override
    public boolean search(int searchElement) {
        boolean response=false;
        Node temp=head;
        while (temp!=null){
            if(temp.getData()==searchElement){
                response=true;
                break;
            }else{
                temp=temp.getNext();
            }
        }

        return response;
    }

    @Override
    public void addBefore(int element, int beforeNode) {
     Node temp = head;
     Node previous = null;
     while (temp !=null){
         if(temp.getData()== beforeNode){
             break;
         }else {
             previous =temp;
             temp = temp.getNext();
         }
     }
     if(temp!=null){
         Node node =new Node(element);
         node.setNext(temp);
         if(previous == null){
             //adding at head
             head = node;
         }
         else{
             previous.setNext(node);
         }
         size ++;
     }
    }

    @Override
    public void addAfter(int element, int afterNodeData) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == afterNodeData) {
                break;
            }
            temp = temp.getNext();
        }
        if (temp != null) {
            Node node = new Node(element);
            node.setNext(temp.getNext());
            temp.setNext(node);

            size++;
            //check if temp is last node, then tail must refer to node
            if (temp == tail) {
                tail = node;
            }
        }
    }

    public Node getLastNodeDataWithoutUsingTail() {
        Node temp = head;
        if (isEmpty()) {
            return null;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            // System.out.println(temp.getData());
            return temp.getNext();
        }
    }
    public int getLastNodeWithoutUsingTail(){
        Node temp=head;
        if(isEmpty()){
            return 0;
        }else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
           // System.out.println(temp.getData());
            return temp.getData();
        }


    }
}
