package lesson016;

import java.util.Stack;

public class StackOrnek {

	public static void main(String[] args) {

		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		int toplam=0;
		stack1.push(2);
		stack1.push(135);
		stack1.push(90);
		stack1.push(150);
		stack1.push(120);
		stack1.push(8);
		
		// 100den küçük değerleri toplayıp stackten çıkaralım
		// 100den büyükleride farklı bir stack içine atalım
		// toplam ve yeni stack yazdıralım
		while (!stack1.isEmpty()) {
			for (int i = 0; i < stack1.size(); i++) {
				if (stack1.peek()<100) {
					toplam+=stack1.pop();
				}else {
					stack2.add(stack1.pop());
				}
			}
		}
		
		System.out.println(stack2);
		System.out.println(toplam);
		
		
	}

}
