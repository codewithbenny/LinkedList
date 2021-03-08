package myinterfaces;

public interface MySinglyLinkedListADT {
    void addFirst(int element);
    boolean isEmpty();
    int size();
    void addLast(int element);
    void addLastWithoutUsingTail(int element);
    void traverse();
    int removeFirst();
    int removeLast();
    int first();
    int Last();
    boolean search(int searchElement);
    void addBefore(int element , int beforeNode);
    void addAfter(int element ,int afterNodeData);


}
