class LinkedList {
    Node head;
    int length;

    public LinkedList() {
        head = null;
        length = 0;

    }

    public int get(int index) {
        //get(0) should return the value of the node at index 0
        Node curr = head;
        if(index < 0 || index >= length){
            return -1;
        }

        if(head == null){ 
            return -1;
        }

        for(int i = 0; i < index; i++){
            curr = curr.next;
        }

        return curr.data;

    }

    public void insertHead(int val) {
        //insertHead(0) should insert the node at the very beginning
        Node newNode = new Node(val);
        if(head == null){ 
            head = newNode;
            length++;
            return;
        } 

        newNode.next = head; //Make newNode point to whatever head's pointing to so that we dont lose the rest of the linked nodes while trying to make head point to the newNode.
        head = newNode;
        length++;
        return;

    }

    public void insertTail(int val) {
        //insertTail(0) should insert the node at the very end
        Node newNode = new Node(val);
        Node temp = head;

        if(head == null){
            head = newNode;
            length++;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode = null;
        length++;
        return;
    }

    public boolean remove(int index) {
        //remove(1) will remove the node at index 1
        Node temp = head;

        if(index < 0 || index >= length){
            return false;
        }

        if(index == 0){
            if (head != null) {
                head = head.next;
            }
            length--;
            return true;
        }

        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        length--;

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;

        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }

        return list;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}