


class LinkedListGeneric<T>{

	private class Node{
		T value;
		Node next;
	}

	private Node head = null;
	private Node tail = null;
	private int size = 0;


	public void insertAtEnd(T value){
		if(head == null){
			head = new Node();
			head.value = value;
			tail = head;
			size++;
			return;
		}

		Node temp = new Node();
		temp.value = value;
		tail.next = temp;
		tail = tail.next;
		size++;


	}

	public void insertAtFront(T value){
		if (head == null) {
			head = new Node();
			head.value = value;
			tail = head;
			size++;

			return;
		}

		Node temp = new Node();
		temp.value = value;
		temp.next = head;
		head = temp;
		size++;

	}


	public T removeAtEnd(){



		Node temp = head;
		while(temp.next != null){
			if(temp.next.next == null){
				tail = temp;
				T value = temp.next.value;
				tail.next = null;
				size--;
				return value;
			}
			temp = temp.next;
		}
		return null;
	}

	public T removeAtFront(){
		T value = head.value;
		head = head.next;
		size--;
		return value;

	}

	public String toString(){
		String res = "";
		Node temp = head;
		while(temp!=null){
			res+=temp.value+" ";
			temp = temp.next;
		}
		return res;
	}



	public void push(T value){
		insertAtFront(value);
	}


	public T pop(){
		return removeAtFront();
	}

	public void enqueue(T value){
		insertAtFront(value);
	}

	public T dequeue(){
		return removeAtEnd();
	}



	public static void main(String[] args) {

		LinkedListGeneric<Integer> l = new LinkedListGeneric<Integer>();

		l.insertAtFront(1);
		l.insertAtEnd(2);
		l.insertAtFront(3);
		l.insertAtFront(4);
		l.insertAtEnd(5);
		l.removeAtFront();
		l.removeAtEnd();

		System.out.println(l);


		// LinkedListGeneric stack = new LinkedListGeneric();
		// stack.push("a");
		// stack.push("b");
		// stack.push("c");
		// stack.push("d");
		// stack.push("e");
		// stack.push("f");
		// stack.pop();
		// System.out.println(stack);
		// stack.pop();
		// System.out.println(stack);


		// LinkedListGeneric queue = new LinkedListGeneric();
		// queue.enqueue("a");
		// queue.enqueue("b");
		// queue.enqueue("c");
		// queue.enqueue("d");
		// queue.enqueue("e");
		// queue.enqueue("f");

		// System.out.println(queue.dequeue());
		// System.out.println(queue);


		// System.out.println(stack);
	}
}