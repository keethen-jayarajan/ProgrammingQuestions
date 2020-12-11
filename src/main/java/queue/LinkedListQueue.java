package queue;

// YOUR CODE GOES HERE
class LinkedListQueue <T>{
    class DLLNode {
		public T name;
		public DLLNode next;
        public DLLNode prev;
        
    }
    
    private DLLNode head = null;
    private DLLNode tail = null;
    
    public void enqueue(T name){
        DLLNode newNode = new DLLNode();
        newNode.name = name;
        newNode.next = tail.next;
        tail = newNode;
    }

    public void dequeue(){
        head = null;
    }

    public int size(){
        int size = 0;
        DLLNode current = tail.next;
		while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty(){
        if (head.prev == tail){
            return true;
        }
        else{
            return false;
        }
    }
}
