package io.github.devvratplus.java.concepts.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class UnderstandingArrayBlockingQueue {
	public static void main(String[] args) {
		
		/*
		 * (tail) -> oooooooooooo -> (head)
		 * Queue is a FIFO structure > First in First out
		 * 
		 * ArrayBlockingQueue is a type of a queue
		 * which can only be created with a fixed capacity
		 */
		
		int queueCapacity = 5;
		Queue<Integer> abq = new ArrayBlockingQueue<Integer>(queueCapacity);
		
		//adding elements to a queue
		abq.add(1);
		abq.add(2);
		abq.add(3);
		abq.add(4);
		abq.add(5);
		
		//trying to add element post queue is at its full capacity 
		try{
			abq.add(6);
		} catch (IllegalStateException e){
			System.out.println("You have exceded the total capacity of the Queue i.e. " + queueCapacity );
		}
		
		// printing the queue using for-each
		System.out.println("\nHere are the elements in the queue");
		System.out.print("(head) ");
		for(Integer i1 : abq){
			System.out.print(i1 + " <- ");
		}
		System.out.println("(tail)");
		
		// removing few elements from the queue
		// since its fifo structure, elements will be removed
		// from the head
		abq.remove();
		abq.remove();
		
		
		// printing the queue using iterator
		Iterator<Integer> i = abq.iterator();
		System.out.println("\nHere are the elements in the queue");
		System.out.print("(head) ");
		while(i.hasNext()){
			System.out.print(i.next() + " <- ");
		}
		System.out.println("(tail)");
		
		// printing the head of the queue
		System.out.print("\nHead of the queue is > ");
		System.out.println(abq.peek());
		
		// removing the head of the queue
		System.out.println("\nRemoving the head of the queue > " + abq.poll());
		
		// printing the head of the queue now
		System.out.print("\nHead of the queue now is > ");
		System.out.println(abq.peek());
		
		// removing all the elements of the queue
		abq.remove();
		abq.remove();
		
		//on trying to remove an element from a blank queue
		try {
			abq.remove();
		} catch (NoSuchElementException e){
			System.out.println("\nQueue is empty you cannot remove anymore elements!");
		}
		
		System.out.println("\nAdding elements to the queue again");
		//adding elements to a queue using offer
		// which doesnt throw an exception on trying to add
		// elements once the queue is at its full capacity
		abq.offer(1);
		abq.offer(2);
		abq.offer(3);
		abq.offer(4);
		abq.offer(5);
		abq.offer(6); // this would throw an exception
		
		// removing all the elements from the queue using removeAll
		
		abq.removeAll(abq);
		// printing the queue using for-each
		if(abq.isEmpty()){
			System.out.println("\nQueue is empty!");
		}
		
	}

}
