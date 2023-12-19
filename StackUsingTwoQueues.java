package GeeksForGeeks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	
	
	void push(int x) {
		q1.add(x);
	}
	
	int pop() {
		if(q1.isEmpty() && q2.isEmpty()) {
			return -1;
		}
		
		while(q1.size()>1) {
			q2.add(q1.remove());
		}
		
		int pop=q2.remove();
		
	Queue <Integer> temp=q1;
	q1=q2;
	q2=temp;
	
	return pop;
	}
	
}
