package GeeksForGeeks;

import java.util.Stack;

public class QueueUsingStack {
Stack<Integer> input =new Stack<Integer>();
Stack<Integer> output =new Stack<Integer>();

int dequeue() {
	if(input.isEmpty() && output.isEmpty()) {
		return -1;
	}
	
	if(output.isEmpty()) {
		output.push(input.pop());
	}
	
	return output.pop();
}

void enqueue(int x) {
	input.push(x);
}
}
