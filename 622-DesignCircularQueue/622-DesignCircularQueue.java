// Last updated: 9/22/2026, 2:56:03 PM
class MyCircularQueue {
    int[] arr;
    int head; 
    int tail;
    int elcount;
    int capacity;

    public MyCircularQueue(int k) {
        arr = new int[k];
        head =0;
        tail = -1;
        capacity = k;

    }
    
    public boolean enQueue(int value) {
    if(isFull()) return false;
    
    tail = (tail+1)%capacity;
    arr[tail] = value;
    elcount++;
    return true;
     
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        elcount--;
        head = (head+1)%capacity;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return arr[head];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[tail];
    }
    
    public boolean isEmpty() {
     return elcount == 0;
    }
    
    public boolean isFull() {
       return elcount == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */