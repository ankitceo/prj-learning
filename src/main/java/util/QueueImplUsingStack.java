package util;

import java.util.Stack;

public class QueueImplUsingStack {
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {

		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);

		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
	}

	public static void enQueue(int n) {
		while(!stack1.isEmpty()) {
			stack2.push((int) stack1.pop());
		}
		stack1.push(n);
		while(!stack2.isEmpty()) {
			stack1.push((int) stack2.pop());
		}
	}
	
	public static int deQueue() {
		return (int) stack1.pop();
	}
	
}
