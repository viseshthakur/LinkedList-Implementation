


class LinkedList{

	private class Node{
		String value;
		Node next;
	}

	private Node head = null;
	private Node tail = null;
	private int size = 0;


	public void insertAtEnd(String value){
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

	public void insertAtFront(String value){
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


	public String removeAtEnd(){



		Node temp = head;
		while(temp.next != null){
			if(temp.next.next == null){
				tail = temp;
				String value = temp.next.value;
				tail.next = null;
				size--;
				return value;
			}
			temp = temp.next;
		}
		return null;
	}

	public String removeAtFront(){
		String value = head.value;
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



	public void push(String value){
		insertAtFront(value);
	}


	public String pop(){
		return removeAtFront();
	}

	public void enqueue(String value){
		insertAtFront(value);
	}

	public String dequeue(){
		return removeAtEnd();
	}



	public static void main(String[] args) {

		// LinkedList l = new LinkedList();

		// l.insertAtFront("a");
		// l.insertAtEnd("b");
		// l.insertAtFront("c");
		// l.insertAtFront("d");
		// l.insertAtEnd("e");
		// l.removeAtFront();
		// l.removeAtEnd();


		// LinkedList stack = new LinkedList();
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


		// LinkedList queue = new LinkedList();
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