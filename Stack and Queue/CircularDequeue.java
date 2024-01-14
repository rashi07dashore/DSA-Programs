class MyCircularDeque {
    int data[];
    int front = -1, end = -1;
    int size = 0;

    public MyCircularDeque(int k) {
        this.data = new int[k];
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            front = end = 0;
        } else {
            front = (front - 1 + data.length) % data.length;
        }
        data[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            front = end = 0;
        } else {
            end = (end + 1) % data.length;
        }
        data[end] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (front == end) {
            front = end = -1;
        } else {
            front = (front + 1) % data.length;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (front == end) {
            front = end = -1;
        } else {
            end = (end - 1 + data.length) % data.length;
        }
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return data[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return data[end];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}

