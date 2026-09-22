// Last updated: 9/22/2026, 2:51:16 PM
class FrontMiddleBackQueue {
    Deque<Integer> dq;
    public FrontMiddleBackQueue() {
        dq = new ArrayDeque<>();
    }
    
    public void pushFront(int val) {
        dq.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        List<Integer> ll = new ArrayList<>(dq);
        ll.add(dq.size()/2, val);
        dq = new ArrayDeque<>(ll);
    }
    
    public void pushBack(int val) {
        dq.addLast(val);
    }
    
    public int popFront() {
        if(dq.isEmpty()) return -1;
        return dq.pollFirst();
    }
    
    public int popMiddle() {
        if(dq.isEmpty()) return -1;
        int ele = 0;
        ArrayList<Integer> li = new ArrayList<>(dq);
        if(dq.size() %2 == 0) {
            ele = li.remove(dq.size()/2 -1);
        }else{
           ele = li.remove(dq.size()/2); 
        }
        dq = new ArrayDeque<>(li);
        return ele;
    }
    
    public int popBack() {
        if(dq.isEmpty()) return -1;
        return dq.pollLast();  
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */