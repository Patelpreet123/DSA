class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int x,int y){
            key=x;
            value=y;
            prev=null;
            next=null;
        }
    }
    Node h=new Node(-1,-1);
    Node t=new Node(-1,-1);
    int cap;
    HashMap<Integer,Node> m;
    public LRUCache(int capacity) {
        cap=capacity;
        h.next=t;
        t.prev=h;
        m=new HashMap<>();
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            Node tmp=m.get(key);
            tmp.prev.next=tmp.next;
            tmp.next.prev=tmp.prev;
            tmp.prev=h;
            tmp.next=h.next;
            h.next=tmp;
            tmp.next.prev=tmp;
            return tmp.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            Node tmp=m.get(key);
            tmp.value=value;
            tmp.prev.next=tmp.next;
            tmp.next.prev=tmp.prev;
            tmp.prev=h;
            tmp.next=h.next;
            h.next=tmp;
            tmp.next.prev=tmp;
        }
        else{
            if(cap==0){
                m.remove(t.prev.key);
                t.prev.prev.next=t;
                t.prev=t.prev.prev;
                cap++;
            }
            Node tmp=new Node(key,value);
            tmp.prev=h;
            tmp.next=h.next;
            h.next=tmp;
            tmp.next.prev=tmp;
            m.put(key,tmp);
            cap--;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna