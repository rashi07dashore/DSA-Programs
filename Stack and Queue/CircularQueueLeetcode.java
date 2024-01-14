class MyCircularQueue {
    int data[];
    int front=-1, end=-1;
    int size=0;
    public MyCircularQueue(int k) {
        this.data = new int[k];

    }
    
    public boolean enQueue(int value) {
        if(isFull())
       {
        return false;
       }
       else if(size==0)
        {
            front=end=0;
            data[0]=value;
            size++;
            return true;
        }
        else if(end < data.length-1)
        {
            data[++end]=value;
            size++;
            return true;
        }
        else if(end==data.length-1)
        {
            end=0;
            data[0]=value;
            size++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        int a = data[front++];  //removing from front
        front= front % data.length;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return data[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return data[end];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size== data.length; 
    }
}