class LinkedList {
    Node head;
    int length;

    public LinkedList() {
            head = null;
            length = 0;
    }

    public int get(int index) {
        if(index<0 || index >=length){
            return -1;
        }

        Node curr = head;
        if (curr == null){
            return -1;
        }

        for(int i = 0; i < index; i++){
            curr = curr.next;
        }

        return curr.data;   
    }

    public void insertHead(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;
        length++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        Node temp = head;

        if (head == null) {
            head = newNode;
            length++;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        length++;
    }

    public boolean remove(int index) {
        Node temp = head;

        if (index < 0 || index >= length)
            return false;

        if(temp == null){
            return false; //nothing to remove
        }

        if(index==0){
            head = head.next;
            length--;
            return true;
        }

        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        length--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        int i = 0;

        //6 -> 2 -> 3 -> 4 -> 7
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
            i++;
        }

        return list;
    }
}

class Node{
    int data;
    Node next;

    //Initializing the constructor 
    public Node(int data){ 
        this.data = data;
        this.next = null;
    }

}
