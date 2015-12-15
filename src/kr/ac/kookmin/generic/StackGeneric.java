package kr.ac.kookmin.generic;

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}

class Stack<T> {
	Node<T> top;

	public T pop() {
		T temp = top.getData();
		top = top.getNext();

		return temp;
	}

	public void push(T d) {
		if (top == null) {
			top = new Node<T>(d);
		} else {
			Node<T> newNode = new Node<T>(d);
			newNode.setNext(top);
			top = newNode;
		}
	}
}

class Node<T> {
	Node<T> next;
	T data;

	public Node(T d) {
		data = d;
	}

	public T getData() {
		return data;
	}

	public void setNext(Node<T> n) {
		next = n;
	}

	public Node<T> getNext() {
		return next;
	}

}
