class LRUCache {
    class Node{
        int key, val;
        Node prev, next;
        Node (int k, int v) {key=k; val=v;}
    }

    int capacity;
    Map<Integer, Node> map;
    Node head, tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map = new HashMap<>();

        head  = new Node(0,0);
        tail = new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node =map.get(key);
        remove(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int val) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,val));
    }

    void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev= node.prev;
    }

    void insert(Node node){
        map.put(node.key, node);
        node.next= head.next;
        node.prev=head;
        head.next.prev =node;
        head.next=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */