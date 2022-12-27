public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        
        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {

        if(tail == null){
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        // newNode.next = null;
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void insert(int val, int idx) {

        if(idx == size){
            insertLast(val);
            return;
        }

        if(idx == 0){
            insertFirst(val);
            return;
        }

        Node temp = head;

        for(int i=0; i<idx; i++){
            temp=temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;

        size++;
    }

    public void display() {
        Node temp = head;
        temp = head;
        while(temp != null) {
            System.out.print(temp.val+" -> ");
            temp= temp.next;
        }
        System.out.print("Null");
    }

    // Node property
    private class Node {
        private int val;
        private Node next;

        // constructer-1 
        public Node(int val) {
            this.val = val;
        }

        // constructer - 2
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    } 

    public void deleteFirst() {
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail=null;
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteLast() {
        if(tail == head) {
            deleteFirst();
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertFirst(15);
        l.insertFirst(16);
        // l.insertFirst(17);
        // l.insertFirst(18);
        // l.insertLast(18);
        // l.insertLast(15);
        // l.insert(5, 3);
        // l.deleteFirst();
        l.display();
        System.out.println();
        l.deleteLast();
        l.display();
    }
}

