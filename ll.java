public class ll {

    private Node head;
    private Node tail;

    private int size;

    public ll(){
        this.size = 0;
    }

    

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
       
    } 
     public  void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size++;
        


    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END..");
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertNth(int value,int index){
        if(index == 0){
            insertFirst(value);
            return;

        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public static void main(String[] args) {
        ll list = new ll();

        list.insertFirst(3);
         list.insertFirst(5);
          list.insertFirst(7);
           list.insertFirst(8);
            list.insertFirst(3);

        list.insertLast(99);
        list.insertNth(54, 3);


            list.display(); 
    }
    
}
