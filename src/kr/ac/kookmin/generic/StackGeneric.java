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
		T temp = top.getData();		// 임의의 변수에 top이 가르키고 있는 데이터를 저장.
		top = top.getNext();		// top을 밑으로 내려

		return temp;
	}

	public void push(T d) {
		if (top == null) {		// top이 아무것도 가르키고 있지 않을 때
			top = new Node<T>(d);		// 새로운 node를 만들고 top이 새로운 node를 가르키도록 한다.
		} else {
			Node<T> newNode = new Node<T>(d);		// 새로운 node를 만들어 데이터 저장.
			newNode.setNext(top);		// 새로운 node와 이전의 node를 연결
			top = newNode;		// top이 새로운 node를 가르키도록 한다.
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
