package queue;

class LinkedQueue{
	
	Node front;
	int size;
	
	public static void main(String... args){
		
		LinkedQueue q = new LinkedQueue();
		q.enque(30);
		q.enque(67);
		q.enque(87);
		q.disp();
		q.deque();
		q.deque();
		q.deque();
		q.disp();

		
	}
	
	void enque(int x){
		if(size == 0){
			front = new Node(x);
		}else{
			Node n1 = front;
			while(n1.next!=null){
				n1 = n1.next;
			}
			n1.next = new Node(x);
		}		
		size++;
	}
	
	int deque(){
		if(size == 0)
			return -1;
		Node x = front;
		front = front.next;
		size--;
		return x.data;
	}
	
	void disp(){
		System.out.print("\n===>");
		Node x = front;
		while(x!=null){
			System.out.print(" "+x.data);
			x = x.next;
		}
	}
	
}

class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}	
}