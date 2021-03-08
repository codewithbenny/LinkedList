package Implementation;

public class MainSinglyLinkedList {
    public static void main(String[] args){
        MySinglyLinkedList linkedList=new MySinglyLinkedList();
         linkedList.addFirst(30);
         linkedList.addFirst(20);
         linkedList.addFirst(10);
         linkedList.traverse();
         linkedList.addBefore(200,20);
         linkedList.traverse();



    }
}
