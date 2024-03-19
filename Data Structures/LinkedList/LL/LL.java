package LL;
class LL {

    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Create a new node
        
    // Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode; 
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode; 
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print List
    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Delete a node

    // Delete First
    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        if(head.next== null){
            head = null;
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last

    public void deleteLast(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }

        size--;

        if(head.next== null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addFirst(10);
        list.addFirst(20);
        list.print();
        list.addLast(10);
        list.print();
        list.addFirst(30);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        System.out.println("Size of Linked List =>" + list.getSize());
        list.addFirst(30);
        list.print();
        System.out.println("Size of Linked List =>" + list.getSize());
        
    }
}