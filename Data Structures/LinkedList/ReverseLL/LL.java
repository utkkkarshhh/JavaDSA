class LL{

    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add a new node to the starting of the list!

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

// Add a new node to end of the list

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

    // Print all nodes 

    public void print(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    //Delete First Node 

    public void deleteFirst(){
        if(head == null ){
            System.out.println("This list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }
        else{
        size--;
        head = head.next;
        }
    }

    // Delete Last Node

    public void deleteLast(){
        if(head == null){
            System.out.println("This list is empty");
            return;
        }

        size--;

        if(head.next == null){
            head = null;
            return;
        }
        else{
            Node secondLast = head;
            Node lastNode = head.next;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }

    }

    // Get size of a linked list

    public int getSize(){
        return size;
    }

    //Reverse a linked list - Iterative Approach

    public void reverse(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            System.out.println("List only has one indice");
            return;
        }
        else{
            Node prevNode = null;
            Node currentNode = head;
    
            while(currentNode != null){
                Node nextNode = currentNode.next;
                currentNode.next = prevNode;
    
                //Update
    
                prevNode = currentNode;
                currentNode = nextNode;
            }

            head = prevNode;
            return;
        }
    }

    // Reverse a linked list - Recursive Approach

    public Node reverseRecursive(Node head){
        if (head == null){
            System.out.println("List is Empty");
            return null;
        }
        if(head.next == null){
            System.out.println("List only has one indice");
            return head;
        }
        else{
            Node newHead = reverseRecursive(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addFirst(10);
        list.addFirst(20);
        list.print();
        list.addLast(40);
        list.print();
        list.addFirst(30);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        System.out.println(list.getSize());
        list.print();
        list.addFirst(30);
        list.print();
        list.head = list.reverseRecursive(list.head);
        list.print();
    } 
}