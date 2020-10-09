package queue;

public class QueueDemo1 {

    public static void main(String[] args) {
	ArrayQueue q = new ArrayQueue(5);
	q.enqueu(3);
	q.enqueu(9);
	q.enqueu(5);
	q.enqueu(92);
	q.enqueu(51);
	q.enqueu(91);
	q.enqueu(51);
	q.disp();

	// System.out.println("\n" + q.dequeue());
	q.dequeue();
	q.dequeue();
	q.dequeue();

	q.disp();
    }

}

class ArrayQueue {
    int[] data;
    final int cap;
    int size;

    public ArrayQueue(int cap) {
	this.cap = cap;
	size = 0;
	data = new int[cap];
    }

    void enqueu(int x) {
	if (size == cap)
	    return;
	data[size++] = x;
    }

    int dequeue() {
	if (size == 0)
	    return -1;
	int f = data[0];

	for (int i = 0; i < size - 1; i++) {
	    data[i] = data[i + 1];
	}
	size--;
	return f;
    }

    int front() {
	if (size == 0)
	    return -1;
	return 0;
    }

    int rear() {
	if (size == 0)
	    return -1;
	return size - 1;
    }

    void disp() {
	System.out.println();
	for (int i = 0; i < size; i++) {
	    System.out.print(" " + data[i]);
	}
    }

}